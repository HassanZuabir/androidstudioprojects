package com.example.marksandattendance;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
while (true) {
    System.out.println("Enter Marks = ");
    int marks = s.nextInt();

    //if (marks < 0 && marks > 100 && attendance < 0 && attendance > 100) {
    //System.out.println("Invalid Input Please Try Again!");
    // }
    if (marks <=100 && marks >= 90) {
        System.out.println("Weldone! You have PASSED with Good score of " + marks);

    } else if (marks <= 90 && marks >= 80) {
        System.out.println("Weldone! You Have PASSED with Average score of " + marks);

    } else if (marks <= 80 && marks >= 70) {
        System.out.println("You Have PASSED with score of " + marks);

    } else if (marks <= 70 && marks >= 60) {
        System.out.println("You Have PASSED with score of" + marks + " . Try to improve it ! " );

    } else if (marks <= 60 && marks >= 50) {
        System.out.println("You Have PASSED with score of " + marks + " . Need to work hard ! ");

    } else if (marks <= 50 && marks >= 40) {
        System.out.println("You Have PASSED with not a Good score of " + marks + " . Need to work Harder");

    } else if (marks <= 40 && marks >= 0) {
        System.out.println("You Have Failed Your exams with score of" + marks);
    }
    System.out.println("Enter Attendance = ");
    int attendance = s.nextInt();

    if (attendance >= 90 && attendance <= 100) {
        System.out.println("Your Attendance is Good keep it up!");
    } else if (attendance >= 80 && attendance <= 90) {
        System.out.println("Your Attendance is Fair keep it up!");
    } else if (attendance >= 70 && attendance <= 80) {
        System.out.println("Your Attendance is Average !");
    } else if (attendance >= 60 && attendance <= 70) {
        System.out.println("Your Attendance is below Average Try to improve it !");
    } else if (attendance >= 50 && attendance <= 60) {
        System.out.println("You Should be Regular !");
    } else if (attendance >= 40 && attendance <= 50) {
        System.out.println("Warning!!! You Could Get YourSelf Expled !");
    } else if (attendance >= 30 && attendance <= 40) {
        System.out.println("Your are expled for the School ..... Contact the School Authority!");
    }
}
    }
}