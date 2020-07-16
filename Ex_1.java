import java.util.Scanner;
/*class Ex_2
{ public static void main(String args[])
	{ int sum=0;
	  int a[]={10,12};
	  for(int i=0;i<a.length;i++)
	 {
	  sum=sum+a[i];
	 }
     System.out.print("Sum : "+sum);
    }
}*/


class Ex_1
{public static void main(String args[])
	{int sum=0;
	 Scanner abc = new Scanner(System.in);
	 System.out.print("Enter a number you want to sum : ");
	 int n=abc.nextInt();
	 while(n>0)
		{
	     sum=sum+(n%10);
		 n=n/10;
		}
	System.out.println("Sum of the digits are : "+sum);
  }
}