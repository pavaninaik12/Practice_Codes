import java.util.Scanner;
class Subtraction
{public static void main(String args[])
  {int a,b,sub;
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter a = ");
   a= obj.nextInt();
   System.out.println("Enter b = ");
   b= obj.nextInt();
   sub = a-b;
   System.out.println("Subtraction of 2 numbers="+sub);
   }
}
