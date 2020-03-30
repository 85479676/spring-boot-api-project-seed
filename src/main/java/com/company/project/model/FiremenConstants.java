package com.company.project.model; /**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * <p>
 * Copyright (c) 2007-2016 Ttron Kidman. All rights reserved.
 */


import java.io.Serializable;

/**
 * @M6 2019年3月10日
 */
public interface FiremenConstants extends Serializable {
    public static final String AVATAR_DEFAULT = "https://app.renxingzuche.com/static/blackbird/avatar_2x.png";

    public static final String COLUMN_COUNT_TOTAL = "COUNT_TOTAL";

    /**
     * 开始时间
     */
    public static final String COLUMN_DATIME_BEGIN = "DATIME_BEGIN";

    /**
     * 截止时间
     */
    public static final String COLUMN_DATIME_DUE = "DATIME_DUE";

    /**
     * 结束时间
     */
    public static final String COLUMN_DATIME_END = "DATIME_END";

    /**
     * 到期时间
     */
    public static final String COLUMN_DATIME_EXP = "DATIME_EXP";

    /*
     * 发生时间
     */
    public static final String COLUMN_DATIME_HIT = "DATIME_HIT";

    public static final String COLUMN_DATIME_LAST_CHECK = "DATIME_LAST_CHECK";

    public static final String COLUMN_DATIME_WARRANTY_EXP = "DATIME_WARRANTY_EXP";

    public static final String COLUMN_DELTA = "DELTA";

    public static final String COLUMN_FLAG_CACHE = "flag_cache";

    public static final String COLUMN_ID_CHANNEL = "ID_CHANNEL";

    public static final String COLUMN_ID_CUSTOM = "ID_CUSTOM";

    public static final String COLUMN_ID_SYSTEM = "ID_SYSTEM";

    /**
     * 经办人
     */
    public static final String COLUMN_OPEN_ID_ASSIGNEE = "OPEN_ID_ASSIGNEE";

    /**
     * 操作员/经办人唯一编号
     */
    public static final String COLUMN_OPEN_ID_OPERATOR = "OPEN_ID_OPTR";

    /**
     * 报告人
     */
    public static final String COLUMN_OPEN_ID_REPORTER = "OPEN_ID_REPORTER";

    public static final String COLUMN_REDIRECT_URI = "REDIRECT_URI";

    public static final String COLUMN_UNID_BUSINESS_UNIT = "UNID_BUSINESS_UNIT";

    public static final String COLUMN_UNID_CELL = "UNID_CELL";

    public static final String COLUMN_UNID_ENTITY = "UNID_ENTITY";

    public static final String ENTITY_ASSET = "asset";

    public static final String ENTITY_BUSINESS_UNIT = "business_unit";

    public static final String ENTITY_BUTTON = "button";

    public static final String ENTITY_CCTV = "cctv";

    public static final String ENTITY_CELL = "cell";

    public static final String ENTITY_CHECKPOINT = "checkpoint";

    public static final String ENTITY_ENTITY = "entity";

    public static final String ENTITY_EVALUATION_ENTITY = "evaluation_entity";

    public static final String ENTITY_EVALUATION_RECORD = "evaluation_record";

    public static final String ENTITY_EVALUATION_RESULT = "evaluation_result";

    public static final String ENTITY_EVALUATION_RULE = "evaluation_rule";

    public static final String ENTITY_EVALUATION_SCHEMA = "evaluation_schema";

    public static final String ENTITY_SYSTEM_TYPE = "system_type";

    public static final String ENTITY_DOMAIN = "domain";

    /**
     * extended infomation
     */
    public static final String ENTITY_EXT = "ext";

    public static final String ENTITY_FACILITY_MAP = "facility_map";

    public static final String ENTITY_FACILITY_MAP_MARKER = "facility_map_marker";

    public static final String ENTITY_FIRE_FACILITY = "fire_facility";

    public static final String ENTITY_FIRE_RISK = "fire_risk";

    public static final String ENTITY_GEOMETRY = "geometry";

    public static final String ENTITY_MEMBER = "member";

    public static final String ENTITY_MEMBER_GROUP = "member_group";

    public static final String ENTITY_MENU = "menu";

    public static final String ENTITY_METADATA_TYPE = "metadata_type";

    public static final String ENTITY_MODEL = "model";

    public static final String ENTITY_PATROL_TODO = "patrol_todo";

    public static final String ENTITY_PERCENT = "percent";

    public static final String ENTITY_PREPLAN = "preplan";

    public static final String ENTITY_PRIVILEGE = "privilege";

    public static final String ENTITY_PROPORTION = "proportion";

    public static final String ENTITY_RECORD_PARKING = "parking_record";

    public static final String ENTITY_VENDOR = "vendor";

    /**
     * 地址
     */
    public static final String KEY_ADDRESS = "addr";

