package com.hc.spring.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config-inherit.xml");
        Gradate gradate = (Gradate) ac.getBean("gradate");
        System.out.println(gradate.getName()+" "+gradate.getAge()+" "+gradate.getDegree());
    }
}
