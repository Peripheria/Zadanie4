package NODK;

import java.util.*;

public class NODK
{

    public static void NOK(int x, int n)
    {
        int j;
        if (x<n) j=n;
        else j=x;
        boolean t=true;
        while (t)
        {
            if ((j%x == 0) && (j%n == 0)) break;
            else j+=1;
        }
        System.out.println("НОК:" + j);
    }

    static void NOD(int x, int n, int a) {
        a = x % n;
        x = n;
        n = a;

        if (a > 0)
            NOD(x, n, a);
        else
            System.out.println("НОД:" + x);
    }


    public static void input()
    {
        String str;
        Scanner el = new Scanner(System.in);
        System.out.print("VVEDITE PERVOE CHISLO: ");
        str = el.nextLine();
        int x = Integer.parseInt(str);
        System.out.print("VVEDITE VTOROE CHISLO: ");
        str = el.nextLine();
        int n = Integer.parseInt(str);

        NOK(x,n);
        int a = 0;
        NOD(x, n, a);


    }


    public static void main(String[] args)
    {
        input();
    }
}
