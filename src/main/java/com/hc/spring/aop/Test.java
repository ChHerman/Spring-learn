package com.hc.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config-aop.xml");
        TestServiceInter testService = (TestServiceInter)ac.getBean("proxyFactoryBean");
        testService.sayHello();
        //当一个类继承多个接口，那么他们之间可以互转
        ((TestServiceInter2)testService).sayBye();
    }
}