package com.hc.spring.impBean;

public class LowerLetter implements ChangeLetter {
    private String str;

    LowerLetter(){
        System.out.println("LowerLetter被创建");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String change() {
        return str.toLowerCase();
    }
}
