package com.fangyu.vhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 员工评价表
 *
 * @author fangyu
 * @date 2019/10/8
 */
@Data
public class Appraise {
    private Integer id;

    private Integer eid;

    /**
    * 考评日期
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date appDate;

    /**
    * 考评结果
    */
    private String appResult;

    /**
    * 考评内容
    */
    private String appContent;

    /**
    * 备注
    */
    private String remark;

}