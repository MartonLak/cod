package ro.fastrackit.classroom;

public class Ifanumberisprime
{
    public static void CalculateIfanumberisprime(int i)
    {
        boolean check = false;

        for(int j=2;j<=i/2;j++)
        {
           if(i%j==0)
           {
                check=true;
                break;
           }
        }
        if(check==false)
        {
            System.out.println(i + " is a prime.");
        }
        else
            System.out.println(i + " isn't a prime.");

    }
    public static void main(String[] args)
    {
        CalculateIfanumberisprime(23);
    }

}
