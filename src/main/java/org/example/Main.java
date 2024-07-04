package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("[실행 결과]");
        Person jobs = new Person("잡스");
        Person jea = new Person("재용");

        Phone galaxy = new Galaxy();
        Phone Iphone = new IPhone();

        jobs.buy(Iphone);
        jobs.turnOn(Iphone);

        System.out.println();

        jea.buy(galaxy);
        jea.turnOn(galaxy);
        }
    }