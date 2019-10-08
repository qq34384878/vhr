package com.fangyu.vhr.model;

import java.util.Date;

/**
 * Created by fangyu on 2019/10/8.
 */
public class Oplog {
    private Integer id;

    /**
    * 添加日期
    */
    private Date adddate;

    /**
    * 操作内容
    */
    private String operate;

    /**
    * 操作员ID
    */
    private Integer hrid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public Integer getHrid() {
        return hrid;
    }

    public void setHrid(Integer hrid) {
        this.hrid = hrid;
    }
}