import java.io.*;
import java.util.Scanner;
public class Largest {
    public static void main(String args[])
    {int i;
        System.out.println("enter no");
        Scanner s=new Scanner(System.in);
        
        
          int a=s.nextInt();
          int b=s.nextInt();
          int c=s.nextInt();
       int large=a;
        if(b>a&&b>c)
        {large=b;
        }
        if(c>a && c>b)
        {large=c;
        }
        System.out.println(large); 
        }
           
    }
    

