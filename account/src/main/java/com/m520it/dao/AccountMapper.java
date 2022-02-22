package com.m520it.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 23:22
 * @description：
 * @modified By：
 * @version: $
 */
@Mapper
public interface AccountMapper {
    //订单生产成功,用户账户金额减少
    int accountDecrease(@Param("userId") String userId, @Param("money") Integer money);
}
