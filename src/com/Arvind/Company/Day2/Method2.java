package com.Arvind.Company.Day2;

public class Method2 {

    public void addNumber(int a, int b) {
        int sum = a + b;
        System.out.println("Addition of " + a + " and " + b + " is : " + sum);
    }

    //Method Overloading
    public void addNumber(int a, float b) {
        float sum = a + b;
        System.out.println("Addition of " + a + " and " + b + " is : " + sum);
    }

    public static void main(String[] args) {
        //Class Reference   -  Class Object
        Method2 me1 = new Method2();
        me1.addNumber(234, 234);
    }
    public static void main(String[] args,String[] arg) {
        //Class Reference   -  Class Object
        Method2 me = new Method2();
        me.addNumber(33,44.987f);

    }
}

