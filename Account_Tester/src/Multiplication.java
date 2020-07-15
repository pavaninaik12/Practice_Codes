import java.util.Scanner;
class Multiplication
{public static void main(String args[])
  {int a,b,mul;
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter a = ");
   a= obj.nextInt();
   System.out.println("Enter b = ");
   b= obj.nextInt();
   mul = a*b;
   System.out.println("Multiplication of 2 numbers="+mul);
   }
}
