package com.fangyu.vhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 职位表
 *
 * @author fangyu
 * @date 2019/10/8
 */
@Data
public class Position {
    private Integer id;

    /**
    * 职位
    */
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    private Boolean enabled;

}