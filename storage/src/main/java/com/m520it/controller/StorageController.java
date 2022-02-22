package com.m520it.controller;

import com.m520it.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 23:35
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@RequestMapping("storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping("/decrease")
    public String storageDecrease(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count) {

        try {
            storageService.storageDecrease(commodityCode, count);
        } catch (Exception e) {
            return "500";
        }
        return "200";
    }
}
