package com.example.grade;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number To Find Grade = ");
        int grade = s.nextInt();
           if (grade > 101 && grade < 0){
            System.out.println("Invalid Entry! please try again :)");
          }  else if (grade >= 90) {
              System.out.println("Student is Grade is A !");
          } else if (grade >= 70) {
              System.out.println("Student is Grade is B !");
          } else if (grade >= 50) {
              System.out.println("Student is Grade is C !");
          } else if (grade <= 30) {
              System.out.println("Student is Grade is F !");
          }


    }
}
