package com.makotogroup.intro;

public class TestOrder {
    public static void main(String[] args) {
        Orders person = new Orders(20, "Иван", "Саня", "2018 год 23 декабрь ", 2);
        System.out.println(person.toString());
    }
}
