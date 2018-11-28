package com.bdqn.spingboot.config;

import com.bdqn.spingboot.Service.HelloSerivce;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 贺威
 * @create 2018-11-27 13:58
 * @Configuration 指明当前类是一个配置类
 */

@Configuration
public class MyAppconfig {

    /**
     *  @Bean将方法的返回值添加到容器当中；容器中这个组件默认的id  就是方法名
     * @return
     */
    @Bean
    public HelloSerivce helloSerivce(){
        System.out.println("进来");
        return  new HelloSerivce();
    }

}
