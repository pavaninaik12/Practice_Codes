import java.util.Scanner;
class Distance 
{
	public static void main(String[] args) 
	{ final double g=9.80665,limit;
	  Scanner o=new Scanner(System.in);
	  System.out.print("Enter limit value: ");
	  limit = o.nextInt();
      for(int t=0;t<=(limit);t++)
		{ double time=t/10.0;
		  double d=(0.5)*g*time*time;
	     System.out.println("After "+time+" seconds,the brick has dropped = "+d+" meters.");// to get the time in 0.1,0.2 seconds
		}
	}
}
