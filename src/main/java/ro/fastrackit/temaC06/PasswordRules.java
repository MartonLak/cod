package ro.fastrackit.temaC06;

import java.util.Scanner;

public class PasswordRules extends Exception
{

    public static boolean checkPass1 (String password)
    {
        if(password.length()>=12)
        {
            return true;
        }
        else return false;
    }
    public static boolean checkPass2(String password)
    {
        char[] ch = new char[password.length()];
        int counterup=0;
        int counterlow=0;
        for (int j =0; j<password.length();j++)
        {
         ch[j]=password.charAt(j);
        }
        for(int i=0; i<password.length();i++)
        {
            if(Character.isLowerCase(ch[i])==true)
            {
                counterlow++;
            }
            if(Character.isUpperCase(ch[i])==true)
            {
                counterup++;
            }
        }
        if(counterlow!=0 && counterup!=0)
        {
            return true;
        }
        else  return false;
    }
    public static boolean checkPass3(String password)
    {
        int counterletter=0;
        int conterdigit=0;
        char[] ch = new char[password.length()];
        for (int j =0; j<password.length();j++)
        {
            ch[j]=password.charAt(j);
        }
        for (int j =0; j<password.length();j++)
        {
            ch[j]=password.charAt(j);
        }
        for (int i=0; i<password.length();i++) {
            if (Character.isLetter(ch[i]) == true) {
                counterletter++;
            }
            if (Character.isDigit(ch[i]) == true) {
                conterdigit++;
            }
        }
        if (conterdigit!=0 && counterletter!=0)
        {
            return true;
        }
        else  return false;
    }
    public static boolean checkPass4(String password)
    {
        int counterletter=0;
        int conterdigit=0;
        char[] ch = new char[password.length()];
        for (int j =0; j<password.length();j++)
        {
            ch[j]=password.charAt(j);
        }
        for (int i=0; i<password.length();i++)
        {
            if (Character.isDigit(ch[i]) == true) {
                conterdigit++;
            }
        }
        if (conterdigit>=3)
        {
            return true;
        }
        else  return false;
    }


    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String keyboardText = in.nextLine();
            try {
                ValidPass(keyboardText);
                System.out.println(checkPass3(keyboardText));
                System.out.println(checkPass4(keyboardText));
            }
            catch (Exception e)
            {
                System.err.println(e.getMessage());
                System.out.println(checkPass3(keyboardText));
                System.out.println(checkPass4(keyboardText));
            }
        }
    }

    public static void ValidPass(String pass) throws Exception
    {
        if (checkPass1(pass)==true && checkPass2(pass)==true && checkPass3(pass)==true && checkPass4(pass)==true)
        {
            System.out.println(pass+" Valid Password");
        }
        if ((checkPass1(pass)==false)&&(checkPass2(pass)==false)&&(checkPass3(pass)==false)&&(checkPass4(pass)==false))
        {
            throw new Exception(pass + " not enough long, uppercase and lowercase, letters and digits, at least 3 digits");
        }
        if(checkPass1(pass)==false&&(checkPass2(pass)==true)&&(checkPass3(pass)==true)&&(checkPass4(pass)==true))
        {
            throw new Exception(pass + "not enough long");
        }
        if(checkPass1(pass)==true&&(checkPass2(pass)==false)&&(checkPass3(pass)==true)&&(checkPass4(pass)==true))
        {
            throw new Exception(pass + "has uppercase and lowercase characters");
        }
        if(checkPass1(pass)==true&&(checkPass2(pass)==true)&&(checkPass3(pass)==false)&&(checkPass4(pass)==false))
        {
            throw new Exception(pass + "has only letters and digits, contains at least 3 digits.");
        }
        if(checkPass1(pass)==true&&(checkPass2(pass)==true)&&(checkPass3(pass)==true)&&(checkPass4(pass)==false))
        {
            throw new Exception(pass + "contains at least 3 digits.");
        }
    }
}
