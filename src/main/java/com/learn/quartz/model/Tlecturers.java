package com.learn.quartz.model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "`lecturers`")
public class Tlecturers extends BaseEntity {
    @Id
    private Integer id;

    /**
     * 讲师姓名
     */
    private String name;

    /**
     * 讲师是否可发言
     */
    private Boolean is_talkable;

    private Boolean is_blocked;

    /**
     * 是否可收费
     */
    private Boolean is_charged;

    private Boolean is_coworker;

    private Date created_at;

    private Date updated_at;

    /**
     * 身份（0代发， 1收费， 2免费， 3官方）
     */
    private Integer relation;

    /**
     * 总发言次数
     */
    private Integer all_talk_count;

    /**
     * 日发言次数
     */
    private BigDecimal day_talk_count;

    /**
     * 最后一次发言时间
     */
    private Date last_talk_at;

    /**
     * 地址
     */
    private String address;

    /**
     * 邀请码
     */
    private String invite_code;

    /**
     * 是否直通车
     */
    private Boolean is_ztc;

    private Boolean has_treaty;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 身份证
     */
    private String id_code;

    private Integer spn;

    /**
     * 登录名称
     */
    private String logname;

    private String qq;

    private String qualification;

    /**
     * 头衔
     */
    private String title;

    /**
     * 是否可上线
     */
    private Boolean is_online;

    /**
     * 置顶条数
     */
    private Integer top_limit;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 最后一条内容ID
     */
    private Integer last_feed_id;

    /**
     * 最后一条内容时间
     */
    private Date last_feed_at;

    /**
     * 是否官方账号
     */
    private Boolean is_office;

    /**
     * 粉丝数量
     */
    private Integer fans_count;

    /**
     * 讲师标记（金牌，银牌，铜牌）
     */
    private Integer flag;

    /**
     * 关注后是否自动回复
     */
    private Boolean is_auto_reply;

    /**
     * 管理员是否禁止自动回复
     */
    private Boolean admin_forbidden_auto_reply;

    /**
     * 昨日阅读量
     */
    private Integer yesterday_view_count;

    /**
     * 是否内部讲师
     */
    private Boolean is_internal;

    /**
     * 是否金投顾讲师
     */
    private Boolean is_jtg;

    /**
     * 付款渠道
     */
    private Integer pay_channel;

    /**
     * 人气
     */
    private Integer popularity;

    /**
     * 周阅读量
     */
    private Integer week_view_count;

    /**
     * 周点赞量
     */
    private Integer week_like_count;

    /**
     * 执业证书编号
     */
    private String practice_no;

    /**
     * 上首页条数
     */
    private Integer go_index_num;

    /**
     * 是否新兰德讲师
     */
    private Boolean is_xld;

    /**
     * 投顾名称
     */
    private String invester_name;

    /**
     * 是否可上传vip视频
     */
    private Boolean allow_charge_video;

    /**
     * 是否允许视频直播
     */
    private Boolean allow_live_video;

    /**
     * 视频封面图片
     */
    private String poster;

    private BigDecimal sharing_rate;

    private Boolean is_consulting_stock;

    private Integer smart_view_count;

    private Integer vip_push_count;

    private Integer common_push_count;

    /**
     * 推送上限条数
     */
    private Integer push_limit;

    /**
     * 讲师UUID
     */
    private String lecturer_uuid;

    /**
     * 讲师简介
     */
    private String intro;

    private String remark;

    /**
     * 签名
     */
    private String my_signature;

    /**
     * 自动回复内容
     */
    private String auto_reply;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取讲师姓名
     *
     * @return name - 讲师姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置讲师姓名
     *
     * @param name 讲师姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取讲师是否可发言
     *
     * @return is_talkable - 讲师是否可发言
     */
    public Boolean getIs_talkable() {
        return is_talkable;
    }

    /**
     * 设置讲师是否可发言
     *
     * @param is_talkable 讲师是否可发言
     */
    public void setIs_talkable(Boolean is_talkable) {
        this.is_talkable = is_talkable;
    }

    /**
     * @return is_blocked
     */
    public Boolean getIs_blocked() {
        return is_blocked;
    }

