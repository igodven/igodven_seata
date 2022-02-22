package com.m520it.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 22:58
 * @description：这是订单的实体类
 * @modified By：
 * @version: $
 */
@Data
public class Order implements Serializable {

    private Integer id;
    private String userId;
    private String commodityCode;
    private Integer count;
    private Integer money;
}
