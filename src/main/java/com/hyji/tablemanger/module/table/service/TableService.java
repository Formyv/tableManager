package com.hyji.tablemanger.module.table.service;

import com.hyji.tablemanger.common.PageInfo;
import com.hyji.tablemanger.module.table.pojo.Table;
import com.hyji.tablemanger.module.table.pojo.TableRequestParam;

import java.util.List;

/**
 * @Description table service
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk NBS-Network Mgt. RD Dept.
 * @since 2021/7/13
 */
public interface TableService {
    /**
     * desc: get table list
     *
     * @param param:    table request param
     * @param pageInfo: page info
     * @return list of tables
     **/
    List<Table> list(PageInfo pageInfo, TableRequestParam param);

    /**
     * desc: save or update table info
     *
     * @param param: table request param
     * @return effect rows
     **/
    int update(TableRequestParam param);


    Table getTableDetailById(int id);
}
