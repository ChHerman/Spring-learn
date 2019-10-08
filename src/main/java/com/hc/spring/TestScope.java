package com.hc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        applicationContext.getBean("lowerLetter");
        applicationContext.getBean("lowerLetter");
        applicationContext.getBean("lowerLetter");
    }
}
