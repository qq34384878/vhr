package com.fangyu.vhr.exception;

import com.fangyu.vhr.model.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author fangyu
 * @version v1.0.0
 * @since 2019/10/10 10:03 下午
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SQLException.class)
    public RespBean SQLException(SQLException e){
        if (e instanceof SQLIntegrityConstraintViolationException) {
            return RespBean.error("该数据有关联数据, 操作失败!");
        }
        return RespBean.error("数据库异常, 操作失败!");
    }
}
