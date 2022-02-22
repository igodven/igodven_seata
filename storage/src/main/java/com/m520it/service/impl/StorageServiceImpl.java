package com.m520it.service.impl;

import com.m520it.dao.StorageMapper;
import com.m520it.service.StorageService;
import io.seata.core.context.RootContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 23:17
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void storageDecrease(String commodityCode, Integer count) {

       String xid= RootContext.getXID();
        System.out.println("=============="+xid+"==========================");


        int rows = storageMapper.storageDecrease(commodityCode, count);
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            throw new RuntimeException("除数不能为零");
        }

        if (rows < 0) {
            throw new RuntimeException("商品数量更改失败");
        }
    }
}
