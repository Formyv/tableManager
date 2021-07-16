package com.hyji.tablemanager.module.table.pojo;

import com.hyji.tablemanager.common.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @Description a record info of table
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
 * @since 2021/7/13
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Record extends BasePojo {
    private int id;
    private String tableId;
    private List<Col> instanceList;
}
