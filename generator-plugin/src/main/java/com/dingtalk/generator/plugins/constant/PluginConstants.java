package com.dingtalk.generator.plugins.constant;

/**
 * 常量定义
 * @author suyin
 */
public class PluginConstants {
    /**
     * 表唯一索引集合在introspectedTable.attribute.key.name（包含主键和数据库中的uniqueKeys）
     */
    public static final String TABLE_UNIQUE_KEYS = "tableUniqueKeys";

    /**
     * 用于指定生成selectByUniqueKey的唯一索引名称
     */
    public static final String TABLE_PROPERTY_UNIQUE_KEY = "uniqueKey";

    /**
     * 用于指定生成insert、update语句的自增长字段
     */
    public static final String TABLE_COLUMN_AUTO_INCREMENT = "autoIncrement";

    /**
     * 主键在数据库schema中的IndexName名称，FIXME 此处只验证了mysql的的默认主键名称
     */
    public static final String PRIMARY_KEY_INDEX_NAME = "PRIMARY";

    /**
     * 内部Enum名（参考来的）,TODO 含义未知，待删除
     */
    public static final String ENUM_NAME = "Column";


}
