package com.m520it.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/20 0:14
 * @description：
 * @modified By：
 * @version: $
 */
@Component
@FeignClient(value = "storage")
public interface StorageService {

    @PostMapping("/storage/decrease")
    String storageDecrease(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count);

}
