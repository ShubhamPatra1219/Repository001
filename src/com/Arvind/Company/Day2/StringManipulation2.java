package com.Arvind.Company.Day2;

public class StringManipulation2 {

    public static void main(String[] args) {
        //String name= " Hi Shubham, XXXX56777 for completing transaction use OTP 67845 ";
        String name = " Shubham#51615111232414 ";
        String fn = name.trim().split("#")[0];
        String acc = name.trim().split("#")[1];
        System.out.println(fn);
        System.out.println(acc);
    }

}
