package com.jb4dc.site.tl.webserver;

import com.jb4dc.sso.client.provide.ClientSessionProvide;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Created with IntelliJ IDEA.
 * User: zhuangrb
 * Date: 2020/6/4
 * To change this template use File | Settings | File Templates.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.jb4dc",excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {ClientSessionProvide.class}) )
@EnableFeignClients("com.jb4dc")
@EnableDiscoveryClient
public class ApplicationSiteWebServer {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationSiteWebServer.class, args);
    }
}
