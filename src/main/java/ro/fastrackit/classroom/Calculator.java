package ro.fastrackit.classroom;

import javax.print.DocFlavor;

public class Calculator {

    public static double Calculator1(double a, double b, String operator)
    {
        double result=0;

        if(operator=="+")
        {
            result=a+b;
        }
        if(operator=="-")
        {
            result=a-b;
        }
        if(operator=="*")
        {
            result=a*b;
        }
        if(operator=="/")
        {
            result=a/b;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Calculator1(1,3,"/"));
    }
}
