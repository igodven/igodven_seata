package com.m520it.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 23:12
 * @description：
 * @modified By：
 * @version: $
 */
@Mapper
public interface StorageMapper {
    int storageDecrease(@Param("commodityCode") String commodityCode, @Param("count") Integer count);
}
