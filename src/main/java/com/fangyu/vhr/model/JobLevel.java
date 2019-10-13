package com.fangyu.vhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 职称表
 * Created by fangyu on 2019/10/8.
 */
@Data
public class JobLevel {
    private Integer id;

    /**
    * 职称名称
    */
    private String name;

    /**
     * 职称等级
     */
    private Object titleLevel;

    /**
     * 创建日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    /**
     * 是否可用
     */
    private Boolean enabled;

}