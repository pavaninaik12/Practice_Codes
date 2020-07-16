import java.util.Random;
import java.util.Scanner;

public class Random1
{

  public static void main ( String[] args )
  {
    Scanner scan = new Scanner( System.in );
    Random rand = new Random();
    String line2="y";
    while(line2.equals("y"))
    {
      System.out.print("You toss a ");
	  System.out.println((rand.nextInt(6)+1)+(rand.nextInt(6)+1));
      String line = scan.nextLine();
      System.out.print("Do you wish to continue:(y/n): ");
      line2 = scan.next();
       if(line2.equals("n"))
	   System.out.println("Your done");
		
	  }
    }
  } 