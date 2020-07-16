import java.io.*;
import java.util.*;

public class HK_String
{
    public static void main(String[] args) {
    Scanner abc = new Scanner(System.in);
    int j =1;
    Boolean z=abc.hasNext();
    while(z)
    {String def =abc.nextLine();
     if(def.isEmpty()) // use to break the statement and close if string is empty
     break;
     else
     System.out.println(j+" "+def);
     j++;
     } 
   abc.close();
  }
}