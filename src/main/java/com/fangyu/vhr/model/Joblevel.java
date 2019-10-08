package com.fangyu.vhr.model;

import java.util.Date;

/**
 * Created by fangyu on 2019/10/8.
 */
public class Joblevel {
    private Integer id;

    /**
    * 职称名称
    */
    private String name;

    private Object titlelevel;

    private Date createdate;

    private Boolean enabled;

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

    public Object getTitlelevel() {
        return titlelevel;
    }

    public void setTitlelevel(Object titlelevel) {
        this.titlelevel = titlelevel;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}