    public static final String KEY_AMOUNT = "amount";

    public static final String KEY_AMOUNT_MAX = "max_amount";

    public static final String KEY_AMOUNT_REST = "rest_amount";

    public static final String KEY_AMOUNT_TOTAL = "total_amount";

    public static final String KEY_AVATAR = "avatar";

    public static final String KEY_CAD_GRAPH = "cad_graph";

    public static final String KEY_CELLPHONE = "cellphone";

    public static final String KEY_CHANNEL = "channel";

    public static final String KEY_CHECKPOINT = "checkpoint";

    /**
     * 上下文
     */
    public static final String KEY_CONTEXT = "context";

    public static final String KEY_COORDINATES = "coordinates";

    public static final String KEY_COUNT_ALERT = "alert_count";

    public static final String KEY_COUNT_EVENT = "event_count";

    public static final String KEY_COUNT_FACILITY = "facility_count";

    public static final String KEY_COUNT_TOTAL = "total_count";

    /**
     * 证书
     */
    public static final String KEY_CREDENTIAL = "credential";

    public static final String KEY_DATIME_ACTIVE = "active_datime";

    /**
     * 最后截止时间
     */
    public static final String KEY_DATIME_DUE = "due_datime";

    /**
     * 到期时间
     */
    public static final String KEY_DATIME_EXP = "exp_datime";

    /**
     * 一般用于查询，跟KEY_DATIME_TO配合使用
     */
    public static final String KEY_DATIME_FROM = "datime_from";

    /**
     * 处理时间
     */
    public static final String KEY_DATIME_HIT = "hit_datime";

    /**
     * 上次巡检时间
     */
    public static final String KEY_DATIME_LAST_CHECK = "last_check_datime";

    /**
     * 上次保养/维护时间
     */
    public static final String KEY_DATIME_LAST_MAINTENANCE = "last_mtn_datime";

    public static final String KEY_DATIME_REGISTER = "reg_datime";

    /**
     * 一般用于查询，跟KEY_DATIME_FROM配合使用
     */
    public static final String KEY_DATIME_TO = "datime_to";

    public static final String KEY_DATIME_WARRANTY_EXP = "warranty_exp_datime";

    public static final String KEY_DISTANCE = "distance";

    /**
     *邮箱
     */
    public static final String KEY_EMAIL = "email";

    /**
     * 应答
     */
    public static final String KEY_FLAG_ACK = "flag_ack";

    public static final String KEY_FLAG_ADMIN = "flag_admin";

    /**
     * 火警/报警
     */
    public static final String KEY_FLAG_ALARM = "flag_alarm";

    /**
     * 警告
     */
    public static final String KEY_FLAG_ALERT = "flag_alert";

    public static final String KEY_FLAG_AVAILABLE = "flag_ava";

    /**
     * 屏蔽
     */
    public static final String KEY_FLAG_BLOCK = "flag_block";

    public static final String KEY_FLAG_CACHE = "flag_cache";

    public static final String KEY_FLAG_CANCEL = "flag_cancel";

    public static final String KEY_FLAG_CHILDREN = "flag_children";

    public static final String KEY_FLAG_DONE = "flag_done";

    public static final String KEY_FLAG_END = "flag_end";

    /**
     * 过期标志
     */
    public static final String KEY_FLAG_EXP = "flag_exp";

    /**
     * 故障
     */
    public static final String KEY_FLAG_FAULT = "flag_fault";

    /**
     * 状态正常
     */
    public static final String KEY_FLAG_NORMAL = "flag_normal";

    /**
     * 在线
     */
    public static final String KEY_FLAG_ONLINE = "flag_online";

    /**
     * 延误标志
     */
    public static final String KEY_FLAG_OVERDUE = "flag_overdue";

    public static final String KEY_FLAG_PRIMARY = "flag_prmy";

    /**
     * 反转
     */
    public static final String KEY_FLAG_REVERSE = "flag_reverse";

    /**
     * 启动
     */
    public static final String KEY_FLAG_START = "flag_start";

    /**
     * 监管
     */
    public static final String KEY_FLAG_SUPERVISE = "flag_supervise";

    /**
     * 性别
     */
    public static final String KEY_GENDER = "gender";

    public static final String KEY_GEO_HASH = "geo_hash";

    public static final String KEY_GEODETIC_SYSTEM = "geodetic_system";

    public static final String KEY_HOSTNAME = "hostname";

    public static final String KEY_ICON_URI = "icon_uri";

    public static final String KEY_ID_ASSET = "asset_id";

    /**
     * 业务代码,比如
     */
    @Deprecated
    public static final String KEY_ID_BUSINESS = "business_id";

    public static final String KEY_ID_CHANNEL = "channel_id";

    /**
     * 用户自定义的编号
     */
    public static final String KEY_ID_CUSTOM = "custom_id";

    /**
     *
     */
    public static final String KEY_ID_DATA_CHANNEL = "data_channel_id";

