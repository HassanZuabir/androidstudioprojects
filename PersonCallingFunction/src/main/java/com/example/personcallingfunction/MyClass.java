package com.example.personcallingfunction;

public class MyClass {
    public static void main(String[] args) {
        OBJforperson obJforperson = new OBJforperson("Hassan","Male",20,324234);

        System.out.println("Person Name is " + obJforperson.getName());
        System.out.println("Person Gender is " + obJforperson.getGender());
        System.out.println("Person Age is " + obJforperson.getAge());
        System.out.println("Person CNIC is " + obJforperson.getCnic());



    }


}
