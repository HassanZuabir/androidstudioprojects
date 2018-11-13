package com.example.forloop;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
//        2X1=2
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println( "2 X " +i +"= " +2 * i);

  ////Table by getting value from user      }
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number To Find Table = ");
        float x = s.nextFloat();
        float y = s.nextFloat();
        float z = s.nextFloat();
        for (float i = y; i <=z ; i++) {
            System.out.println( x + " X " +i +" = " +x * i);
        }



        //Continue and break statements use in loop
//        for (int i = 1; i <=10 ; i++) {
//            if(i==5){
//                continue;
//            }
//            System.out.println(i);
//        }
//        for (int i = 1; i <=10 ; i++) {
//            if(i==5){
//                break;
//            }
//            System.out.println(i);
//        }
//        int i = 1;
//
//        while ( i <= 10 )
//        {
//            if(i==5){
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
//        while ( i <= 10 )
//        {
//        }

//        System.out.print("Enter Any Number To Find Table : ");
//        int x = s.nextInt();
//        for loop to print 1 to 10 values like table
//        array initialize in 10 parameters
//        int[] a = new int[10];
//
//        for (int j:a) {
//            System.out.println(j);
//        }
    }
}
