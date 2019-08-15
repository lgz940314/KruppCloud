package com.krupp.kruppgatewag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient //使用非Eureka注册中心时使用
public class KruppGatewagApplication {

    public static void main(String[] args) {
        SpringApplication.run(KruppGatewagApplication.class, args);
    }

}
