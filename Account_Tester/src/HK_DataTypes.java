import java.util.*;
import java.io.*;

class HK_DataTypes{
    public static void main(String []argh)
    {Scanner sc = new Scanner(System.in);
        int t=sc.nextInt(); //this is to give input how many ever times you want to by using for loop we acheive it 
        for(int i=0;i<t;i++)
        {
            try
            {
                long a=sc.nextLong();
                System.out.println(a+" can be fitted in:");
                if(a>=-128 && a<=127)System.out.println("* byte");
                if(a>=-32768 && a<=32767)System.out.println("* short");
                if(a>=-2147483648 && a<=2147483647)System.out.println("* int");
                if(a>=-Math.pow(2,63) && a<=Math.pow(2,63))System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
           }
    }
}



