package org.example;

public class IPhone extends Phone{
    static final String BRAND_NAME = "애플폰";

    IPhone() {
        this.brand = BRAND_NAME;
    }
    @Override
    public void printIntro() {
        System.out.println("@@@ 폰 켜지는 중 @@@");
    }
}
