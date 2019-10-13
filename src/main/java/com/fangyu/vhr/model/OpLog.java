package com.fangyu.vhr.model;

import lombok.Data;

import java.util.Date;

/**
 * 操作日志表
 * Created by fangyu on 2019/10/8.
 */
@Data
public class OpLog {
    private Integer id;

    /**
    * 添加日期
    */
    private Date addDate;

    /**
    * 操作内容
    */
    private String operate;

    /**
    * 操作员ID
    */
    private Integer hrId;
}