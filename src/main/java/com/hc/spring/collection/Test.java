package com.hc.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config-collection.xml");
        Department department = (Department)ac.getBean("department");
        System.out.println(department.getName());
//        取集合
        for(String empName:department.getEmpName()){
            System.out.println(empName);
        }
        System.out.println("取list...");
        for (Employee e:department.getEmpList()){
            System.out.println("name="+e.getName());
        }
        System.out.println("取set...");
        for (Employee e:department.getEmpSet()){
            System.out.println("name="+e.getName());
        }
        System.out.println("迭代器取map...");
        //1.迭代器
        Map<String,Employee> employeeMap = department.getEmpMap();
        Iterator iterator = employeeMap.keySet().iterator();
        while (iterator.hasNext()){
            String key = (String)iterator.next();
            Employee employee=employeeMap.get(key);
            System.out.println("key="+key+" "+ employee.getName());
        }
        System.out.println("entry取map...");
        //2.简洁(建议使用这种方式)
        for (Map.Entry<String,Employee> entry:department.getEmpMap().entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue().getName());
        }
        System.out.println("通过properties取数据");
        Properties properties = department.getPp();
        for (Map.Entry<Object,Object> entry:properties.entrySet()){
            System.out.println(entry.getKey().toString()+" "+entry.getValue());
        }
    }

}