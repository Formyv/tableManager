package com.hyji.tablemanager.common;

import lombok.Data;

/**
 * @Description base dao
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
 * @since 2021/7/14
 */
@Data
public class BaseDao {
    private String createBy;
    private int createTime;
    private String updateBy;
    private int updateTime;
    private int enabled;
    private int delFlag;
}
