package com.m520it.dao;

import com.m520it.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 23:08
 * @description：
 * @modified By：
 * @version: $
 */
@Mapper
public interface OrderMapper {

    int saveOrder(Order order);
}
