public class Test
{
public static void main(String args[])
 { new Test1();
 }
}

class A
{ public void a()
 {System.out.println("A-class-a-Method");
 }
}
class Test1 extends A
{ 
 public  Test1()
 {
 super(); 
 System.out.println("B-class-a-Method");
 }
 /*void b()
 {
 System.out.println("B-class-b-Method");
 }*/

}

