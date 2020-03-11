package com.fangyu.vhr.model;

import lombok.Data;

import java.util.Date;

/**
 * 员工培训表
 *
 * @author fangyu
 * @date 2019/10/8
 */
@Data
public class EmployeeTrain {
    private Integer id;

    /**
    * 员工编号
    */
    private Integer eid;

    /**
    * 培训日期
    */
    private Date trainDate;

    /**
    * 培训内容
    */
    private String trainContent;

    /**
    * 备注
    */
    private String remark;

}