import java.util.Scanner;
class Dummy 
{
	public static void main(String[] args) 
	{ 
	  Scanner o=new Scanner(System.in);
	  System.out.print("Enter g value: ");
	  final double g = o.nextInt(); /* to find the error for final = cannot assign a variable for final */
      for(g=1;g<=4;g++)
		{
	     System.out.println(+g);;
		}
	}
}
