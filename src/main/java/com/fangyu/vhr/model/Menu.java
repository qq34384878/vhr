package com.fangyu.vhr.model;

import lombok.Data;

import java.util.List;

/**
 * 菜单表
 *
 * @author fangyu
 * @date 2019/10/8
 */
@Data
public class Menu {
    private Integer id;

    /**
     * 请求路径规则
     */
    private String url;

    /**
     * 路由path
     */
    private String path;

    /**
     * 组件名称
     */
    private String component;

    /**
     * 组件名
     */
    private String name;

    /**
     * 菜单图标
     */
    private String iconCls;

    /**
     * Meta类信息
     */
    private Meta meta;

    /**
     * 父菜单id
     */
    private Integer parentId;

    /**
     * 是否可用
     */
    private Boolean enabled;

    private List<Menu> children;

    private List<Role> roles;

}