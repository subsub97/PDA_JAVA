package org.example;

public class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public void buy(Phone phone ) {
        System.out.print(this.name + "님이 " +phone.brand + "을 구매했습니다.");
    }

    public void turnOn(Phone phone) {
        System.out.println(this.name + "님이 " + phone.brand + "을 켰습니다.");
    }
}
