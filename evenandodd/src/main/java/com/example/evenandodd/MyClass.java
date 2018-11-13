package com.example.evenandodd;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number = ");
        int number = s.nextInt();
        if (number%2==0 )
            System.out.println("Number is even!");
        else
            System.out.println("Number is not even!");
    }
}
