package com.hyji.tablemanager.module.table.service.impl;

import com.hyji.tablemanager.BaseTest;
import com.hyji.tablemanager.common.PageInfo;
import com.hyji.tablemanager.module.table.pojo.TableRequestParam;
import com.hyji.tablemanager.module.table.service.TableService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class TableServiceTest extends BaseTest {
    @Autowired
    TableService tableService;

    @Test
    public void test() {
        PageInfo pageInfo = new PageInfo();
        TableRequestParam tableRequestParam = new TableRequestParam();
        tableRequestParam.setId(1);
        tableRequestParam.setTableName("tt_test");
        tableRequestParam.setTableNameCn("test");
        tableService.updateTable(tableRequestParam);
    }

}