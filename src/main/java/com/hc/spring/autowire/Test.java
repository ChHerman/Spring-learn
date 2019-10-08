package com.hc.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config-autowire.xml");
        Master master = (Master)ac.getBean("master");
        System.out.println(master.getName()+"养了只狗，它的名字叫"+ master.getDog().getName()+"，他今年"+master.getDog().getAge()+"岁了");
    }
}