package ro.fastrackit.classroom;

public class CheckIfPalindrome

{
    public static void Palindrome(int i)
    {
        int number1=0, number2=0,save;
        save=i;
        while(i>0)
        {
            number1=i%10;
            number2=(number2*10)+number1;
            i=i/10;
        }
        if(save==number2)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

    public static void main(String[] args) {
        Palindrome(1334421);
    }
}
