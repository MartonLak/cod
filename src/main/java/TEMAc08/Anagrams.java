package TEMAc08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams
{
    public static boolean isAnagram(String a, String b)
    {
        char[] ch1 = new char[a.length()];
        char[] ch2 = new char[b.length()];
        int counter =0;
        for (int i =0; i<a.length();i++)
        {
            ch1[i]=a.charAt(i);
        }
        for (int i =0; i<b.length();i++)
        {
            ch2[i]=b.charAt(i);
        }
        for (int i =0; i<a.length();i++)
        {
            Arrays.sort(ch1);
        }
        for (int j =0; j<b.length();j++)
        {
            Arrays.sort(ch2);

        }
        if(a.length()==b.length())
        {
            for (int i = 0; i < a.length(); i++) {
                if (ch1[i] != ch2[i]) {
                    counter++;
                }
            }
        }
        else
            return false;
        System.out.println(counter);
        if(counter==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(System.in);
        String keyboardText1 = in.nextLine();
        String keyboardText2 = in.nextLine();
        if(isAnagram(keyboardText1,keyboardText2)==true)
        {
            System.out.println("Anagram");
        }
        if(isAnagram(keyboardText1,keyboardText2)==false)
        {
          throw new Exception("InvalidAnagramException");
        }
    }
}
