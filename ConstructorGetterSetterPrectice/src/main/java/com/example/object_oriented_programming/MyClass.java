package com.example.object_oriented_programming;
public class MyClass {
    public static void main(String[] args) {
        System.out.println("PERSON INFO");
        Person person1 = new Person("ahmed");
        Person person2 = new Person(22);
        Person person3 = new Person(5.11);
        Person person4 = new Person("ahmed",22);
        Person person5 = new Person("ahmed",22,"male");
        Person person6 = new Person("ahmed", 22,"male",5.11,0.234f,'1');

//        Person person7 = new Person();
//        Person person7 = new Person();
//        person1.setAge(22);
//        person1.setName("ahmed");
//        person1.setGender("male");
//        person1.setHeight(5.11);
//        System.out.println(person1.getAge());
//        System.out.println(person1.getName());
//        System.out.println(person1.getGender());
//        System.out.println(person1.getHeight());



//        System.out.println(person6.getName());
//        System.out.println(person6.getAge());
//        System.out.println(person6.getGender());
//        System.out.println(person6.getPhoneno());
//        System.out.println(person6.getHeight());
//        System.out.println(person6.getRollno());
        System.out.println("\n//////PERSON 1////\n");
        System.out.println(person1.getName());
        System.out.println(person1.getRollno());
        System.out.println(person1.getHeight());
        System.out.println(person1.getPhoneno());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
        System.out.println("\n/////PERSON 2////\n");
        System.out.println(person2.getName());
        System.out.println(person2.getGender());
        System.out.println(person2.getRollno());
        System.out.println(person2.getPhoneno());
        System.out.println(person2.getHeight());
        System.out.println("\n/////PERSON 3////\n");
        System.out.println(person2.getAge());
        System.out.println(person3.getName());
        System.out.println(person3.getAge());
        System.out.println(person3.getRollno());
        System.out.println(person3.getHeight());
        System.out.println(person3.getGender());
        System.out.println(person3.getPhoneno());
        System.out.println("\n/////PERSON 4////\n");
        System.out.println(person4.getName());
        System.out.println(person4.getAge());
        System.out.println(person4.getRollno());
        System.out.println(person4.getHeight());
        System.out.println(person4.getGender());
        System.out.println(person4.getPhoneno());
        System.out.println("\n/////PERSON 5////\n");
        System.out.println(person5.getName());
        System.out.println(person5.getAge());
        System.out.println(person5.getRollno());
        System.out.println(person5.getHeight());
        System.out.println(person5.getGender());
        System.out.println(person5.getPhoneno());
        System.out.println("\n/////PERSON 6////\n");
        System.out.println(person6.getName());
        System.out.println(person6.getAge());
        System.out.println(person6.getRollno());
        System.out.println(person6.getHeight());
        System.out.println(person6.getGender());
        System.out.println(person6.getPhoneno());
//        Person person2 = new Person("hassan");
//          Person person3 = new Person();
          //System.out.println();
    }
}
//        OOP prectice
//        java is pure OOP base language
//        oop is a object orianted programming so every thing call by the object
//        such as : fan is a object/instance . ON , Off its instance methods . Color , number etc its instance variable
//        System.out.println("main Class");
//        ExampleClass exampleClass = new ExampleClass();
//        System.out.println(exampleClass.eat());
//        System.out.println(exampleClass.walk());
//        System.out.println(exampleClass.sleep());
//        exampleClass.info();