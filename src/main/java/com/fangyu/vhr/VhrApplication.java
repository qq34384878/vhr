package com.fangyu.vhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.fangyu.vhr.mapper")
public class VhrApplication {
//
//    //设置时区 相差8小时
//    @PostConstruct
//    void started() {
//        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
//    }


    public static void main(String[] args) {
        SpringApplication.run(VhrApplication.class, args);
    }

}
