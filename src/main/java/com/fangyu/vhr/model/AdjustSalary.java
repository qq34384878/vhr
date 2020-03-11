package com.fangyu.vhr.model;

import lombok.Data;

import java.util.Date;

/**
 * 员工调薪表
 *
 * @author fangyu
 * @date 2019/10/8
 */
@Data
public class AdjustSalary {
    private Integer id;

    private Integer eid;

    /**
    * 调薪日期
    */
    private Date asDate;

    /**
    * 调前薪资
    */
    private Integer beforeSalary;

    /**
    * 调后薪资
    */
    private Integer afterSalary;

    /**
    * 调薪原因
    */
    private String reason;

    /**
    * 备注
    */
    private String remark;
}