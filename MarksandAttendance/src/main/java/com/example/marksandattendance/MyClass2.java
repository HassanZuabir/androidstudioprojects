package com.example.marksandattendance;
import java.util.Scanner;
public class MyClass2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Marks ");
            int marks = s.nextInt();
            System.out.println("Enter attendance");
            int att = s.nextInt();

            //if (marks < 0 && marks > 100 && attendance < 0 && attendance > 100) {
            //System.out.println("Invalid Input Please Try Again!");
            // }
            if (marks <= 100 && marks >= 60 && att <= 100 && att >= 60) {
                System.out.println(" wow you got " + marks + " marks and " + att + " Attendance also Welldone");
            } else if (marks <= 100 && marks >= 60 && att < 60 && att >= 30) {
                System.out.println(" wow you got " + marks + " marks and " + att + " Attendance Normal");
            } else if (marks <= 100 && marks >= 60 && att < 30 && att >= 0) {
                System.out.println(" wow you got " + marks + " marks and " + att + " Attendance Fail So you are fail ");
            }
//            else if ( marks <= 60 && marks >= 30 ) {
            else if (marks <= 60 && marks >= 30 && att <= 100 && att >= 60)
                System.out.println("You have normal " + marks + " marks and " + att + " Attendance also Welldone");
            else if (marks <= 60 && marks >= 30 && att < 60 && att >= 30) {
                System.out.println("You have normal" + marks + " marks and " + att + " Attendance Normal");
            } else if (marks <= 60 && marks >= 30 && att < 30 && att >= 0) {
                System.out.println("You have normal " + marks + " marks and " + att + " Attendance Fail");
            }
//            else if (marks <= 30 && marks >= 0 ) {
            else if (marks <= 30 && marks >= 0 && att <= 100 && att >= 60) {
                System.out.println("Fail " + marks + " marks and " + att + " Attendance Welldone");
            } else if (marks <= 30 && marks >= 0 && att < 60 && att >= 30) {
                System.out.println("Fail" + marks + " marks and " + att + " Attendance Normal");
            } else if (marks <= 30 && marks >= 0 && att < 30 && att >= 0) {
                System.out.println("Fail" + marks + " marks and " + att + " Attendance Fail");
            }
        }
    }
}





















//                System.out.println("Weldone! You have PASSED with Good score of " + marks);

//            } else if (marks <= 90 && marks >= 80) {
//                System.out.println("Weldone! You Have PASSED with Average score of " + marks);
//
//            } else if (marks <= 80 && marks >= 70) {
//                System.out.println("You Have PASSED with score of " + marks);
//
//            } else if (marks <= 70 && marks >= 60) {
//                System.out.println("You Have PASSED with score of" + marks + " . Try to improve it ! " );
//
//            } else if (marks <= 60 && marks >= 50) {
//                System.out.println("You Have PASSED with score of " + marks + " . Need to work hard ! ");
//
//            } else if (marks <= 50 && marks >= 40) {
//                System.out.println("You Have PASSED with not a Good score of " + marks + " . Need to work Harder");
//
//            } else if (marks <= 40 && marks >= 0) {
//                System.out.println("You Have Failed Your exams with score of" + marks);
//            }
//            System.out.println("Enter Attendance = ");
//            int attendance = s.nextInt();
//
//            if (attendance >= 90 && attendance <= 100) {
//                System.out.println("Your Attendance is Good keep it up!");
//            } else if (attendance >= 80 && attendance <= 90) {
//                System.out.println("Your Attendance is Fair keep it up!");
//            } else if (attendance >= 70 && attendance <= 80) {
//                System.out.println("Your Attendance is Average !");
//            } else if (attendance >= 60 && attendance <= 70) {
//                System.out.println("Your Attendance is below Average Try to improve it !");
//            } else if (attendance >= 50 && attendance <= 60) {
//                System.out.println("You Should be Regular !");
//            } else if (attendance >= 40 && attendance <= 50) {
//                System.out.println("Warning!!! You Could Get YourSelf Expled !");
//            } else if (attendance >= 30 && attendance <= 40) {
//                System.out.println("Your are expled for the School ..... Contact the School Authority!");
//            }

