package com.m520it.controller;

import com.m520it.domain.Order;
import com.m520it.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 23:32
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/save")
    private String saveOrder(Order order) {
        try {
            orderService.saveOrder(order);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "用户下单成功";
    }

    @GetMapping("/get")
    public String test() {
        return "ok";
    }
}
