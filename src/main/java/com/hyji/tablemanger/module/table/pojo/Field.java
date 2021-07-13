package com.hyji.tablemanger.module.table.pojo;

import lombok.Data;

/**
 * @Description field info
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk NBS-Network Mgt. RD Dept.
 * @since 2021/7/13
 */
@Data
public class Field {
    private int id;
    private int tableId;
    private String fieldName;
    private String fieldNameCn;
    private String fieldType;
    private String createBy;
    private int createTime;
    private String updateBy;
    private int updateTime;
    private int enabled;
    private int delFlag;
}
