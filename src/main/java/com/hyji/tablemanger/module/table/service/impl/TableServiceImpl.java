package com.hyji.tablemanger.module.table.service.impl;

import com.hyji.tablemanger.common.PageInfo;
import com.hyji.tablemanger.module.table.dao.TableMapper;
import com.hyji.tablemanger.module.table.pojo.Table;
import com.hyji.tablemanger.module.table.pojo.TableRequestParam;
import com.hyji.tablemanger.module.table.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description table service impl
 * @Author jhy
 * @Version: V1.0
 * @copyright Ailk NBS-Network Mgt. RD Dept.
 * @since 2021/7/13
 */
@Service("TableService")
public class TableServiceImpl implements TableService {

    @Autowired
    TableMapper tableMapper;

    @Override
    public List<Table> list(PageInfo pageInfo, TableRequestParam param) {
        return tableMapper.list(pageInfo, param);
    }

    @Override
    public int update(TableRequestParam param) {
        boolean ifAdd = param.getId() == null;
        if (ifAdd) {
            return tableMapper.insert(param);
        } else {
            return tableMapper.update(param);
        }
    }

    @Override
    public Table getTableDetailById(int id) {
        return tableMapper.getTableDetailById(id);
    }

}
