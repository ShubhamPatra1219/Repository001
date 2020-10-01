package com.Arvind.Company.Day3;

public class StringExample2 {

    public static void main(String[] args)
    {
        String browser = "chrOMe";
        /*if(browser.equalsIgnoreCase("Chrome"))
            System.out.println("Opening Chrome");
        else System.out.println("Wait...");*/

        if(browser.contains("chr"))
            System.out.println("Opening Chrome");
        else System.out.println("Wait...");

        //System.out.println(browser.charAt(3));
        for(int i = 0;i<browser.length();i++)
            System.out.println(browser.toLowerCase().charAt(i));
    }
}
