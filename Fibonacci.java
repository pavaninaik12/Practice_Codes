import java. util.*;
class Fibonacci
{public static void main(String args[])
 {Scanner obj = new Scanner(System.in);
  int first = 0,second=1,third,i,n;
  System.out.print("Enter till how many number n=");
  n=obj.nextInt();
  System.out.print(first+" "+second);
  for(i=2;i<=n;i++)
  { third=first+second;
    System.out.print(" "+third);
    first=second;
    second=third;
  }
 }
}