import java.io.*;
import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int i=2;
        while(i<=num/2)
        {
            if(num%i==0)
            {
                System.out.println("Not Prime");
                break;
            }
            else
            {
                i++;
                if(i==num/2)
                {
                    System.out.println("Number is Prime");
                    break;
                }
            }
        }
    }
}
