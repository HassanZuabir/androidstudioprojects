package com.example.aswitch;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Who are you ? ");
        String name = s.nextLine();

        switch (name){

            case "ahmed" :
                System.out.println("Welcome ahmed");
                break;
            case "hassan" :
                System.out.println("Welcome hassan");
                break;
            case "ammar" :
                System.out.println("Welcome ammar");
                break;
            case "ali" :
                System.out.println("Welcome ali");
                break;
                default:
                    System.out.println("Entered wrong name !");
    }
}}
