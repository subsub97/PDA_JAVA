package org.example;

public class Galaxy  extends Phone{
    static final String BRAND_NAME = "삼송폰";

    Galaxy() {
        this.brand = BRAND_NAME;
    }

    @Override
    public void printIntro() {
        System.out.println("*** 폰 켜지는 중 ***");
    }
}