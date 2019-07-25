package com.krupp.kruppcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KruppCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(KruppCenterApplication.class, args);
    }

}
