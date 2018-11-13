package com.example.object_oriented_programming;

public class Person {

    private  String name ;
    private  int age ;
    private  String gender ;
    private  double height ;
    private  float phoneno;

    private  char rollno;


    public Person() {
    }

    public Person(float phoneno) {
        this.phoneno = phoneno;

    }
    public Person(char rollno){
        this.rollno = rollno;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }


    public Person(double height) {
        this.height = height;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age, String gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;

    }

    public Person(String name, int age, String gender, double height, float phoneno, char rollno) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.phoneno = phoneno;
        this.rollno = rollno;
    }

    public float getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(float phoneno) {
        this.phoneno = phoneno;
    }

    public char getRollno() {
        return rollno;
    }

    public void setRollno(char rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
