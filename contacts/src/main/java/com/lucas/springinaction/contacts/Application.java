package com.lucas.springinaction.contacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
@SpringBootApplication
public class Application {
    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        return new TomcatEmbeddedServletContainerFactory();

    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
