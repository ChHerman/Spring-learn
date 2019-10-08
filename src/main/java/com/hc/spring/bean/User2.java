package com.hc.spring.bean;

public class User2 {
    private String name;

    public void sayBye(){
        System.out.println("Bye," + name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