    /**
     * @param is_blocked
     */
    public void setIs_blocked(Boolean is_blocked) {
        this.is_blocked = is_blocked;
    }

    /**
     * 获取是否可收费
     *
     * @return is_charged - 是否可收费
     */
    public Boolean getIs_charged() {
        return is_charged;
    }

    /**
     * 设置是否可收费
     *
     * @param is_charged 是否可收费
     */
    public void setIs_charged(Boolean is_charged) {
        this.is_charged = is_charged;
    }

    /**
     * @return is_coworker
     */
    public Boolean getIs_coworker() {
        return is_coworker;
    }

    /**
     * @param is_coworker
     */
    public void setIs_coworker(Boolean is_coworker) {
        this.is_coworker = is_coworker;
    }

    /**
     * @return created_at
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     * @return updated_at
     */
    public Date getUpdated_at() {
        return updated_at;
    }

    /**
     * @param updated_at
     */
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * 获取身份（0代发， 1收费， 2免费， 3官方）
     *
     * @return relation - 身份（0代发， 1收费， 2免费， 3官方）
     */
    public Integer getRelation() {
        return relation;
    }

    /**
     * 设置身份（0代发， 1收费， 2免费， 3官方）
     *
     * @param relation 身份（0代发， 1收费， 2免费， 3官方）
     */
    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    /**
     * 获取总发言次数
     *
     * @return all_talk_count - 总发言次数
     */
    public Integer getAll_talk_count() {
        return all_talk_count;
    }

    /**
     * 设置总发言次数
     *
     * @param all_talk_count 总发言次数
     */
    public void setAll_talk_count(Integer all_talk_count) {
        this.all_talk_count = all_talk_count;
    }

    /**
     * 获取日发言次数
     *
     * @return day_talk_count - 日发言次数
     */
    public BigDecimal getDay_talk_count() {
        return day_talk_count;
    }

    /**
     * 设置日发言次数
     *
     * @param day_talk_count 日发言次数
     */
    public void setDay_talk_count(BigDecimal day_talk_count) {
        this.day_talk_count = day_talk_count;
    }

    /**
     * 获取最后一次发言时间
     *
     * @return last_talk_at - 最后一次发言时间
     */
    public Date getLast_talk_at() {
        return last_talk_at;
    }

