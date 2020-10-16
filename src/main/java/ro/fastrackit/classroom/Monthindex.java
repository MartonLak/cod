package ro.fastrackit.classroom;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Monthindex
{
    public static void Displayaprime(int Month,int year)
    {
switch (Month) {
    case 1:
        System.out.println("31 Days");
        break;
    case 2:
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
            System.out.println("29 Days");
        } else {
            System.out.println("28 Days");
        }        break;
    case 3:
        System.out.println("31 Days");
        break;
    case 4:
        System.out.println("30 Days");
        break;
    case 5:
        System.out.println("31 Days");
        break;
    case 6:
        System.out.println("30 Days");
        break;
    case 7:
        System.out.println("31 Days");
        break;
    case 8:
        System.out.println("31 Days");
        break;
    case 9:
        System.out.println("30 Days");
        break;
    case 10:
        System.out.println("31 Days");
        break;
    case 11:
        System.out.println("30 Days");
        break;
    case 12:
        System.out.println("31 Days");
        break;
}
}

    public static void main(String[] args) {
        Displayaprime(2,1999);
    }

}

