import java.lang.*;
import java.io.*;

class Final_1
{final void add() // method over riding doesnt take place 
 {System.out.println("HEllo");
 }
}
class Final_2 extends Final_1
{void add()	
{
 System.out.println("World");
}
public static void main(String args[])
 { Final_1 o = new Final_1();
   o.add();
 }
}	


final class Final_3
{ void add() // class will not be inherited 
 {System.out.println("HEllo");
 }
}
class Final_4 extends Final_3
{void add()	
{
 System.out.println("World");
}
public static void main(String args[])
 { Final_3 o = new Final_3();
   o.add();
 }
}	

 class Final_5
{ void add() // class will not be inherited 
 {System.out.println("HEllo");
 }
}
class Final_6 extends Final_5
{void add()	
{ final int a = 5;// it cant post- increment value with final keyword
 System.out.println("World"+(a++));
}
public static void main(String args[])
 { Final_5 o = new Final_5();
   o.add();
 }
}	