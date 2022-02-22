package com.m520it.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 23:40
 * @description：
 * @modified By：
 * @version: $
 */
@Component
@FeignClient(value = "account")
public interface AccountService {

    @PostMapping("/account/decrease")
    String accountDecrease(@RequestParam("userId") String userId, @RequestParam("money") Integer money);
}
