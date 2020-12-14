package TEMAc12;

public class RomantoInteger

{

    public static void romanToInt(String s)
    {
        char[] ch = new char[s.length()+1];
        int[] result =new int[s.length()+1];
        int toInt=0;
        for(int i=0; i<s.length();i++)
        {
            ch[i]=s.charAt(i);
        }
        for(int i=0; i<s.length();i++)
        {
            if(ch[i]=='I')
            {
                result[i]=1;
            }
            if(ch[i]=='V')
            {
                result[i]=5;
            }
            if(ch[i]=='X')
            {
                result[i]=10;
            }
            if(ch[i]=='L')
            {
                result[i]=50;
            }
            if(ch[i]=='C')
            {
                result[i]=100;
            }
            if(ch[i]=='D')
            {
                result[i]=500;
            }
            if(ch[i]=='M')
            {
                result[i]=1000;
            }
        }

        for(int i=1; i<=s.length();i++)
        {
            if(result[i-1]>result[i])
            {
                toInt=toInt+result[i-1];
            }
            if (result[i-1]==result[i])
            {
                toInt=toInt+result[i-1];
            }

            if (result[i-1]<result[i])
            {
                toInt=toInt-result[i-1];
            }
        }
        System.out.println("Result="+toInt);

    }
    public static void main(String[] args)
    {
        romanToInt("LIV");
    }
}