    /**
     * 工作流节点ID,比如执行到第几步了
     */
    public static final String KEY_ID_FLOW = "flow_id";

    public static final String KEY_ID_HOST = "host_id";

    public static final String KEY_ID_SLOT = "slot_id";

    /**
     * 状态代码
     */
    public static final String KEY_ID_STATUS = "status_id";

    /**
     * 系统ID
     */
    public static final String KEY_ID_SYSTEM = "system_id";

    public static final String KEY_ID_TREE = "tree_id";

    public static final String KEY_ID_TYPE_0 = "type_id_0";

    public static final String KEY_ID_ZONE = "zone_id";

    /**
     * 标识符
     */
    public static final String KEY_IDENTIFIER = "identifier";

    public static final String KEY_LEVEL = "level";

    public static final String KEY_LOCATION = "location";

    public static final String KEY_MENU_TYPE = "menu_type";

    public static final String KEY_MENU_UNID = "menu_unid";

    public static final String KEY_MODEL = ENTITY_MODEL;

    /**
     * 部门名称
     */
    public static final String KEY_NAME_DEPARTMENT = "dept_name";

    public static final String KEY_NAME_FIRST = "first_name";

    /**
     * 全名
     */
    public static final String KEY_NAME_FULL = "full_name";

    public static final String KEY_OFFSET = "offset";

    public static final String KEY_ORDER_BY = "order_by";

    /**
     * 分组分为AB树
     */
    public static final String KEY_PAGE_SIZE = "page_size";

    public static final String KEY_PASSWORD = "password";

    public static final String KEY_PERCENT = "percent";

    public static final String KEY_POINT = "point";

    public static final String KEY_PORT = "port";

    public static final String KEY_PRIVILEGE_UNID = "privilege_unid";

    /**
     * TCP,UDP
     */
    public static final String KEY_PROTOCOL_L4 = "protocol_l4";

    /**
     * ONVIF,RTSP
     */
    public static final String KEY_PROTOCOL_L7 = "protocol_l7";

    /**
     * 搜索关键词
     */
    public static final String KEY_Q = "q";

    /**
     * 半径
     */
    public static final String KEY_RADIUS = "radius";

    /**
     * 评级
     */
    public static final String KEY_RANK = "rank";

    public static final String KEY_TEL = "tel";

    /**
     * 标题/头衔
     */
    public static final String KEY_TITLE = "title";

    public static final String KEY_UNID_ASSIGNEE = "assignee_unid";

    /**
     * 商铺ID
     */
    public static final String KEY_UNID_BUSINESS_UNIT = "business_unit_unid";

    /**
     * 房间/楼层的某个区域
     */
    public static final String KEY_UNID_CELL = "cell_unid";

    public static final String KEY_UNID_CHECKPOINT = "checkpoint_unid";

    public static final String KEY_UNID_CREATOR = "creator_unid";

    /**
     * 载体唯一编号
     */
    public static final String KEY_UNID_ENTITY = "entity_unid";

    /**
     * 评估条款唯一编号
     */
    public static final String KEY_UNID_EVALUATION_ENTITY = "evaluation_entity_unid";

    public static final String KEY_UNID_LINE = "line_unid";

    public static final String KEY_UNID_MAP = "map_unid";

    public static final String KEY_UNID_MODEL = "model_unid";

    public static final String KEY_UNID_MOUNT = "mount_unid";

    public static final String KEY_UNID_NOTIFICATION_SCHEMA = "notification_schema_unid";

    public static final String KEY_UNID_REPORTER = "reporter_unid";

    /**
     * 规则唯一编号
     */
    public static final String KEY_UNID_RULE = "rule_unid";

    public static final String KEY_UNID_SCHEMA = "schema_unid";

    public static final String KEY_UNID_VENDOR = "vendor_unid";

    public static final String KEY_UNID_WORKFLOW = "workflow_unid";

    public static final String KEY_URI = "uri";

    public static final String KEY_URI_1X = "uri_1x";

    public static final String KEY_URI_2X = "uri_2x";

    public static final String KEY_USERNAME = "username";

    public static final String KEY_VENDOR = "vendor";

    /**
     * 权重
     */
    public static final String KEY_WEIGHT = "weight";

    public static final String KEY_WWW = "www";

    public static final String KEY_X = "x";

    public static final String KEY_X_MAX = "max_x";

    public static final String KEY_Y = "y";

    public static final String KEY_Y_MAX = "max_y";

    public static final String KEY_Z = "z";

    public static final String KEY_ZOOM = "zoom";

    public static final String KYE_OPENID_OAU = "openids";

    public static final String TAG_DEVICE = "DEVICE";

    public static final String TYPE_KEY_TENANT = "TENANT";

    public static final String VALUE_DATIME_ZERO = "0000-00-00 00:00:00";
}
