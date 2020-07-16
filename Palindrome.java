import java.util.Scanner;
class Palindrome
{public static void main(String args[])
  {int n,r,sum=0;
   Scanner o=new Scanner(System.in);
   System.out.print("Enter the value for n: ");
   n=o.nextInt();
   int temp=n;
   while(n>0)
   {r=n%10;
    sum=sum*10+r;
    n=n/10;
   }
   if (temp==sum)
   System.out.println("Number is Palindrome!");
   else
   System.out.println("Number is not a Palindrome!");
  }
}