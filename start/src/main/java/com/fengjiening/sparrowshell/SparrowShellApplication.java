package com.fengjiening.sparrowshell;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SparrowShellApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SparrowShellApplication.class)
                .bannerMode(Banner.Mode.CONSOLE)//是否打印banner
                .web(WebApplicationType.NONE) //不会启动web服务
                .profiles("prod")
                .headless(false)//// Headless模式是系统的一种配置模式。在系统可能缺少显示设备、键盘或鼠标这些外设的情况下可以使用该模式。
                .run(args);
        //SpringApplication.run(SparrowShellApplication.class, args);
    }

}
