import java.io.*;
import java.util.Scanner;
class fib
{  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range n:");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        System.out.print(n3+" ");
        for(int i=0;i<=n;i++)
        {   
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            System.out.print(n3+" ");
        }
    }
}
