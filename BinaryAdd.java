import java.util.Scanner;

class BinaryAdd
{public static void main(String args[])
	{ long b1,b2;
	  int i=0,carry=0;
	  int sum[]=new int[20];
	  Scanner abc = new Scanner(System.in);
      System.out.print("Enter a : ");
	  b1=abc.nextLong();
	  System.out.print("Enter b : ");
      b2=abc.nextLong();
	  while(b1!=0 || b2!=0)
		{ sum[i] =(int)(((b1%10)+(b2%10)+ carry) % 2);
	      i++;
		  carry = (int)(((b1%10)+(b2%10)+ carry) / 2);
		  b1=b1/10;
		  b2=b2/10;	
		}
	   if (carry!=0)
       {sum[i]=carry;
	   }
	  System.out.print("Sum of two Binary numbers: ");
	  while(i>=0)
		{ 
		  System.out.print(sum[i]);
		 --i;
		}

	}
}