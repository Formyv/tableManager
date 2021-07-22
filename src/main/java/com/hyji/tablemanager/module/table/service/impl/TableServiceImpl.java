package com.hyji.tablemanager.module.table.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hyji.tablemanager.common.PageInfo;
import com.hyji.tablemanager.module.table.dao.TableMapper;
import com.hyji.tablemanager.module.table.pojo.*;
import com.hyji.tablemanager.module.table.service.TableService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        Integer tableId = param.getTableId();
        List<Field> fields = tableMapper.getFieldsByTableId(tableId);
        Map<String, Integer> fieldMap = fields.stream().collect(Collectors.toMap(Field::getFieldName, Field::getId));
        JSONObject json = JSONObject.parseObject(data);
        List<Col> cols = new ArrayList<>();
        for (Map.Entry<String, Object> entry : json.entrySet()) {
            Col col = new Col();
            col.setFieldId(String.valueOf(fieldMap.get(entry.getKey())));
            col.setInstanceValue(String.valueOf(entry.getValue()));
            cols.add(col);
        }
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