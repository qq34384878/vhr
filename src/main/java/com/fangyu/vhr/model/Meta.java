package com.fangyu.vhr.model;

import lombok.Data;

/**
 * 菜单Meta信息子类
 * @author fangyu
 * @version v1.0.0
 * @since 2019/10/9 1:48 上午
 */
@Data
public class Meta {

    /**
     * 菜单切换是否保活
     */
    private Boolean keepAlive;

    /**
     * 是否登录后才能访问
     */
    private Boolean requireAuth;

}
