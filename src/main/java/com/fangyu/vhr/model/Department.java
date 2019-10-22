package com.fangyu.vhr.model;

import lombok.Data;

import java.util.List;

/**
 * 部门表
 * Created by fangyu on 2019/10/8.
 */
@Data
public class Department {
    private Integer id;

    /**
    * 部门名称
    */
    private String name;

    /**
     * 父部门id
     */
    private Integer parentId;

    /**
     * 部门path
     */
    private String depPath;

    /**
     * 是否可用
     */
    private Boolean enabled;

    /**
     * 是否为父部门
     */
    private Boolean isParent;

    private List<Department> children;

}