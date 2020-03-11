package com.fangyu.vhr.model;

import lombok.Data;

/**
 * 角色表
 *
 * @author fangyu
 * @date 2019/10/8
 */
@Data
public class Role {
    private Integer id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色中文名称
     */
    private String nameZh;
}