class A
{ void a()
 {System.out.println("A-class-a-Method");
 }
 void d()
	{
	System.out.println("d-Method");	
	}
}
class Dog3 extends A
{ void c()
 {
 System.out.println("B-class-a-Method");
 }
 void b()
 {super.d(); //...SUPER - Key Word...
 System.out.println("B-class-b-Method");
 }
 public static void main(String args[])
 { Dog3 b1=new Dog3(); 
   b1.b();
 }
}