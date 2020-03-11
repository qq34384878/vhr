package com.fangyu.vhr.model;

import lombok.Data;

import java.util.Date;

/**
 * 员工奖惩表
 *
 * @author fangyu
 * @date 2019/10/8
 */
@Data
public class EmployeeEc {
    private Integer id;

    /**
    * 员工编号
    */
    private Integer eid;

    /**
    * 奖罚日期
    */
    private Date ecDate;

    /**
    * 奖罚原因
    */
    private String ecReason;

    /**
    * 奖罚分
    */
    private Integer ecPoint;

    /**
    * 奖罚类别，0：奖，1：罚
    */
    private Integer ecType;

    /**
    * 备注
    */
    private String remark;

}