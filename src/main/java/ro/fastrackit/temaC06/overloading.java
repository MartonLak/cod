package ro.fastrackit.temaC06;

public class overloading

{
    public static void printAnything(int a) {
        System.out.println(a);
    }
    public static void printAnything(long a) {
        System.out.println(a);
    }
    public static void printAnything(String a) {
        System.out.println(a);
    }
    public static void printAnything(Double a) {
        System.out.println(a);
    }
    public static void printAnything(Object a) {
        System.out.println(a);
    }
    public static void printAnything(int[] a) {
        System.out.println(a);
    }
    public static void printAnything(long[] a) {
        System.out.println(a);
    }

    public static void main(String[] args) {

        int a = 10;
        long b = 11;
        String c = "asd";
        Double d = 12.2;
        Object e = "test";
        int[] f = {0, 2, 3};
        long[] g = {69,88, 88, 72};

        printAnything(g[0]);
        printAnything( f[1]);
        printAnything(e);
        printAnything(d);
        printAnything(c);
        printAnything(b);
        printAnything( a);

    }
}
