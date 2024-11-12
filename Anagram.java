import java.util.Scanner;
public class Anagram 
{
    public static boolean AnagramCheck(String s1, String s2)
    {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1!=len2)
            return false;
        else
        {
            int b1, sum1=0;
            int b2, sum2=0;
            byte[] byte1 = s1.getBytes();
            byte[] byte2 = s2.getBytes();
            for(int i=0;i<len1;i++)
            {
                b1 = byte1[i];
                sum1 += b1;  
            }
            for(int i=0;i<len2;i++)
            {
                b2 = byte2[i];
                sum2+= b2;
            }
            if(sum1==sum2)
                return true;
            else 
                return false;
        }
    }
    public static void main(String args[])
    {
        String s1 = "software";
        String s2 = "swareoft";
        System.out.println(AnagramCheck(s1, s2));
    }   
}

