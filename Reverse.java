import java.util.*;
import java.util.Scanner;
public class Reverse
{
    public static void main(String args[])
    {
        String s;
        Scanner obj=new Scanner(System.in);
        s=obj.next();
        String str[]=s.split("\\.");
        int n=str.length;
        for(int i=n-1; i>0; i--)
        {
            System.out.print(str[i]+".");
        }
        System.out.print(str[0]);
    }
}