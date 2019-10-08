package com.hc.spring.bean;

public class User {
    private String name;
    private User2 user2;

    User(){
        System.out.println("User被创建");
    }

    public User2 getUser2() {
        return user2;
    }

    public void setUser2(User2 user2) {
        this.user2 = user2;
    }

    public void sayHello(){
        System.out.println("hello"+ name);
        user2.sayBye();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
