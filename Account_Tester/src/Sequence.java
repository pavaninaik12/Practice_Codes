import java.util.Scanner;
class Sequence
{public static void main(String[] args) 
	{int a=1,b;
	 Scanner o=new Scanner(System.in);
	 System.out.print("Enter n: ");
	 int n = o.nextInt();
	 System.out.print("Enter d(difference): ");
	 int d = o.nextInt();
	 for(int i=0;i<=n;i++)
		{ b=a+i*d;
          System.out.print(b+" ");
		}  
        
	}
}
