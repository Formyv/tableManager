package com.hyji.tablemanager.module.table.dao;

import com.hyji.tablemanager.common.PageInfo;
import com.hyji.tablemanager.module.table.pojo.Col;
import com.hyji.tablemanager.module.table.pojo.Record;
import com.hyji.tablemanager.module.table.pojo.Table;
import com.hyji.tablemanager.module.table.pojo.TableRequestParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * able dao
 *
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
 * @since 2021/7/13
 */
@Mapper
public interface TableMapper {
    /**
     * return the list of tables
     * @param pageInfo page info
     * @param param    select param
     * @return list of tables
     */
    List<Table> list(@Param("pageInfo") PageInfo pageInfo, @Param("param") TableRequestParam param);

    /**
     * add table
     * @param param: add param
     * @return effect rows
     */
    int insert(@Param("param") TableRequestParam param);


    /**
     * update table
     * @param param update param
     * @return effect rows
     */
    int update(@Param("param") TableRequestParam param);

    /**
     * desc: get field of the table
     * @param id: table id
     * @return table pojo
     **/
    Table getTableDetailById(int id);

    /**
     * desc: delete table
     * @param id table id
     * @return effect rows
     **/
    int delTable(int id);

    /**
     * desc: save or update field
     * @param param field pojo
     * @return effect rows
     **/
    int updateField(TableRequestParam param);

    /**
     * desc: save or update field
     * @param param field pojo
     * @return effect rows
     **/
    int insertField(TableRequestParam param);

    /**
     * desc: delete field
     * @param id field id
     * @return effect rows
     **/
    int delField(int id);

    /**
     * desc: get table instance list
     * @param param param
     * @return table instance list
     **/
    List<Record> recordList(TableRequestParam param);

    /**
     * desc: get instance
     * @param param param
     * @return instance
     **/
    Record record(TableRequestParam param);

    /**
     * desc: save or update instance
     * @param param param
     * @return effect rows
     **/
    int insertRecord(TableRequestParam param);

    //    int updateRecord(TableRequestParam param);

    /**
     * desc: delete instance
     * @param param param
     * @return effect rows
     **/
    int delRecord(TableRequestParam param);

    /**
     * desc: save or update instance
     * @param param param
     * @param cols
     * @return effect rows
     **/
    int insertCols(TableRequestParam param, List<Col> cols);

    /**
     * desc: delete col of instance
     * @param param param
     * @return effect rows
    **/
    int delCols(TableRequestParam param);
}
