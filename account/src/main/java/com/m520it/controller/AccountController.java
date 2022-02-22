package com.m520it.controller;

import com.m520it.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 23:26
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/decrease")
    public String accountDecrease(@RequestParam("userId") String userId, @RequestParam("money") Integer money) {
        try {
            accountService.accountDecrease(userId, money);
        } catch (Exception e) {
            return "500";
        }
        return "200";
    }
}
