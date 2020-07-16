/* Find Biggest Number */

import java.util.Scanner;
class Big_Exam
{ public static void main(String args[])
 {
  Scanner o=new Scanner(System.in);
  System.out.println("Enter a and b value:");
  int a= o.nextInt();
  int b=o.nextInt();
  if(a>b)
  System.out.println("Biggest number: "+a);
  else if (a<b)
  System.out.println("Biggest number: "+b);
  else
  System.out.println("Entered numbers are same ");
 }
}
