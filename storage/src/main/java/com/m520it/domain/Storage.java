package com.m520it.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 23:04
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class Storage implements Serializable {
    private Integer id;
    private String commodityCode;
    private Integer count ;
}
