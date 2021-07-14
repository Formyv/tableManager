package com.hyji.tablemanager.module.table.pojo;

import com.hyji.tablemanager.common.BaseDao;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description table api request param
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
 * @since 2021/7/13
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TableRequestParam extends BaseDao {
    private Integer id;
    private Integer tableId;
    private Integer fieldId;
    private Integer recordId;
    private Integer colId;

    private String tableName;
    private String tableNameCn;

    private String fieldName;
    private String fieldNameCn;
    private String fieldType;

    private String instanceValue;

    private String data;
}
