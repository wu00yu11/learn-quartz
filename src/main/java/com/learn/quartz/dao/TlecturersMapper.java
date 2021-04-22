package com.learn.quartz.dao;

import com.learn.quartz.model.Tlecturers;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TlecturersMapper extends BaseMapper<Tlecturers> {
    @Update("update lecturers SET common_push_count = 0,go_index_num = top_limit")
    void resetLecturerConfig();

    @Update("UPDATE lecturers l LEFT JOIN ( SELECT vlke,lke,lid FROM ( SELECT sum(ls.like_count) AS lke,sum(ls.view_count) AS vlke,ls.lecturer_id AS lid FROM lecturer_feeds ls WHERE DATE_ADD(ls.created_at,INTERVAL 8 HOUR)>=DATE_SUB(now(),INTERVAL 1 WEEK) AND DATE_ADD(ls.created_at,INTERVAL 8 HOUR)<=NOW() GROUP BY ls.lecturer_id) b GROUP BY lid) c ON l.id=c.lid  SET l.week_view_count=c.vlke,l.week_like_count=c.lke")
    void countLecturerWeekCount();

    @Update("UPDATE lecturers l LEFT JOIN ( SELECT lke,lid FROM (  SELECT sum(ls.like_count) AS lke,ls.lecturer_id AS lid FROM pub_articles ls LEFT JOIN lecturers ll ON ls.lecturer_id = ll.id  WHERE DATE_ADD(ls.created_at,INTERVAL 8 HOUR)>=DATE_SUB(now(),INTERVAL 1 WEEK) AND DATE_ADD(ls.created_at,INTERVAL 8 HOUR)<=NOW() AND ll.relation = 0  GROUP BY ls.lecturer_id) b GROUP BY lid) c ON l.id=c.lid  SET l.week_like_count=c.lke WHERE l.relation=0")
    void countLecturerRe2WeekCount();

    List<HashMap<String,Object>> lecturerCountData();
    List<Map<String,String>> queryBigVLecturers();

    @Select("SELECT count(0) \n" +
            "FROM pub_messages pm \t\n" +
            "WHERE 1=1 AND pm.category  in (1,3,4) AND pm.created_at < #{createdAt}  \n" +
            "ORDER BY pm.id desc")
    int countHistoryMsgNum(String createdAt);
    @Delete("DELETE FROM pub_messages  WHERE category  in (1,3,4) AND created_at < #{createdAt}  limit #{delNum}")
    void deletePubMessage(@Param("delNum") Integer delNum, @Param("createdAt") String createdAt);

}