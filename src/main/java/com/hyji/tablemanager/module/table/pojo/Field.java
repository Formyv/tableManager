package com.hyji.tablemanager.module.table.pojo;

import com.hyji.tablemanager.common.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @Description field info
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
 * @since 2021/7/13
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Field extends BasePojo {
    private int id;
    private int tableId;
    private String fieldName;
    private String fieldNameCn;
    private String fieldType;
    private List<Dict> dictList;
}
