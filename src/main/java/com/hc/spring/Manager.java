package com.hc.spring;

import com.hc.spring.impBean.ChangeLetter;
import com.hc.spring.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User)applicationContext.getBean("user");
        System.out.println(user.getName());
        user.sayHello();
        ChangeLetter changeLetter = (ChangeLetter)applicationContext.getBean("lowerLetter");
        System.out.println(changeLetter.change());

        changeLetter = (ChangeLetter)applicationContext.getBean("upperLetter");
        System.out.println(changeLetter.change());

    }
}
