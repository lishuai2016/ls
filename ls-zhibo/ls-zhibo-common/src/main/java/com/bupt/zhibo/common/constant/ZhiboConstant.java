package com.bupt.zhibo.common.constant;

import com.ls.common.base.BaseConstants;

/**
 * 系统常量类
 */
public class ZhiboConstant extends BaseConstants {

    //云通信应用
    public final static String SDKAPPID = "1400030105";//1400030105 1400029474 1400028912
    public final static String IDENTIFIER = "lishuai";// lishuai  anyuechao1 anyuechao

    //安全签名anyuechao1
    //public final static String USERSIG = "eJx10M1rgzAYx-G7f0XItWPEl2pT2MHZdpapuOpGu0tINdY41KDR2o7976MvMC97rr8PfOH5VgAAMPaiR5okdVdJIk*CQTAHUNU01YIPf0AInhIqid6kN2AghDRsWMZIsUHwhhGaSdbc1NQyZ*hyI8VTVkme8buh1aljSU5rdWTa9Itcm--HWn64jv7y3Vk-L3aus8HCre0schz-zc784vVzXexpm6-io-6B*glTYw8PNl-aE1QF0z6gebjtCne7H8KyRJ57eNFX9u7IN73qL5JzEIWm8TRKSl7e32NgfWZa2NSg8qP8ArVjWVA_";

    //anyuechao
    //public final static String USERSIG = "eJx10LtOwzAUgOE9T2FlBSHHuSMxWKkhiRo6hLYwWZbjtFbIBdspjVDfHWgrkYWznk-6j86XBQCwX5blHeO8HztDzTQIG9wD20HICe3bPzAMsqLMUFdVF*BBCFEUO2imxHGQSlBWG6Euyg*DCP7OTMlKdEbW8mpYN42C71k-I7pq6Dn5f0vL3XlZkHWSkfIAV2-dqPjh3dWvj6xcjjd7AnfYQaTP07bwn0T7PEXZFkuC4Sr30s8wyLYNh0m3qUsWJh*4wTEucuYfVbpYrIMNqbV*mCWNbK-f8WI3CiL0c5B1sr4BZY1YzQ__";

    //李帅独立模式
    public final static String USERSIG = "eJxljk1Pg0AURff8CsK2xgwDI9YdrcZgqVpaJOOGjJ0pPMvHZJiWFuN-V2mTkni357x375dhmqa1CpfXbL2ud5VO9VEKy7wzLWRdXaCUwFOmU0fxf1AcJCiRso0Wqoc2IQQjNHSAi0rDBs5GAU2*YzAQGr5N*5bTB-f33EE2IkMFsh7OH*g0WNw33lYtiqQ7TLOYfyZtmUxGfl5gGrJYjH26en6Zv8cfN*EsC3I-8CgdERfcQPmSOoFfv0UTvG8ICWVX8ki20XLWPnav7GlQqaEU50Fjx7NvPRcP6F6oBuqqFzCyiY0d9BfL*DZ*ADkpXi4_";


    //请求地址前缀
    public final static String IM_URL_PREFIX = "https://console.tim.qq.com/";

    //1账号管理模块
    //独立模式帐号导入
    public final static String ACCOUNT_IMPORT = "v4/im_open_login_svc/account_import";
    //独立模式帐号批量导入
    public final static String MULTIACCOUNT_IMPORT = "v4/im_open_login_svc/multiaccount_import";
    //托管模式帐号导入
    public final static String REGISTER_ACCOUNT_V1 = "v4/registration_service/register_account_v1";
    //失效帐号登录态
    public final static String KICK = "v4/im_open_login_svc/kick";


    //2单聊消息
    //单发单聊消息
    public final static String SENDMSG = "v4/openim/sendmsg";
    //批量发单聊消息
    public final static String BATCHSENDMSG = "v4/openim/batchsendmsg";
    //导入单聊消息
    public final static String IMPORTMSG = "v4/openim/importmsg";


    //3消息推送
    //推送
    public final static String IM_PUSH = "v4/openim/im_push";
    //获取推送报告
    public final static String IM_GET_PUSH_REPORT = "v4/openim/im_get_push_report";
    //设置应用属性名称
    public final static String IM_SET_ATTR_NAME = "v4/openim/im_set_attr_name";
    //获取应用属性名称
    public final static String IM_GET_ATTR_NAME = "v4/openim/im_get_attr_name";
    //设置用户属性
    public final static String IM_SET_ATTR = "v4/openim/im_set_attr";
    //删除用户属性
    public final static String IM_REMOVE_ATTR = "v4/openim/im_remove_attr";
    //获取用户属性
    public final static String IM_GET_ATTR = "v4/openim/im_get_attr";
    //添加用户标签
    public final static String IM_Add_TAG = "v4/openim/im_add_tag";
    //删除用户标签
    public final static String IM_REMOVE_TAG = "v4/openim/im_remove_tag";
    //删除用户所有标签
    public final static String IM_REMOVE_ALL_TAGS = "v4/openim/im_remove_all_tags";

