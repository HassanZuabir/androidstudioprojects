package com.example.functionoverloading;

public class FuncOverloading {
//    Number of parameters , order of parameters , Datatype of parameters should not be same
    private String name = "Hassan";
    private int age = 20;
    private String bloodgroup = "A+"  ;
    private boolean gender = true;

    public String person1(){
        return name;

    }
    public int person2(){
        return age;

    }
    public String person3(){
        return bloodgroup;

    }
    public boolean person4(){
        return gender;
    }

}
