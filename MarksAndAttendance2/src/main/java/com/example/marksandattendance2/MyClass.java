package com.example.marksandattendance2;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Marks : ");
        int marks = s.nextInt();
        System.out.print("Enter Attendance : ");
        int attendance = s.nextInt();


            if (marks <= 100 && marks >= 90 && attendance <= 100 && attendance >= 90) {
                System.out.println("Execilent You Got " + marks + " Marks and your attendance is Execilent " + attendance + "%");
            } else if (marks <= 100 && marks >= 90 && attendance < 90 && attendance >= 80) {
                System.out.println(" Execilent You Got " + marks + " Marks and your attendance is Fair " + attendance + "%");
            } else if (marks <= 100 && marks >= 90 && attendance < 80 && attendance >= 70) {
                System.out.println(" Execilent You Got " + marks + " Marks and your attendance is Good " + attendance + "%");
            } else if (marks <= 100 && marks >= 90 && attendance < 70 && attendance >= 60) {
                System.out.println(" Execilent You Got " + marks + " Marks and your attendance is Well " + attendance + "%");
            } else if (marks <= 100 && marks >= 90 && attendance < 60 && attendance >= 50) {
                System.out.println(" Execilent You Got " + marks + " Marks and your attendance is Average " + attendance + "%");
            } else if (marks <= 100 && marks >= 90 && attendance < 50 && attendance >= 40) {
                System.out.println(" Execilent You Got " + marks + " Marks and your attendance is Below Average " + attendance + "%");
            } else if (marks <= 100 && marks >= 90 && attendance < 40 && attendance >= 30) {
                System.out.println(" Execilent You Got " + marks + " Marks and your attendance is Not Well " + attendance + "%");
            } else if (marks <= 100 && marks >= 90 && attendance < 30 && attendance >= 20) {
                System.out.println(" Execilent You Got " + marks + " Marks and your attendance is Bad " + attendance + "%");
            } else if (marks <= 100 && marks >= 90 && attendance < 20 && attendance >= 10) {
                System.out.println(" Execilent You Got " + marks + " Marks and your attendance is Worst" + attendance + "%");
            } else if (marks <= 100 && marks >= 90 && attendance < 10 && attendance >= 0) {
                System.out.println(" Execilent You Got " + marks + " Marks and your attendance is Not Acceptable " + attendance + "%");
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            else if (marks < 90 && marks >= 80 && attendance <= 100 && attendance >= 90) {
                System.out.println(" Fair! You Got " + marks + " Marks and your attendance is Execilent " + attendance + "%");
            } else if (marks < 90 && marks >= 80 && attendance < 90 && attendance >= 80) {
                System.out.println(" Fair! You Got " + marks + " Marks and your attendance is Fair " + attendance + "%");
            } else if (marks < 90 && marks >= 80 && attendance < 80 && attendance >= 70) {
                System.out.println(" Fair! You Got " + marks + " Marks and your attendance is Good " + attendance + "%");
            } else if (marks < 90 && marks >= 80 && attendance < 70 && attendance >= 60) {
                System.out.println(" Fair! You Got " + marks + " Marks and your attendance is Well " + attendance + "%");
            } else if (marks < 90 && marks >= 80 && attendance < 60 && attendance >= 50) {
                System.out.println(" Fair! You Got " + marks + " Marks and your attendance is Average " + attendance + "%");
            } else if (marks < 90 && marks >= 80 && attendance < 50 && attendance >= 40) {
                System.out.println(" Fair! You Got " + marks + " Marks and your attendance is Below Average " + attendance + "%");
            } else if (marks < 90 && marks >= 80 && attendance < 40 && attendance >= 30) {
                System.out.println(" Fair! You Got " + marks + " Marks and your attendance is Not Well " + attendance + "%");
            } else if (marks < 90 && marks >= 80 && attendance < 30 && attendance >= 20) {
                System.out.println(" Fair! You Got " + marks + " Marks and your attendance is Bad " + attendance + "%");
            } else if (marks < 90 && marks >= 80 && attendance < 20 && attendance >= 10) {
                System.out.println(" Fair! You Got " + marks + " Marks and your attendance is Worst " + attendance + "%");
            } else if (marks < 90 && marks >= 80 && attendance < 10 && attendance >= 0) {
                System.out.println(" Fair! You Got " + marks + " Marks and your attendance is Not Acceptable " + attendance + "%");
            }

            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            else if (marks < 80 && marks >= 70 && attendance <= 100 && attendance >= 90) {
                System.out.println(" Good! You Got " + marks + " Marks and your attendance is Execilent " + attendance + "%");
            } else if (marks < 80 && marks >= 70 && attendance < 90 && attendance >= 80) {
                System.out.println(" Good! You Got " + marks + " Marks and your attendance is Fair " + attendance + "%");
            } else if (marks < 80 && marks >= 70 && attendance < 80 && attendance >= 70) {
                System.out.println(" Good! You Got " + marks + " Marks and your attendance is Good " + attendance + "%");
            } else if (marks < 80 && marks >= 70 && attendance < 70 && attendance >= 60) {
                System.out.println(" Good! You Got " + marks + " Marks and your attendance is Well " + attendance + "%");
            } else if (marks < 80 && marks >= 70 && attendance < 60 && attendance >= 50) {
                System.out.println(" Good! You Got " + marks + " Marks and your attendance is Average " + attendance + "%");
            } else if (marks < 80 && marks >= 70 && attendance < 50 && attendance >= 40) {
                System.out.println(" Good! You Got " + marks + " Marks and your attendance is Below Average " + attendance + "%");
            } else if (marks < 80 && marks >= 70 && attendance < 40 && attendance >= 30) {
                System.out.println(" Good! You Got " + marks + " Marks and your attendance is Not Well " + attendance + "%");
            } else if (marks < 80 && marks >= 70 && attendance < 30 && attendance >= 20) {
                System.out.println(" Good! You Got " + marks + " Marks and your attendance is Bad " + attendance + "%");
            } else if (marks < 80 && marks >= 70 && attendance < 20 && attendance >= 10) {
                System.out.println(" Good! You Got " + marks + " Marks and your attendance is Worst " + attendance + "%");
            } else if (marks < 80 && marks >= 70 && attendance < 10 && attendance >= 0) {
                System.out.println(" Good! You Got " + marks + " Marks and your attendance is Not Acceptable " + attendance + "%");
            }

            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            else if (marks < 70 && marks >= 60 && attendance <= 100 && attendance >= 90) {
                System.out.println(" Well! You Got " + marks + " Marks and your attendance is Execilent " + attendance + "%");
            } else if (marks < 70 && marks >= 60 && attendance < 90 && attendance >= 80) {
                System.out.println(" Well! You Got " + marks + " Marks and your attendance is Fair " + attendance + "%");
            } else if (marks < 70 && marks >= 60 && attendance < 80 && attendance >= 70) {
                System.out.println(" Well! You Got " + marks + " Marks and your attendance is Good " + attendance + "%");
            } else if (marks < 70 && marks >= 60 && attendance < 70 && attendance >= 60) {
                System.out.println(" Well! You Got " + marks + " Marks and your attendance is Well " + attendance + "%");
            } else if (marks < 70 && marks >= 60 && attendance < 60 && attendance >= 50) {
                System.out.println(" Well! You Got " + marks + " Marks and your attendance is Average " + attendance + "%");
            } else if (marks < 70 && marks >= 60 && attendance < 50 && attendance >= 40) {
                System.out.println(" Well! You Got " + marks + " Marks and your attendance is Below Average " + attendance + "%");
            } else if (marks < 70 && marks >= 60 && attendance < 40 && attendance >= 30) {
                System.out.println(" Well! You Got " + marks + " Marks and your attendance is Not Well " + attendance + "%");
            } else if (marks < 70 && marks >= 60 && attendance < 30 && attendance >= 20) {
                System.out.println(" Well! You Got " + marks + " Marks and your attendance is Bad " + attendance + "%");
            } else if (marks < 70 && marks >= 60 && attendance < 20 && attendance >= 10) {
                System.out.println(" Well! You Got " + marks + " Marks and your attendance is Worst " + attendance + "%");
            } else if (marks < 70 && marks >= 60 && attendance < 10 && attendance >= 0) {
                System.out.println(" Well! You Got " + marks + " Marks and your attendance is Not Acceptable " + attendance + "%");
            }

            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            else if (marks < 60 && marks >= 50 && attendance <= 100 && attendance >= 90) {
                System.out.println(" Average! You Got " + marks + " Marks and your attendance is Execilent " + attendance + "%");
            } else if (marks < 60 && marks >= 50 && attendance < 90 && attendance >= 80) {
                System.out.println(" Average! You Got " + marks + " Marks and your attendance is Fair " + attendance + "%");
            } else if (marks < 60 && marks >= 50 && attendance < 80 && attendance >= 70) {
                System.out.println(" Average! You Got " + marks + " Marks and your attendance is Good " + attendance + "%");
            } else if (marks < 60 && marks >= 50 && attendance < 70 && attendance >= 60) {
                System.out.println(" Average! You Got " + marks + " Marks and your attendance is Well " + attendance + "%");
            } else if (marks < 60 && marks >= 50 && attendance < 60 && attendance >= 50) {
                System.out.println(" Average! You Got " + marks + " Marks and your attendance is Average " + attendance + "%");
            } else if (marks < 60 && marks >= 50 && attendance < 50 && attendance >= 40) {
                System.out.println(" Average! You Got " + marks + " Marks and your attendance is Below Average " + attendance + "%");
            } else if (marks < 60 && marks >= 50 && attendance < 40 && attendance >= 30) {
                System.out.println(" Average! You Got " + marks + " Marks and your attendance is Not Well " + attendance + "%");
            } else if (marks < 60 && marks >= 50 && attendance < 30 && attendance >= 20) {
                System.out.println(" Average! You Got " + marks + " Marks and your attendance is Bad " + attendance + "%");
            } else if (marks < 60 && marks >= 50 && attendance < 20 && attendance >= 10) {
                System.out.println(" Average! You Got " + marks + " Marks and your attendance is Worst " + attendance + "%");
            } else if (marks < 60 && marks >= 50 && attendance < 10 && attendance >= 0) {
                System.out.println(" Average! You Got " + marks + " Marks and your attendance is Not Acceptable " + attendance + "%");
            }

            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            else if (marks < 50 && marks >= 40 && attendance <= 100 && attendance >= 90) {
                System.out.println(" Below Average! You Got " + marks + " Marks and your attendance is Execilent " + attendance + "%");
            } else if (marks < 50 && marks >= 40 && attendance < 90 && attendance >= 80) {
                System.out.println(" Below Average! You Got " + marks + " Marks and your attendance is Fair " + attendance + "%");
            } else if (marks < 50 && marks >= 40 && attendance < 80 && attendance >= 70) {
                System.out.println(" Below Average! You Got " + marks + " Marks and your attendance is Good " + attendance + "%");
            } else if (marks < 50 && marks >= 40 && attendance < 70 && attendance >= 60) {
                System.out.println(" Below Average! You Got " + marks + " Marks and your attendance is Well " + attendance + "%");
            } else if (marks < 50 && marks >= 40 && attendance < 60 && attendance >= 50) {
                System.out.println(" Below Average! You Got " + marks + " Marks and your attendance is Average " + attendance + "%");
            } else if (marks < 50 && marks >= 40 && attendance < 50 && attendance >= 40) {
                System.out.println(" Below Average! You Got " + marks + " Marks and your attendance is Below Average " + attendance + "%");
            } else if (marks < 50 && marks >= 40 && attendance < 40 && attendance >= 30) {
                System.out.println(" Below Average! You Got " + marks + " Marks and your attendance is Not Well " + attendance + "%");
            } else if (marks < 50 && marks >= 40 && attendance < 30 && attendance >= 20) {
                System.out.println(" Below Average! You Got " + marks + " Marks and your attendance is Bad " + attendance + "%");
            } else if (marks < 50 && marks >= 40 && attendance < 20 && attendance >= 10) {
                System.out.println(" Below Average! You Got " + marks + " Marks and your attendance is Worst " + attendance + "%");
            } else if (marks < 50 && marks >= 40 && attendance < 10 && attendance >= 0) {
                System.out.println(" Below Average! You Got " + marks + " Marks and your attendance is Not Acceptable " + attendance + "%");
            }

            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            else if (marks < 40 && marks >= 30 && attendance <= 100 && attendance >= 90) {
                System.out.println(" Not Well! You Got " + marks + " Marks and your attendance is Execilent " + attendance + "%");
            } else if (marks < 40 && marks >= 30 && attendance < 90 && attendance >= 80) {
                System.out.println(" Not Well! You Got " + marks + " Marks and your attendance is Fair " + attendance + "%");
            } else if (marks < 40 && marks >= 30 && attendance < 80 && attendance >= 70) {
                System.out.println(" Not Well! You Got " + marks + " Marks and your attendance is Good " + attendance + "%");
            } else if (marks < 40 && marks >= 30 && attendance < 70 && attendance >= 60) {
                System.out.println(" Not Well! You Got " + marks + " Marks and your attendance is Well " + attendance + "%");
            } else if (marks < 40 && marks >= 30 && attendance < 60 && attendance >= 50) {
                System.out.println(" Not Well! You Got " + marks + " Marks and your attendance is Average " + attendance + "%");
            } else if (marks < 40 && marks >= 30 && attendance < 50 && attendance >= 40) {
                System.out.println(" Not Well! You Got " + marks + " Marks and your attendance is Below Average " + attendance + "%");
            } else if (marks < 40 && marks >= 30 && attendance < 40 && attendance >= 30) {
                System.out.println(" Not Well! You Got " + marks + " Marks and your attendance is Not Well " + attendance + "%");
            } else if (marks < 40 && marks >= 30 && attendance < 30 && attendance >= 20) {
                System.out.println(" Not Well! You Got " + marks + " Marks and your attendance is Bad " + attendance + "%");
            } else if (marks < 40 && marks >= 30 && attendance < 20 && attendance >= 10) {
                System.out.println(" Not Well! You Got " + marks + " Marks and your attendance is Worst " + attendance + "%");
            } else if (marks < 40 && marks >= 30 && attendance < 10 && attendance >= 0) {
                System.out.println(" Not Well! You Got " + marks + " Marks and your attendance is Not Acceptable " + attendance + "%");
            }

            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            else if (marks < 30 && marks >= 20 && attendance <= 100 && attendance >= 90) {
                System.out.println(" Bad! You Got " + marks + " Marks and your attendance is Execilent " + attendance + "%");
            } else if (marks < 30 && marks >= 20 && attendance < 90 && attendance >= 80) {
                System.out.println(" Bad! You Got " + marks + " Marks and your attendance is Fair " + attendance + "%");
            } else if (marks < 30 && marks >= 20 && attendance < 80 && attendance >= 70) {
                System.out.println(" Bad! You Got " + marks + " Marks and your attendance is Good " + attendance + "%");
            } else if (marks < 30 && marks >= 20 && attendance < 70 && attendance >= 60) {
                System.out.println(" Bad! You Got " + marks + " Marks and your attendance is Well " + attendance + "%");
            } else if (marks < 30 && marks >= 20 && attendance < 60 && attendance >= 50) {
                System.out.println(" Bad! You Got " + marks + " Marks and your attendance is Average " + attendance + "%");
            } else if (marks < 30 && marks >= 20 && attendance < 50 && attendance >= 40) {
                System.out.println(" Bad! You Got " + marks + " Marks and your attendance is Below Average " + attendance + "%");
            } else if (marks < 30 && marks >= 20 && attendance < 40 && attendance >= 30) {
                System.out.println(" Bad! You Got " + marks + " Marks and your attendance is Not Well " + attendance + "%");
            } else if (marks < 30 && marks >= 20 && attendance < 30 && attendance >= 20) {
                System.out.println(" Bad! You Got " + marks + " Marks and your attendance is Bad " + attendance + "%");
            } else if (marks < 30 && marks >= 20 && attendance < 20 && attendance >= 10) {
                System.out.println(" Bad! You Got " + marks + " Marks and your attendance is Worst " + attendance + "%");
            } else if (marks < 30 && marks >= 20 && attendance < 10 && attendance >= 0) {
                System.out.println(" Bad! You Got " + marks + " Marks and your attendance is Not Acceptable " + attendance + "%");
            }

            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            else if (marks < 20 && marks >= 10 && attendance <= 100 && attendance >= 90) {
                System.out.println(" Worst! You Got " + marks + " Marks and your attendance is Execilent " + attendance + "%");
            } else if (marks < 20 && marks >= 10 && attendance < 90 && attendance >= 80) {
                System.out.println(" Worst! You Got " + marks + " Marks and your attendance is Fair " + attendance + "%");
            } else if (marks < 20 && marks >= 10 && attendance < 80 && attendance >= 70) {
                System.out.println(" Worst! You Got " + marks + " Marks and your attendance is Good " + attendance + "%");
            } else if (marks < 20 && marks >= 10 && attendance < 70 && attendance >= 60) {
                System.out.println(" Worst! You Got " + marks + " Marks and your attendance is Well " + attendance + "%");
            } else if (marks < 20 && marks >= 10 && attendance < 60 && attendance >= 50) {
                System.out.println(" Worst! You Got " + marks + " Marks and your attendance is Average " + attendance + "%");
            } else if (marks < 20 && marks >= 10 && attendance < 50 && attendance >= 40) {
                System.out.println(" Worst! You Got " + marks + " Marks and your attendance is Below Average " + attendance + "%");
            } else if (marks < 20 && marks >= 10 && attendance < 40 && attendance >= 30) {
                System.out.println(" Worst! You Got " + marks + " Marks and your attendance is Not Well " + attendance + "%");
            } else if (marks < 20 && marks >= 10 && attendance < 30 && attendance >= 20) {
                System.out.println(" Worst! You Got " + marks + " Marks and your attendance is Bad " + attendance + "%");
            } else if (marks < 20 && marks >= 10 && attendance < 20 && attendance >= 10) {
                System.out.println(" Worst! You Got " + marks + " Marks and your attendance is Worst " + attendance + "%");
            } else if (marks < 20 && marks >= 10 && attendance < 10 && attendance >= 0) {
                System.out.println(" Worst! You Got " + marks + " Marks and your attendance is Not Acceptable " + attendance + "%");
            }

            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            else if (marks < 10 && marks >= 10 && attendance <= 100 && attendance >= 90) {
                System.out.println(" Worst! You Got " + marks + " Marks and your attendance is Execilent " + attendance + "%");
            } else if (marks < 10 && marks >= 0 && attendance < 90 && attendance >= 80) {
                System.out.println(" Worst! You Got " + marks + " Marks and your attendance is Fair " + attendance + "%");
            } else if (marks < 10 && marks >= 0 && attendance < 80 && attendance >= 70) {
                System.out.println(" Not Acceptable! You Got " + marks + " Marks and your attendance is Good " + attendance + "%");
            } else if (marks < 10 && marks >= 0 && attendance < 70 && attendance >= 60) {
                System.out.println(" Not Acceptable! You Got " + marks + " Marks and your attendance is Well " + attendance + "%");
            } else if (marks < 10 && marks >= 0 && attendance < 60 && attendance >= 50) {
                System.out.println(" Not Acceptable! You Got " + marks + " Marks and your attendance is Average " + attendance + "%");
            } else if (marks < 10 && marks >= 0 && attendance < 50 && attendance >= 40) {
                System.out.println(" Not Acceptable! You Got " + marks + " Marks and your attendance is Below Average " + attendance + "%");
            } else if (marks < 10 && marks >= 0 && attendance < 40 && attendance >= 30) {
                System.out.println(" Not Acceptable! You Got " + marks + " Marks and your attendance is Not Well " + attendance + "%");
            } else if (marks < 10 && marks >= 0 && attendance < 30 && attendance >= 20) {
                System.out.println(" Not Acceptable! You Got " + marks + " Marks and your attendance is Bad " + attendance + "%");
            } else if (marks < 10 && marks >= 0 && attendance < 20 && attendance >= 10) {
                System.out.println(" Not Acceptable! You Got " + marks + " Marks and your attendance is Worst " + attendance + "%");
            } else if (marks < 10 && marks >= 0 && attendance < 10 && attendance >= 0) {
                System.out.println(" Not Acceptable! You Got " + marks + " Marks and your attendance is Not Acceptable " + attendance + "%");
            }

        }
    }

