package com.netease.kaola;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hzwangqiqing
 * on 2018/4/3.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        SpringTestService springTestService = applicationContext.getBean(SpringTestService.class);
        SpringTestService springTestService1 = (SpringTestService) applicationContext.getBean("springTestService");
        springTestService.soutHelloworld();
        springTestService1.soutHelloworld();
        System.out.println("program is exit!");
    }
}
