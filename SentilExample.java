import java.util.Scanner;
class SentilExample
{public static void main(String[] args) 
	{ int sum=0,count=0;
	  String suffix;
	  Scanner o = new Scanner(System.in);
	  System.out.print("Enter 1st Integer to Add up(Enter 0 to Quit): ");
	  int n=o.nextInt();
	  while(n!=0)
		{ sum = sum+n;
	      count = count+1;
		  if((count+1)==2)
			{
			 suffix="nd";
			}
		else{
		  if ((count+1)==3)
		  {
			 suffix="rd";
		  }
		  else
			  suffix="th";
		    }
   
	      System.out.print("Enter "+(count+1)+(suffix)+" Integer to Add up(Enter 0 to Quit): ");
		  n=o.nextInt();
		}
      System.out.print("Sum of the Integers: "+sum);
	}
}