    /**
     * 设置最后一次发言时间
     *
     * @param last_talk_at 最后一次发言时间
     */
    public void setLast_talk_at(Date last_talk_at) {
        this.last_talk_at = last_talk_at;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取邀请码
     *
     * @return invite_code - 邀请码
     */
    public String getInvite_code() {
        return invite_code;
    }

    /**
     * 设置邀请码
     *
     * @param invite_code 邀请码
     */
    public void setInvite_code(String invite_code) {
        this.invite_code = invite_code == null ? null : invite_code.trim();
    }

    /**
     * 获取是否直通车
     *
     * @return is_ztc - 是否直通车
     */
    public Boolean getIs_ztc() {
        return is_ztc;
    }

    /**
     * 设置是否直通车
     *
     * @param is_ztc 是否直通车
     */
    public void setIs_ztc(Boolean is_ztc) {
        this.is_ztc = is_ztc;
    }

    /**
     * @return has_treaty
     */
    public Boolean getHas_treaty() {
        return has_treaty;
    }

    /**
     * @param has_treaty
     */
    public void setHas_treaty(Boolean has_treaty) {
        this.has_treaty = has_treaty;
    }

    /**
     * 获取真实姓名
     *
     * @return realname - 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实姓名
     *
     * @param realname 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取身份证
     *
     * @return id_code - 身份证
     */
    public String getId_code() {
        return id_code;
    }

    /**
     * 设置身份证
     *
     * @param id_code 身份证
     */
    public void setId_code(String id_code) {
        this.id_code = id_code == null ? null : id_code.trim();
    }

    /**
     * @return spn
     */
    public Integer getSpn() {
        return spn;
    }

    /**
     * @param spn
     */
    public void setSpn(Integer spn) {
        this.spn = spn;
    }

    /**
     * 获取登录名称
     *
     * @return logname - 登录名称
     */
    public String getLogname() {
        return logname;
    }

    /**
     * 设置登录名称
     *
     * @param logname 登录名称
     */
    public void setLogname(String logname) {
        this.logname = logname == null ? null : logname.trim();
    }

    /**
     * @return qq
     */
    public String getQq() {
        return qq;
    }

    /**
     * @param qq
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * @return qualification
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * @param qualification
     */
    public void setQualification(String qualification) {
        this.qualification = qualification == null ? null : qualification.trim();
    }

    /**
     * 获取头衔
     *
     * @return title - 头衔
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置头衔
     *
     * @param title 头衔
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取是否可上线
     *
     * @return is_online - 是否可上线
     */
    public Boolean getIs_online() {
        return is_online;
    }

    /**
     * 设置是否可上线
     *
     * @param is_online 是否可上线
     */
    public void setIs_online(Boolean is_online) {
        this.is_online = is_online;
    }

    /**
     * 获取置顶条数
     *
     * @return top_limit - 置顶条数
     */
    public Integer getTop_limit() {
        return top_limit;
    }

    /**
     * 设置置顶条数
     *
     * @param top_limit 置顶条数
     */
    public void setTop_limit(Integer top_limit) {
        this.top_limit = top_limit;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 获取最后一条内容ID
     *
     * @return last_feed_id - 最后一条内容ID
     */
    public Integer getLast_feed_id() {
        return last_feed_id;
    }

    /**
     * 设置最后一条内容ID
     *
     * @param last_feed_id 最后一条内容ID
     */
    public void setLast_feed_id(Integer last_feed_id) {
        this.last_feed_id = last_feed_id;
    }

    /**
     * 获取最后一条内容时间
     *
     * @return last_feed_at - 最后一条内容时间
     */
    public Date getLast_feed_at() {
        return last_feed_at;
    }

    /**
     * 设置最后一条内容时间
     *
     * @param last_feed_at 最后一条内容时间
     */
    public void setLast_feed_at(Date last_feed_at) {
        this.last_feed_at = last_feed_at;
    }

    /**
     * 获取是否官方账号
     *
     * @return is_office - 是否官方账号
     */
    public Boolean getIs_office() {
        return is_office;
    }

    /**
     * 设置是否官方账号
     *
     * @param is_office 是否官方账号
     */
    public void setIs_office(Boolean is_office) {
        this.is_office = is_office;
    }

    /**
     * 获取粉丝数量
     *
     * @return fans_count - 粉丝数量
     */
    public Integer getFans_count() {
        return fans_count;
    }

    /**
     * 设置粉丝数量
     *
     * @param fans_count 粉丝数量
     */
    public void setFans_count(Integer fans_count) {
        this.fans_count = fans_count;
    }

    /**
     * 获取讲师标记（金牌，银牌，铜牌）
     *
     * @return flag - 讲师标记（金牌，银牌，铜牌）
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置讲师标记（金牌，银牌，铜牌）
     *
     * @param flag 讲师标记（金牌，银牌，铜牌）
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 获取关注后是否自动回复
     *
     * @return is_auto_reply - 关注后是否自动回复
     */
    public Boolean getIs_auto_reply() {
        return is_auto_reply;
    }

    /**
     * 设置关注后是否自动回复
     *
     * @param is_auto_reply 关注后是否自动回复
     */
    public void setIs_auto_reply(Boolean is_auto_reply) {
        this.is_auto_reply = is_auto_reply;
    }

    /**
     * 获取管理员是否禁止自动回复
     *
     * @return admin_forbidden_auto_reply - 管理员是否禁止自动回复
     */
    public Boolean getAdmin_forbidden_auto_reply() {
        return admin_forbidden_auto_reply;
    }

    /**
     * 设置管理员是否禁止自动回复
     *
     * @param admin_forbidden_auto_reply 管理员是否禁止自动回复
     */
    public void setAdmin_forbidden_auto_reply(Boolean admin_forbidden_auto_reply) {
        this.admin_forbidden_auto_reply = admin_forbidden_auto_reply;
    }

    /**
     * 获取昨日阅读量
     *
     * @return yesterday_view_count - 昨日阅读量
     */
    public Integer getYesterday_view_count() {
        return yesterday_view_count;
    }

    /**
     * 设置昨日阅读量
     *
     * @param yesterday_view_count 昨日阅读量
     */
    public void setYesterday_view_count(Integer yesterday_view_count) {
        this.yesterday_view_count = yesterday_view_count;
    }

    /**
     * 获取是否内部讲师
     *
     * @return is_internal - 是否内部讲师
     */
    public Boolean getIs_internal() {
        return is_internal;
    }

    /**
     * 设置是否内部讲师
     *
     * @param is_internal 是否内部讲师
     */
    public void setIs_internal(Boolean is_internal) {
        this.is_internal = is_internal;
    }

    /**
     * 获取是否金投顾讲师
     *
     * @return is_jtg - 是否金投顾讲师
     */
    public Boolean getIs_jtg() {
        return is_jtg;
    }

    /**
     * 设置是否金投顾讲师
     *
     * @param is_jtg 是否金投顾讲师
     */
    public void setIs_jtg(Boolean is_jtg) {
        this.is_jtg = is_jtg;
    }

    /**
     * 获取付款渠道
     *
     * @return pay_channel - 付款渠道
     */
    public Integer getPay_channel() {
        return pay_channel;
    }

    /**
     * 设置付款渠道
     *
     * @param pay_channel 付款渠道
     */
    public void setPay_channel(Integer pay_channel) {
        this.pay_channel = pay_channel;
    }

    /**
     * 获取人气
     *
     * @return popularity - 人气
     */
    public Integer getPopularity() {
        return popularity;
    }

    /**
     * 设置人气
     *
     * @param popularity 人气
     */
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    /**
     * 获取周阅读量
     *
     * @return week_view_count - 周阅读量
     */
    public Integer getWeek_view_count() {
        return week_view_count;
    }

    /**
     * 设置周阅读量
     *
     * @param week_view_count 周阅读量
     */
    public void setWeek_view_count(Integer week_view_count) {
        this.week_view_count = week_view_count;
    }

    /**
     * 获取周点赞量
     *
     * @return week_like_count - 周点赞量
     */
    public Integer getWeek_like_count() {
        return week_like_count;
    }

    /**
     * 设置周点赞量
     *
     * @param week_like_count 周点赞量
     */
    public void setWeek_like_count(Integer week_like_count) {
        this.week_like_count = week_like_count;
    }

    /**
     * 获取执业证书编号
     *
     * @return practice_no - 执业证书编号
     */
    public String getPractice_no() {
        return practice_no;
    }

    /**
     * 设置执业证书编号
     *
     * @param practice_no 执业证书编号
     */
    public void setPractice_no(String practice_no) {
        this.practice_no = practice_no == null ? null : practice_no.trim();
    }

    /**
     * 获取上首页条数
     *
     * @return go_index_num - 上首页条数
     */
    public Integer getGo_index_num() {
        return go_index_num;
    }

    /**
     * 设置上首页条数
     *
     * @param go_index_num 上首页条数
     */
    public void setGo_index_num(Integer go_index_num) {
        this.go_index_num = go_index_num;
    }

    /**
     * 获取是否新兰德讲师
     *
     * @return is_xld - 是否新兰德讲师
     */
    public Boolean getIs_xld() {
        return is_xld;
    }

    /**
     * 设置是否新兰德讲师
     *
     * @param is_xld 是否新兰德讲师
     */
    public void setIs_xld(Boolean is_xld) {
        this.is_xld = is_xld;
    }

    /**
     * 获取投顾名称
     *
     * @return invester_name - 投顾名称
     */
    public String getInvester_name() {
        return invester_name;
    }

    /**
     * 设置投顾名称
     *
     * @param invester_name 投顾名称
     */
    public void setInvester_name(String invester_name) {
        this.invester_name = invester_name == null ? null : invester_name.trim();
    }

    /**
     * 获取是否可上传vip视频
     *
     * @return allow_charge_video - 是否可上传vip视频
     */
    public Boolean getAllow_charge_video() {
        return allow_charge_video;
    }

    /**
     * 设置是否可上传vip视频
     *
     * @param allow_charge_video 是否可上传vip视频
     */
    public void setAllow_charge_video(Boolean allow_charge_video) {
        this.allow_charge_video = allow_charge_video;
    }

    /**
     * 获取是否允许视频直播
     *
     * @return allow_live_video - 是否允许视频直播
     */
    public Boolean getAllow_live_video() {
        return allow_live_video;
    }

    /**
     * 设置是否允许视频直播
     *
     * @param allow_live_video 是否允许视频直播
     */
    public void setAllow_live_video(Boolean allow_live_video) {
        this.allow_live_video = allow_live_video;
    }

    /**
     * 获取视频封面图片
     *
     * @return poster - 视频封面图片
     */
    public String getPoster() {
        return poster;
    }

    /**
     * 设置视频封面图片
     *
     * @param poster 视频封面图片
     */
    public void setPoster(String poster) {
        this.poster = poster == null ? null : poster.trim();
    }

    /**
     * @return sharing_rate
     */
    public BigDecimal getSharing_rate() {
        return sharing_rate;
    }

    /**
     * @param sharing_rate
     */
    public void setSharing_rate(BigDecimal sharing_rate) {
        this.sharing_rate = sharing_rate;
    }

    /**
     * @return is_consulting_stock
     */
    public Boolean getIs_consulting_stock() {
        return is_consulting_stock;
    }

    /**
     * @param is_consulting_stock
     */
    public void setIs_consulting_stock(Boolean is_consulting_stock) {
        this.is_consulting_stock = is_consulting_stock;
    }

    /**
     * @return smart_view_count
     */
    public Integer getSmart_view_count() {
        return smart_view_count;
    }

    /**
     * @param smart_view_count
     */
    public void setSmart_view_count(Integer smart_view_count) {
        this.smart_view_count = smart_view_count;
    }

    /**
     * @return vip_push_count
     */
    public Integer getVip_push_count() {
        return vip_push_count;
    }

    /**
     * @param vip_push_count
     */
    public void setVip_push_count(Integer vip_push_count) {
        this.vip_push_count = vip_push_count;
    }

    /**
     * @return common_push_count
     */
    public Integer getCommon_push_count() {
        return common_push_count;
    }

    /**
     * @param common_push_count
     */
    public void setCommon_push_count(Integer common_push_count) {
        this.common_push_count = common_push_count;
    }

    /**
     * 获取推送上限条数
     *
     * @return push_limit - 推送上限条数
     */
    public Integer getPush_limit() {
        return push_limit;
    }

    /**
     * 设置推送上限条数
     *
     * @param push_limit 推送上限条数
     */
    public void setPush_limit(Integer push_limit) {
        this.push_limit = push_limit;
    }

    /**
     * 获取讲师UUID
     *
     * @return lecturer_uuid - 讲师UUID
     */
    public String getLecturer_uuid() {
        return lecturer_uuid;
    }

    /**
     * 设置讲师UUID
     *
     * @param lecturer_uuid 讲师UUID
     */
    public void setLecturer_uuid(String lecturer_uuid) {
        this.lecturer_uuid = lecturer_uuid == null ? null : lecturer_uuid.trim();
    }

    /**
     * 获取讲师简介
     *
     * @return intro - 讲师简介
     */
    public String getIntro() {
        return intro;
    }

    /**
     * 设置讲师简介
     *
     * @param intro 讲师简介
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取签名
     *
     * @return my_signature - 签名
     */
    public String getMy_signature() {
        return my_signature;
    }

    /**
     * 设置签名
     *
     * @param my_signature 签名
     */
    public void setMy_signature(String my_signature) {
        this.my_signature = my_signature == null ? null : my_signature.trim();
    }

    /**
     * 获取自动回复内容
     *
     * @return auto_reply - 自动回复内容
     */
    public String getAuto_reply() {
        return auto_reply;
    }

    /**
     * 设置自动回复内容
     *
     * @param auto_reply 自动回复内容
     */
    public void setAuto_reply(String auto_reply) {
        this.auto_reply = auto_reply == null ? null : auto_reply.trim();
    }
}