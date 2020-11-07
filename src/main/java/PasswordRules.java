public class PasswordRules
{

    public static boolean checkPass1(String password)
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


    public static void main(String[] args)
    {
        String pass="A123sdasdasd";
        if (checkPass1(pass)==true && checkPass2(pass)==true && checkPass3(pass)==true && checkPass4(pass)==true)
        {
            System.out.println(pass + " is valid");
        }
        if (checkPass1(pass)==false)
        {
            System.out.println(pass + " at least 12 characters.");
        }
        if (checkPass2(pass)==false)
        {
            System.out.println(pass + " uppercase and lowercase.");
        }
        if (checkPass3(pass)==false)
        {
            System.out.println(pass + " letters and digits.");
        }
        if (checkPass4(pass)==false)
        {
            System.out.println(pass + " at least 3 digits.");
        }

    }
}
