package com.Arvind.Company.Day3;

public class StringExample {

    public static void main(String[] args)
    {
        String name = "Hello Shubham, for completing tnx 4334 OTP xxxx6436";
        System.out.println(name.substring(6,12));
        System.out.println(name.replace("Shubham","Patra").replace("for","%&&^").toUpperCase());
    }
}
