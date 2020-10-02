package com.Arvind.Company.Day4;

public class Loops1 {
    public static void main(String[] args) {
        String name = "Arvind";
        //System.out.println(name.charAt(0));
        //System.out.println(name);
        for(int i = 0;i<name.length();i++)
            System.out.println(i+". "+name.charAt(i));
        System.out.println("Please Reverse it");
        //Decrement Loop
        for(int j = name.length()-1;j>=0;j--)
            System.out.println(j+". "+name.charAt(j));
    }
}

