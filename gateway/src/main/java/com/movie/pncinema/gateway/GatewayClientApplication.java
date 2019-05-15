package com.movie.pncinema.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 网关应用
 * @author leiyongqi
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayClientApplication.class,args);
    }

}
