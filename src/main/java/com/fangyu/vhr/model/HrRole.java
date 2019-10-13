package com.fangyu.vhr.model;

import lombok.Data;

/**
 * Hr角色表
 * Created by fangyu on 2019/10/8.
 */
@Data
public class HrRole {
    private Integer id;

    /**
     * hr(操作员)Id
     */
    private Integer hrId;

    /**
     * 角色id
     */
    private Integer rid;

}