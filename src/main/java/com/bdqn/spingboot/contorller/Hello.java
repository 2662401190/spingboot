package com.bdqn.spingboot.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 贺威
 * @create 2018-11-26 18:07
 */
@RestController
public class Hello {
    @RequestMapping("hello")
    public String hello(){

        return "hello";
    }
}
