package ro.fastrackit.classroom;

public class DisplayAprime

{

    public static boolean Displayaprime(int i)
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
        if (check==false) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args)
    {
       int givennumber=132;
       for(int j=0;j<givennumber;j++)
       {
           if(Displayaprime(j)==true)
           {
               System.out.println(j);
           }
       }
    }

}
