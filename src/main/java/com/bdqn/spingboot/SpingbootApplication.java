package com.bdqn.spingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpingbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpingbootApplication.class, args);
    }
}
