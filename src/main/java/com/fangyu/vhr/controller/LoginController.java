package com.fangyu.vhr.controller;

import com.fangyu.vhr.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangyu
 * @version v1.0.0
 * @since 2019/10/8 7:16 下午
 */
@RestController
public class LoginController {

    @GetMapping("/login")
//    @CrossOrigin("*")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录");
    }
}
