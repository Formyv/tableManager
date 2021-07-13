package com.hyji.tablemanager.module.table.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Description table info
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk NBS-Network Mgt. RD Dept.
 * @since 2021/7/13
 */
@Data
public class Table {
    private int id;
    private String tableName;
    private String tableNameCn;
    private String createBy;
    private int createTime;
    private String updateBy;
    private int updateTime;
    private int enabled;
    private int delFlag;
    private List<Field> fields;
}
