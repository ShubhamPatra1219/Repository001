package com.Arvind.Company.Day4;

public class SwitchCaseFallThrough {
    public static void main(String[] args) {
        int month = 3;
        switch(month)
        {
            case 1:
                System.out.println("January");
                //break;
            case 2:
                System.out.println("February");
                //break;
            case 3:
                System.out.println("March");
                //break;
            case 4:
                System.out.println("April");
                //break;
            default:
                System.out.println("Out of Condition");
        }

    }
}
