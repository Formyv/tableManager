package com.hyji.tablemanger.module.table.dao;

import com.hyji.tablemanger.common.PageInfo;
import com.hyji.tablemanger.module.table.pojo.Table;
import com.hyji.tablemanger.module.table.pojo.TableRequestParam;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description table dao
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk NBS-Network Mgt. RD Dept.
 * @since 2021/7/13
 */
@Mapper
public interface TableMapper {
    /**
     * @Description  return the list of tables
     * @param pageInfo page info
     * @param param    select param
     * @return list of tables
     */
    List<Table> list(@Param("pageInfo") PageInfo pageInfo, @Param("param") TableRequestParam param);

    /**
     * @param param: add param
     * @return effect rows
     */
    int insert(@Param("param") TableRequestParam param);


    /**
     * @param param update param
     * @return effect rows
     */
    int update(@Param("param") TableRequestParam param);

    Table getTableDetailById(int id);
}
