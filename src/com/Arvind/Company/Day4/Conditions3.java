package com.Arvind.Company.Day4;

import java.util.Scanner;

public class Conditions3
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int marks = scn.nextInt();
        //int marks = 801;
        if(marks<35)
            System.out.println("FAIL");
        else if (marks>=35 && marks <45)
            System.out.println("PASS Class");
        else if (marks>=45 && marks<55)
            System.out.println("SECOND Class");
        else if (marks>=55 && marks<=100)
            System.out.println("FIRST Class");
        else System.out.println("Contact Admin");
    }
}
