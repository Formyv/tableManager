package com.hyji.tablemanager.module.table.controller;

import com.hyji.tablemanager.common.ApiResult;
import com.hyji.tablemanager.common.PageInfo;
import com.hyji.tablemanager.module.table.pojo.Table;
import com.hyji.tablemanager.module.table.pojo.TableRequestParam;
import com.hyji.tablemanager.module.table.service.TableService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description table api
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
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
    public ApiResult listTable(PageInfo pageInfo, TableRequestParam param) {
        List<Table> tables = tableService.list(pageInfo, param);
        return ApiResult.ok(tables);
    }

    @RequestMapping("saveOrUpdateTable")
    public ApiResult saveOrUpdateTable(TableRequestParam param) {
        int res = tableService.updateTable(param);
        return ApiResult.ok(res > 0);
    }

    @RequestMapping("delTable")
    public ApiResult delTable(int id) {
        int res = tableService.delTable(id);
        return ApiResult.ok(res > 0);
    }

    @RequestMapping("tableDetail")
    public ApiResult tableDetail(int id) {
        return ApiResult.ok(tableService.getTableDetailById(id));
    }

    @RequestMapping("saveOrUpdateField")
    public ApiResult saveOrUpdateField(TableRequestParam param) {
        int res = tableService.updateField(param);
        return ApiResult.ok(res > 0);
    }

    @RequestMapping("delField")
    public ApiResult delField(int id) {
        int res = tableService.delField(id);
        return ApiResult.ok(res > 0);
    }

    @RequestMapping("recordList")
    public ApiResult recordList(TableRequestParam param) {
        return ApiResult.ok(tableService.recordList(param));
    }

    @RequestMapping("record")
    public ApiResult record(TableRequestParam param) {
        return ApiResult.ok(tableService.record(param));
    }

    @RequestMapping("saveOrUpdateRecord")
    public ApiResult saveOrUpdateRecord(TableRequestParam param) {
        int res = tableService.saveOrUpdateRecord(param);
        return ApiResult.ok(res > 0);
    }

    @RequestMapping("delRecord")
    public ApiResult delRecord(TableRequestParam param) {
        int res = tableService.delRecord(param);
        return ApiResult.ok(res > 0);
    }
}
