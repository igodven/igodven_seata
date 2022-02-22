package com.m520it.service.impl;

import com.m520it.dao.OrderMapper;
import com.m520it.domain.Order;
import com.m520it.feign.AccountService;
import com.m520it.feign.StorageService;
import com.m520it.service.OrderService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 23:06
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private AccountService accountService;

    @Autowired
    private StorageService storageService;

    @Override
    @GlobalTransactional
    public void saveOrder(Order order) {
        String xid= RootContext.getXID();
        System.out.println(xid);
        int rows = orderMapper.saveOrder(order);
        if (rows < 0) {
            throw new RuntimeException("订单下单失败");
        }
        //商品存储减少
        String s = storageService.storageDecrease(order.getCommodityCode(), order.getCount());
    //        if ("500".equals(s)) {
    //            throw new RuntimeException("操作失败");
    //        }

        //账户资金减少
        String s1 = accountService.accountDecrease(order.getUserId(), order.getMoney());
//        if ("500".equals(s1)) {
//            throw new RuntimeException("操作失败");
//        }

    }
}
