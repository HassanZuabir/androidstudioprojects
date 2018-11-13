package com.example.personcallingfunction;

public class OBJforperson {
    private String name  ;
    private String gender  ;
    private int age ;
    private long cnic ;

    public OBJforperson(String name1, String gender1, int age1, long cnic1) {
        this.name = name1;
        this.gender = gender1;
        this.age = age1;
        this.cnic = cnic1;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public long getCnic() {
        return cnic;
    }


}
