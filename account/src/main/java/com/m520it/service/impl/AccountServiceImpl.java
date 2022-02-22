package com.m520it.service.impl;

import com.m520it.dao.AccountMapper;
import com.m520it.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 22:59
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void accountDecrease(String userId, Integer money) {
        accountMapper.accountDecrease(userId, money);
    }
}
