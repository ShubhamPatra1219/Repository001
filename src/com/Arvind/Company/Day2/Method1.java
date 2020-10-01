package com.Arvind.Company.Day2;

public class Method1 {

    public void addNumber(int a,int b)
    {
        int sum = a+b;
        System.out.println(sum);
    }
    public int addNumber1(int a,int b)
    {
        int sum = a+b;
        System.out.println(sum);
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
        //Class Reference   -  Class Object
        Method1 me = new Method1();
        me.addNumber(10,20);
        me.addNumber(333,22);
        me.addNumber(765,23);
        int x = me.addNumber1(443,11);
        System.out.println(x/2*6);
        String val = me.studentName("Shubham");
        System.out.println(val);
        float f = me.per(4.444f);
        System.out.println(f);
    }
    public String studentName(String name)
    {
        return name;
    }

    public float per(float val)
    {
        return val;
    }
}