    //4 群组管理
    //获取APP中的所有群组
    public final static String GET_APPID_GROUP_LIST = "v4/group_open_http_svc/get_appid_group_list";
    //创建群组
    public final static String CREATE_GROUP = "v4/group_open_http_svc/create_group";
    //获取群组详细资料
    public final static String GET_GROUP_INFO = "v4/group_open_http_svc/get_group_info";
    //获取群成员详细资料
    public final static String GET_GROUP_MEMBER_INFO = "v4/group_open_http_svc/get_group_member_info";
    //修改群组基础资料
    public final static String MODIFY_GROUP_BASE_INFO = "v4/group_open_http_svc/modify_group_base_info";
    //增加群组成员
    public final static String ADD_GROUP_MEMBER = "v4/group_open_http_svc/add_group_member";
    //删除群组成员
    public final static String DELETE_GROUP_MEMBER = "v4/group_open_http_svc/delete_group_member";
    //修改群组成员资料
    public final static String MODIFY_GROUP_MEMBER_INFO = "v4/group_open_http_svc/modify_group_member_info";
    //解散群组
    public final static String DESTORY_GROUP = "v4/group_open_http_svc/destroy_group";
    //获取用户所加入的群组
    public final static String GET_JOINED_GROUP_LIST = "v4/group_open_http_svc/get_joined_group_list";
    //查询用户在群组中的身份
    public final static String GET_ROLE_IN_GRUOP = "v4/group_open_http_svc/get_role_in_group";
    //批量禁言和取消禁言
    public final static String FORBID_SEND_MSG = "v4/group_open_http_svc/forbid_send_msg";
    //获取群组被禁言用户列表
    public final static String GET_GROUP_SHUTTED_UIN = "v4/group_open_http_svc/get_group_shutted_uin";
    //在群组中发送普通消息
    public final static String SEND_GROUP_MSG = "v4/group_open_http_svc/send_group_msg";
    //在群组中发送系统通知
    public final static String SEND_GROUP_SYSTEM_NOTIFICATION = "v4/group_open_http_svc/send_group_system_notification";
    //转让群组
    public final static String CHANGE_GROUP_OWNER = "v4/group_open_http_svc/change_group_owner";
    //导入群基础资料
    public final static String IMPORT_GROUP = "v4/group_open_http_svc/import_group";
    //导入群消息
    public final static String IMPORT_GROUP_MSG = "v4/group_open_http_svc/import_group_msg";
    //导入群成员
    public final static String IMPORT_GROUP_MEMBER = "v4/group_open_http_svc/import_group_member";
    //设置成员未读消息计数
    public final static String SET_UNREAD_MSG_NUM = "v4/group_open_http_svc/set_unread_msg_num";
    //删除指定用户发送的消息
    public final static String DELETE_GROUP_MSG_BY_SENDER = "v4/group_open_http_svc/delete_group_msg_by_sender";
    //搜索群组
    public final static String SEARCH_GROUP = "v4/group_open_http_svc/search_group";
    //拉取群漫游消息
    public final static String GROUP_MSG_GET_SIMPLE = "v4/group_open_http_svc/group_msg_get_simple";


    //5 资料管理
    //拉取资料
    public final static String PORTRAIT_GET = "v4/profile/portrait_get";
    //设置资料
    public final static String PORTRAIT_SET = "v4/profile/portrait_set";


    //6 关系链管理
    //添加好友
    public final static String FRIEND_IMPORT = "v4/sns/friend_import";
    //删除好友
    public final static String FRIEND_DELETE = "v4/sns/friend_delete";
    //删除所有好友
    public final static String FRIEND_DELETE_ALL = "v4/sns/friend_delete_all";
    //校验好友
    public final static String FRIEND_CHECK = "v4/sns/friend_check";
    //拉取好友
    public final static String FRIEND_GET_ALL = "v4/sns/friend_get_all";

    //7 脏字管理
    //添加脏字
    public final static String GET_DIRTY_WORDS = "v4/openim_dirty_words/get";
    //删除脏字
    public final static String ADD_DIRTY_WORDS = "v4/openim_dirty_words/add";
    //删除所有脏字
    public final static String DELETE_DIRTY_WORDS = "v4/openim_dirty_words/delete";

    //8 数据下载
    //消息记录下载
    public final static String GET_HISTORY = "v4/open_msg_svc/get_history";


    //9 在线状态
    //获取用户在线状态
    public final static String QUERYSTATE = "v4/openim/querystate";

    //10 全局禁言管理
    //设置全局禁言
    public final static String SETNOSPEAKING = "v4/openconfigsvr/setnospeaking";
    //查询全局禁言
    public final static String GETNOSPEAKING = "v4/openconfigsvr/getnospeaking";

    //直播图片位置
    public final static String PIC_PATH = "/resources/upload/images/";


}
