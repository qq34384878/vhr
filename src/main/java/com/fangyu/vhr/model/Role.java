package com.fangyu.vhr.model;

/**
 * Created by fangyu on 2019/10/8.
 */
public class Role {
    private Integer id;

    private String name;

    /**
    * 角色名称
    */
    private String namezh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamezh() {
        return namezh;
    }

    public void setNamezh(String namezh) {
        this.namezh = namezh;
    }
}