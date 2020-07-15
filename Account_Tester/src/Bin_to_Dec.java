import java.util.Scanner;
class Bin_to_Dec
{ public static void main(String args[])
	{ int j=1,b,dec=0;
	  Scanner abc = new Scanner(System.in);
      System.out.print("Enter a number to convert into Decimal : ");
	  b=abc.nextInt();
	  int no = b;
	  while(no!=0)
		{int remainder = no%10;
	     dec+=remainder*j;
		 j=j*2;
		 no=no/10;
		}
	  System.out.print("Your converted decimal number is " +dec);
    }
}