class Ant
{public void a()
 {System.out.println("A-class-a-Method");
 }
}
class B_super extends Ant
 {void b()
  {
   System.out.println("B-class-b-Method");
  }
  
 public void a()
 {
 super.a(); //...SUPER - Key Word...
 System.out.println("B-class-a-Method");
 }
 }
 
class Super_Keyword extends B_super
{ public static void main(String args[])
 { Super_Keyword cat =new Super_Keyword();
   cat.a();
 }
}