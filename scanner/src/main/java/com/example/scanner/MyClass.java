package com.example.scanner;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = s.nextLine();
        System.out.print("Name is "+ name);
    }
}
