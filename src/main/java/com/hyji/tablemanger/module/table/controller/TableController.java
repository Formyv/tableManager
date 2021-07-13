package com.hyji.tablemanger.module.table.controller;

import com.hyji.tablemanger.common.ApiResult;
import com.hyji.tablemanger.common.PageInfo;
import com.hyji.tablemanger.module.table.pojo.Table;
import com.hyji.tablemanger.module.table.pojo.TableRequestParam;
import com.hyji.tablemanger.module.table.service.TableService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description table api
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk NBS-Network Mgt. RD Dept.
 * @since 2021/7/13
 */
@RestController
@RequestMapping("table")
public class TableController {

    private final TableService tableService;

    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @RequestMapping("listTable")
    public ApiResult list(PageInfo pageInfo, TableRequestParam param) {
        List<Table> tables = tableService.list(pageInfo, param);
        return ApiResult.ok(tables);
    }

    @RequestMapping("saveOrUpdateTable")
    public ApiResult update(TableRequestParam param) {
        int res = tableService.update(param);
        return ApiResult.ok(res > 0);
    }

    @RequestMapping("tableDetail")
    public ApiResult tableDetail(int id) {
        return ApiResult.ok(tableService.getTableDetailById(id));
    }

}
