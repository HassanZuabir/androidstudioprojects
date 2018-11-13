package com.example.array_list_hashmaps;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("Enter Numbers = ");
        int x = s.nextInt();
        int[] a;
        a = new int[15];
        for (int i = 0; i <5 ; i++) {
            a[i]=s.nextInt();
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(a[i]);
        }
        }
     }
