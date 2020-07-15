import java.util.Scanner;
class CheckEvenOdd
{
  public static void main(String args[])
  { int a;
    System.out.println("Enter a number:");
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    if (a%2 == 0)
    System.out.println("Entered number is Even");
    else
    System.out.println("Entered number is Odd");
  }
}  