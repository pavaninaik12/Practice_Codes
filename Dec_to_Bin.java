import java.util.Scanner;

class Dec_to_Bin
{public static void main(String args[])
	{ int i=0,b,no;
	  int sum[]=new int[20];
	  Scanner abc = new Scanner(System.in);
      System.out.print("Enter a number to convert into Binary : ");
	  b=abc.nextInt();
	  no = b;
	  while(no!=0)
		{ sum[i]=(no%2);
	      i++;
	      no=no/2;	
		}
	   System.out.print("Your Binary number is: ");
	   while(i>=0)
		{
		System.out.print(sum[i]);
		--i;
		}
	}
}