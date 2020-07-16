import java.util.Scanner;
class Polynomial
{public static void main(String[] args) 
	{ String s ="y";
	  Scanner o = new Scanner(System.in);
	  System.out.println("Given Polynomial 7x3- 3x2 + 4x - 12");
	  
	  while(s.equals("y"))/*equals method = In Java, string equals() method compares the two given strings based on the data/content of the string. 
	                        If all the contents of both the strings are same then it returns true. If all characters are not matched then it returns false.*/
   { System.out.print("Enter x : ");
	      double x=o.nextDouble();
		  double poly = 7*x*x*x-x*x+4*x-12;
		  System.out.println("Result: "+poly);
	      System.out.print("Continue (enter y/n): ");
		  s=o.next();//next method - returns one word String value 
		  if(s.equals("n"))
	      System.out.println("Your Done.Thank You!! ");
	      else
	      { if(s.equals("y"))
			System.out.println();
		   else
		   System.out.println("x value should be in between 0 to n ");
	      }
  }
}
}