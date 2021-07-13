package com.hyji.tablemanger.module.table.pojo;

import lombok.Data;

/**
 * @Description table api request param
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk NBS-Network Mgt. RD Dept.
 * @since 2021/7/13
 */
@Data
public class TableRequestParam {
    private Integer id;
    private String tableName;
    private String tableNameCn;
    private String createBy;
    private Integer createTime;
    private String updateBy;
    private Integer updateTime;
    private Integer enabled;
    private Integer delFlag;
    private Integer tableId;
    private String fieldName;
    private String fieldNameCn;
    private String fieldType;
}
