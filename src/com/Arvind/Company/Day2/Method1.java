package com.Arvind.Company.Day2;

public class Method1 {

    //Access Modifier Object
    public void addNumber(int a,int b)
    {
        int sum = a+b;
        System.out.println("Addition of "+a+" and "+b+" is: "+sum);
    }
    public void addNum()
    {
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println("Addition of "+a+" and "+b+" is: "+sum);
    }
    public int addNumber1(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        /*int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);

        int aa = 120;
        int bb = 20;
        int sum1 = aa+bb;
        System.out.println(sum1);*/
        //Class Reference =  Class Object
        Method1 me = new Method1();
        me.addNumber(10,20);
        me.addNumber(333,444);
        me.addNumber(756,33);
        me.addNum();
        int x = me.addNumber1(856,457);
        System.out.println(x);
    }
}
