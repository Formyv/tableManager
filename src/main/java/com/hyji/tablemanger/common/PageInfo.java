package com.hyji.tablemanger.common;

import lombok.Data;

/**
 * @Description page info
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk NBS-Network Mgt. RD Dept.
 * @since 2021/7/13
 */
@Data
public class PageInfo {
    /**
     * 当前页
     */
    private int pageNum;
    /**
     * 每页的数量
     */
    private int pageSize;
    /**
     * 当前页的数量
     */
    private int size;
    /**
     * 当前页展示的数据的起始行
     */
    private int startRow;
    /**
     * 当前页展示的数据的结束行
     */
    private int endRow;
    /**
     * 总记录数--所需要进行分页的数据条数
     */
    private long total;
    /**
     * 总页数
     */
    private int pages;
}
