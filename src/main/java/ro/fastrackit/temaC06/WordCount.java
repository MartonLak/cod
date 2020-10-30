package ro.fastrackit.temaC06;

public class WordCount
{
    public static int wordCounter(String text)
    {
        int result=1;
        for (int i=0;i<text.length();i++)
        {
            if (text.charAt(i)==' ') {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a=wordCounter("The quick brown fox jumps over the lazy dog.");
        System.out.println(a);
    }
}
