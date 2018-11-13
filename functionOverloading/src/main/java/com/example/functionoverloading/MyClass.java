package com.example.functionoverloading;

public class MyClass {
    public static void main(String[] args) {
FuncOverloading funcOverloading= new FuncOverloading();
//        funcOverloading.work("Hassan");
//        funcOverloading.work(20);
//        funcOverloading.work((float) 4.143);
//        funcOverloading.work(true);
        System.out.println("Name is " + funcOverloading.person1());
        System.out.println("Age is " + funcOverloading.person2());
        System.out.println("BloodGroup is " + funcOverloading.person3());
        System.out.println("It is " + funcOverloading.person4());


    }

}
