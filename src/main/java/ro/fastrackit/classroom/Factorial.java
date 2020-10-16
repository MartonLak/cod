package ro.fastrackit.classroom;

public class Factorial
{

    public static int FactorialCalulate(int i)
    {
         int result=1;

        for (int j=2; j<=i;j++)
        {
            result=result*j;

        }
        return result;

    }
    static void printresult() {

        int Finaresult = FactorialCalulate(5);
        System.out.println(Finaresult);
    }
    public static void main(String[] args)
    {
        printresult();
    }

}
