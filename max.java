import java.io.*;
import java.util.Scanner;
class max
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("Max:"+a);
        }
        else if(b>c)
        {
            System.out.println("Max:"+b);
        }
        else
        {
            System.out.println("Max:"+c);
        }
    }
}
