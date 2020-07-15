import java.util.Scanner;
class Division
{public static void main(String args[])
  {int a,b,div;
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter a = ");
   a= obj.nextInt();
   System.out.println("Enter b = ");
   b= obj.nextInt();
   div = a/b;
   System.out.println("Division of 2 numbers="+div);
   }
}
