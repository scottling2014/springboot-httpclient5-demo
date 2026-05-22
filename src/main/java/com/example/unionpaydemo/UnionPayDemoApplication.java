package com.example.unionpaydemo;

import com.example.unionpaydemo.config.UnionPayHttpProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(UnionPayHttpProperties.class)
public class UnionPayDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnionPayDemoApplication.class, args);
    }
}
