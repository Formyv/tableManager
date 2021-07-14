package com.hyji.tablemanager.module.table.pojo;

import com.hyji.tablemanager.common.BaseDao;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description field info
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
 * @since 2021/7/13
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Field extends BaseDao {
    private int id;
    private int tableId;
    private String fieldName;
    private String fieldNameCn;
    private String fieldType;
}
