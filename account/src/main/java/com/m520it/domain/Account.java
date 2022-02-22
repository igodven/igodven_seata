package com.m520it.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：chengw
 * @date ：Created in 2022/2/19 22:56
 * @description：这是账户的实体类
 * @modified By：
 * @version: $
 */
@Data
public class Account implements Serializable {

    private Integer id;
    private String userId;
    private Integer money;

}
