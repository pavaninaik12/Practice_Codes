class default_cons
{int i;
 String s;
 void toe1() // creating a default method
	{ 
	  System.out.println(i+"+"+s);// it will give its own default values like 0 for int and null for string 
	}
 public static void main(String args[])
	{ default_cons d = new default_cons();// creating a default constructor
      d.toe1(); // calling the default constructor
	}
}

class Kiran1{  
    int id,age;  
    String name;  
    //constructor to initialize integer and string  
    Kiran1(int i,String n){  
    id = i;  
    name = n;  
    }  
    //constructor to initialize another object  
    Kiran1(Kiran1 s,int a){  
    id = s.id;  
    name =s.name;
	age = a;
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Kiran1 s1 = new Kiran1(111,"Karan");  
    Kiran1 s2 = new Kiran1(s1,26);  
    s1.display();  
    s2.display();  
   }  
}  