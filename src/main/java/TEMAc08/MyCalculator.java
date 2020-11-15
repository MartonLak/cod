package TEMAc08;

import java.util.Scanner;

public class MyCalculator

{
    public static double power(double a, double b)
    {
        double result = 0;
        if((a>0 && b>0) || (a>0 && b<0) ||(a<0 && b>0))
        {

            result = Math.pow(a, b);

        }
        return result;
    }

    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        Double number1 = in.nextDouble();
        Double number2 = in.nextDouble();
        if(number1 ==0 && number2 ==0)
        {
            throw new Exception("n and p should not be negative");
        }
        if(number1 <0 && number2 <0)
        {
            throw new Exception("n or p should not be negative");

        }
        else
            System.out.println(power(number1,number2));
    }

}
