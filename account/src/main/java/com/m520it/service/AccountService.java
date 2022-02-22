package com.m520it.service;

import org.apache.ibatis.annotations.Param;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 22:59
 * @description：
 * @modified By：
 * @version: $
 */
public interface AccountService {

    void accountDecrease(String userId,Integer money);

}
