package com.fangyu.vhr.model;

import lombok.Data;

import java.util.Date;

/**
 * 消息内容表
 *
 * @author fangyu
 * @date 2019/10/8
 */
@Data
public class MsgContent {
    private Integer id;

    /**
     * 消息标题
     */
    private String title;

    /**
     * 消息内容
     */
    private String message;

    /**
     * 创建时间
     */
    private Date createDate;

}