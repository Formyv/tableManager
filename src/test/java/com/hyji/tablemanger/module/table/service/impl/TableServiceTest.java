package com.hyji.tablemanger.module.table.service.impl;

import com.hyji.tablemanger.BaseTest;
import com.hyji.tablemanger.common.PageInfo;
import com.hyji.tablemanger.module.table.pojo.TableRequestParam;
import com.hyji.tablemanger.module.table.service.TableService;
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
        tableService.update(tableRequestParam);
    }

}