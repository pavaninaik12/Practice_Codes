import java.util.Scanner;
class Factorial
{public static void main(String args[])
  { int fact=1;
   Scanner o=new Scanner(System.in);
   System.out.print("Enter the value for n: ");
   int n=o.nextInt();
   for(int i=1;i<=n;i++)
	  {fact = fact*i;
      }
   if(n>0)
   System.out.println("Factorial of "+n+":"+fact);
   else
   System.out.println("N is an integer which should be in between 0 & 20");
  }
}