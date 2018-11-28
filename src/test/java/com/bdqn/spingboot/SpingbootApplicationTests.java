package com.bdqn.spingboot;

import com.bdqn.spingboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * springboot 单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpingbootApplicationTests {

    @Autowired
    Person person;

    @Autowired
    protected ApplicationContext ioc;

    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        System.out.println(person);
    }


    @Test
    public void test(){
//        boolean i = ioc.containsBean("helloSerivce");
//        System.out.println(i);

    }

    /**
     * 测试log
     */
    @Test
    public void log(){
       logger.info("//                       .::::.\n" +
               "                    .::::::::.\n" +
               "                   :::::::::::\n" +
               "                ..:::::::::::'\n" +
               "             '::::::::::::'\n" +
               "               .::::::::::\n" +
               "          '::::::::::::::..\n" +
               "               ..::::::::::::.\n" +
               "             ``::::::::::::::::\n" +
               "              ::::``:::::::::'        .:::.\n" +
               "             ::::'   ':::::'       .::::::::.\n" +
               "           .::::'      ::::     .:::::::'::::.\n" +
               "          .:::'       :::::  .:::::::::' ':::::.\n" +
               "         .::'        :::::.:::::::::'      ':::::.\n" +
               "        .::'         ::::::::::::::'         ``::::.\n" +
               "    ...:::           ::::::::::::'              ``::.\n" +
               "   ```` ':.          ':::::::::'                  ::::..\n" +
               "                      '.:::::'                    ':'````..\n" +
               "");
    }




}
