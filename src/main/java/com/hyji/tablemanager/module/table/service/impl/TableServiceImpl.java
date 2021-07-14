package com.hyji.tablemanager.module.table.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.hyji.tablemanager.common.PageInfo;
import com.hyji.tablemanager.module.table.dao.TableMapper;
import com.hyji.tablemanager.module.table.pojo.Col;
import com.hyji.tablemanager.module.table.pojo.Record;
import com.hyji.tablemanager.module.table.pojo.Table;
import com.hyji.tablemanager.module.table.pojo.TableRequestParam;
import com.hyji.tablemanager.module.table.service.TableService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description table service impl
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk SSP-JS Jiangsu-CSS 1 Dept.
 * @since 2021/7/13
 */
@Service("TableService")
public class TableServiceImpl implements TableService {

    final TableMapper tableMapper;

    public TableServiceImpl(TableMapper tableMapper) {
        this.tableMapper = tableMapper;
    }

    @Override
    public List<Table> list(PageInfo pageInfo, TableRequestParam param) {
        return tableMapper.list(pageInfo, param);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateTable(TableRequestParam param) {
        if (param.getId() == null) {
            return tableMapper.insert(param);
        } else {
            return tableMapper.update(param);
        }
    }

    @Override
    public Table getTableDetailById(int id) {
        return tableMapper.getTableDetailById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delTable(int id) {
        return tableMapper.delTable(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateField(TableRequestParam param) {
        if (param.getId() == null) {
            return tableMapper.insertField(param);
        } else {
            return tableMapper.updateField(param);
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delField(int id) {
        return tableMapper.delField(id);
    }

    @Override
    public List<Record> recordList(TableRequestParam param) {
        return tableMapper.recordList(param);
    }

    @Override
    public Record record(TableRequestParam param) {
        return tableMapper.record(param);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int saveOrUpdateRecord(TableRequestParam param) {
        String data = param.getData();
        JSONArray json = JSONArray.parseArray(data);
        List<Col> cols = json.toJavaList(Col.class);
        if (param.getRecordId() == null) {
            tableMapper.insertRecord(param);
        } else {
            tableMapper.delCols(param);
        }
        return tableMapper.insertCols(param, cols);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delRecord(TableRequestParam param) {
        return tableMapper.delRecord(param);
    }

}