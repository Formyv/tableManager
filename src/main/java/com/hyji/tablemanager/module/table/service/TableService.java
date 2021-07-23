package com.hyji.tablemanager.module.table.service;

import com.alibaba.fastjson.JSONObject;
import com.hyji.tablemanager.common.PageInfo;
import com.hyji.tablemanager.module.table.pojo.Record;
import com.hyji.tablemanager.module.table.pojo.Table;
import com.hyji.tablemanager.module.table.pojo.TableRequestParam;

import java.util.List;

/**
 * @Description table service
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
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
    int updateTable(TableRequestParam param);

    /**
     * desc: get field of the table
     *
     * @param id: table id
     * @return table pojo
     **/
    Table getTableDetailById(int id);

    /**
     * desc: delete table
     *
     * @param id table id
     * @return effect rows
     **/
    int delTable(int id);

    /**
     * desc: save or update field
     *
     * @param param field pojo
     * @return effect rows
     **/
    int updateField(TableRequestParam param);

    /**
     * desc: delete field
     *
     * @param id field id
     * @return effect rows
     **/
    int delField(int id);

    /**
     * desc: get table instance list
     *
     * @param param param
     * @return table instance list
     **/
    List<JSONObject> recordList(TableRequestParam param);

    /**
     * desc: get instance
     *
     * @param param param
     * @return instance
     **/
    Record record(TableRequestParam param);

    /**
     * desc: save or update instance
     *
     * @param param param
     * @return effect rows
     **/
    int saveOrUpdateRecord(TableRequestParam param);

    /**
     * desc: delete instance
     *
     * @param param param
     * @return effect rows
     **/
    int delRecord(TableRequestParam param);
}
