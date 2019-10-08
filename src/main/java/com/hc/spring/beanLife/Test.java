package com.hc.spring.beanLife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        PersonService person1= (PersonService) ac.getBean("personService");
        person1.sayHi();
    }
}
