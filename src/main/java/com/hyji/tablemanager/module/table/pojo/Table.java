package com.hyji.tablemanager.module.table.pojo;

import com.hyji.tablemanager.common.BaseDao;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @Description table info
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
 * @since 2021/7/13
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Table extends BaseDao {
    private int id;
    private String tableName;
    private String tableNameCn;
    private List<Field> fields;
}
