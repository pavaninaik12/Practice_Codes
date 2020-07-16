//import java.util.Scanner;
class staticEx
{ int no;
  static String college = "ITS"; // memory allocated only once 
  String name ;

  void Kiran1(int i,String s)
	{no= i;
     name = s;
	}

  void display()
	{System.out.println(no+" "+name+" "+college);
	}
public static void main(String args[])
{ Kiran1 s1= new Kiran1(1,"Pav");
  Kiran1 s2= new Kiran1(2,"kir");
  s1.display();
  s2.display();
}
}


class Kiran1
{ int count = 0;
  
  Kiran1()
	  {count++;
       System.out.println(count);
	  }
 public static void main(String args[])
	{Kiran1 c1=new Kiran1();
     Kiran1 c2=new Kiran1();
	 Kiran1 c3=new Kiran1();
     // output will be 1 (3 times)
	}
}



class Kiran1
{static int count = 0; // here the memory allocated to static is only once and 
                       //if any object changes the value of the static variable, it will retain its value. 
  Kiran1()
	  {count++;// counter is incremented 
       System.out.println(count);
	  }
 public static void main(String args[])
	{Kiran1 c1=new Kiran1();
     Kiran1 c2=new Kiran1();
	 Kiran1 c3=new Kiran1();
     // output will be 1,2,3..
	}
}


// if you want to change the static variable

class Kiran1
{ int no;
  static String college = "ITS"; // memory allocated only once 
  String name ;
   
  static void change() // this will chane the name if you want to 
	{ college = "BDIT";
	}

  Kiran1(int i,String s)
	{no= i;
     name = s;
	}

  void display()
	{System.out.println(no+" "+name+" "+college);
	}
public static void main(String args[])
{ Kiran1.change();
  Kiran1 s1= new Kiran1(1,"Pav");
  Kiran1 s2= new Kiran1(2,"kir");
  s1.display();
  s2.display();
}
}




class Kiran1
{ static int cube(int x) //  here we are using static method and declaring int (return type)
	{return x*x*x;
	}
  public static void main(String args[])
	{ Scanner o=new Scanner(System.in);
      System.out.println("Enter value: ");
      int a=o.nextInt();
	  int result = Kiran1.cube(a);
	  System.out.println("Cube is : "+result);
	}
}


class Kiran1 // here this is to check which executes first - static block executes first always and then the main method 
{ static 
	{
	System.out.println("Static method");
	}
	public static void main(String args[])
	{
	System.out.println("Main method");
	}
}


class Kiran1 
{ int a=40;// if we give like this it will throw an error stating non static variable cannot be referenced
           //so we simply add static - static int a=40;
	public static void main(String args[])
	{
	System.out.println(a);
	}
}