import java.util.Scanner;
class MillionDollarInterestRate
{
  public static void main( String[] args )
  {
    double dollars = 1000.00 ;
    double rate;
    int year = 1;     
    Scanner o=new Scanner(System.in);
	System.out.println("Enter your Interest Rate: ");
	rate=o.nextDouble()/100.0;
    while ( year <= 40) // A result-controlled loop
    {
      dollars = dollars+dollars*rate;
      dollars = dollars+1000;
      year    = year+1;
    }

    System.out.println("After 40 years at " + (rate*100) + " interest rate you will reach "+dollars+" dollars.");
  }

}