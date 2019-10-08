package com.hc.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestCreateBean {
    public static void main(String[] args){
        System.out.println("factory before");
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
        System.out.println("factory after");
        beanFactory.getBean("user");
        System.out.println("application before");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println("application after");
        applicationContext.getBean("user");

    }
}
