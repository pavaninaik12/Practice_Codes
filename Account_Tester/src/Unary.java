import java.io.*;
class Unary
{
public static void main(String args[])
{System.out.println("PRE INCREMENT");

 int a  = 20;
 System.out.println("Increment(1)"+(++a));
 System.out.println("Increment(2)"+(++a));
 System.out.println("");

 System.out.println("POST INCREMENT");
 
 int b  = 20;
 System.out.println("Increment(1)"+(b++));
 System.out.println("Increment(2)"+(b++));
 System.out.println("");

 System.out.println("PRE & POST INCREMENT");
 
 int c  = 20;
 System.out.println("Increment(1)"+(++c));
 System.out.println("Increment(2)"+(c++));
 System.out.println("");

 System.out.println("POST & PRE INCREMENT");

 int d  = 20;
 System.out.println("Increment(1)"+(d++));
 System.out.println("Increment(2)"+(++d));
 System.out.println("");
}
}