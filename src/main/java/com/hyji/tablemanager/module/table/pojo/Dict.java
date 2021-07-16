package com.hyji.tablemanager.module.table.pojo;

import com.hyji.tablemanager.common.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description dict pojo
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
 * @since 2021/7/16
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Dict extends BasePojo {
    private int id;
    private String dictType;
    private String dictKey;
    private String dictValue;
}
