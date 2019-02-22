package com.yb.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableEurekaServer指明这是一个eureka的服务注册中心服务
//默认情况下这个服务也是个eureka-client(客户端),必须制定一个eureka-server,
//所以需要在配置文件配置声明这个服务是一个server而不是client,实例在server注册后会发送心跳,心跳停止一定时间将被剔出除服务
@EnableEurekaServer
@SpringCloudApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}

