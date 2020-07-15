/* print array values */
import java.util.Scanner;
class Array_values
{public static void main(String[] ar)
	{int a[]=new int[5];
	 int i;
	 Scanner o = new Scanner(System.in);
	 System.out.println("Enter Array values: ");
	 for(i=0;i<5;i++)
		{a[i]=o.nextInt();
		}
		System.out.println("Array values Entered are :");
		for(i=0;i<5;i++)
		{
		System.out.println(a[i]);
		}
	}

}
