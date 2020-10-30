package ro.fastrackit.temaC06;

public class Triangleofnumbers
{
    public static void pascalT(int number)
    {

        for(int i=0;i<number;i++)
        {
            for (int k=1; k<=number-i;k++)
            {
                System.out.print(" ");
            }
            int margini=1;

                for (int j = 0; j <= i; j++)
                {
                    if(j==0 || i==0)
                    {
                        margini=1;
                    }
                    else
                        margini=margini*(i-j+1)/j;
                    System.out.print(margini);
                    System.out.print(" ");
                }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        pascalT(9);
    }

}
