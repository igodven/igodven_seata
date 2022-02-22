package com.m520it.service;

import org.apache.ibatis.annotations.Param;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 23:17
 * @description：
 * @modified By：
 * @version: $
 */
public interface StorageService {
    void storageDecrease(String commodityCode,Integer count);
}
