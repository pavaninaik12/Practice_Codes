import java.util.Scanner;
class DoubleDouble

{
  public static void main (String[] args) 
  { 
    final int basePrice  = 20000;   // base price in dollars
    final int pinPrice   =   250;   // pin stripe price
    final int brakePrice =   800;   // anti-lock brake price

    Scanner scan = new Scanner( System.in );    
    System.out.print("Do you want pin stripes (0 or 1)? ");
     
    int answer = scan.nextInt();
    int total=basePrice;       
    if (answer==1)
    {
      total= basePrice + pinPrice;
    }
    else
     {System.out.println("PLEASE ENTER 0 OR 1"); 
     }
    System.out.print("Do you want anti-lock brakes (0 or 1)? ");
    answer = scan.nextInt(); 
    if (answer==1)
    {
     total= total+ brakePrice;
    }
    else
     {System.out.println("PLEASE ENTER 0 OR 1"); 
     }
    System.out.println("Total cost is: $" + total); 
  }
}