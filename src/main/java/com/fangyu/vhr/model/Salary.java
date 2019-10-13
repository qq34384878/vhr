package com.fangyu.vhr.model;

import lombok.Data;

import java.util.Date;

/**
 * 薪水表
 * Created by fangyu on 2019/10/8.
 */
@Data
public class Salary {
    private Integer id;

    /**
    * 基本工资
    */
    private Integer basicSalary;

    /**
    * 奖金
    */
    private Integer bonus;

    /**
    * 午餐补助
    */
    private Integer lunchSalary;

    /**
    * 交通补助
    */
    private Integer trafficSalary;

    /**
    * 应发工资
    */
    private Integer allSalary;

    /**
    * 养老金基数
    */
    private Integer pensionBase;

    /**
    * 养老金比率
    */
    private Double pensionPer;

    /**
    * 启用时间
    */
    private Date createDate;

    /**
    * 医疗基数
    */
    private Integer medicalBase;

    /**
    * 医疗保险比率
    */
    private Double medicalPer;

    /**
    * 公积金基数
    */
    private Integer accumulationFundBase;

    /**
    * 公积金比率
    */
    private Double accumulationFundPer;

    /**
     * 账套名称
     */
    private String name;

}