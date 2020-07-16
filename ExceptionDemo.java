class ExceptionDemo
{public static void main(String args[])
{try
 {int x=5,y=0,Div=x/y;
  System.out.println(Div);
  throw new ArithmeticException("Divide by Zero");
  }
  catch(ArithmeticException ae)
   { System.out.println("AE="+ae);
   }
 }
}