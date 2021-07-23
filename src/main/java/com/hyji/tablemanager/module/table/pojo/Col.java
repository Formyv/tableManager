package com.hyji.tablemanager.module.table.pojo;

import com.hyji.tablemanager.common.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description col of record
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
 * @since 2021/7/13
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Col extends BasePojo {
    private int recordId;
    private String fieldId;
    private String fieldName;
    private String instanceValue;
}
