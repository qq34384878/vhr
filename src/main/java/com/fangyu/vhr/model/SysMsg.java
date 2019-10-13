package com.fangyu.vhr.model;

import lombok.Data;

/**
 * 系统消息表
 * Created by fangyu on 2019/10/8.
 */
@Data
public class SysMsg {
    private Integer id;

    /**
    * 消息id
    */
    private Integer mid;

    /**
    * 0表示群发消息
    */
    private Integer type;

    /**
    * 这条消息是给谁的
    */
    private Integer hrId;

    /**
    * 0 未读 1 已读
    */
    private Integer state;
}