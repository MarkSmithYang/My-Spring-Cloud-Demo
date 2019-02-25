package com.yb.eurekaclientquery;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient表明自己是一个eureka client
//仅仅@EnableEurekaClient是不够的，还需要在配置文件中注明自己的服务注册中心的地址,
//即eureka server服务地址和端口
@EnableEurekaClient
@SpringCloudApplication
public class EurekaClientQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientQueryApplication.class, args);
    }

}

