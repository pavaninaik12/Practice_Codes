import java.util.Scanner;
class SumAEO
{public static void main(String args[])
  {int SumA=0,SumE=0,SumO=0,count=1;
   Scanner o=new Scanner(System.in);
   System.out.print("Enter a Number: ");
   int N=o.nextInt();
   while(count<=N)
    { SumA=SumA+count;
       if(count%2==0)
        SumE=SumE+count;
       else
       SumO=SumO+count;
       count=count+1;
     }
    System.out.println("Sum of ALL Numbers till "+N+": "+SumA);
    System.out.println("Sum of Even Numbers till "+N+": "+SumE);
    System.out.println("Sum of Odd Numbers till "+N+": "+SumO);
    }
  }
        