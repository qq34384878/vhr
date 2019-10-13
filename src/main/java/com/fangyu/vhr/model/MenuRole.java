package com.fangyu.vhr.model;

import lombok.Data;

/**
 * 菜单角色关联表
 * Created by fangyu on 2019/10/8.
 */
@Data
public class MenuRole {
    private Integer id;

    /**
     * 菜单id
     */
    private Integer mid;

    /**
     * 角色id
     */
    private Integer rid;
}