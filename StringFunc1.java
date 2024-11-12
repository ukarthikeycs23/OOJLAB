import java.util.Scanner;
public class StringFunc1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        int len = s1.length();
        char arr[] = new char[len];
        for(int i=0;i<=len-1;i++)
        {
            char c = s1.charAt(i);
            arr[i] = c;
        }
        System.out.println("Array");
        for(int i=0;i<=len-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }    
}
