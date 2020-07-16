
class Animal{  
String color="white";  
}  
class Dog extends Animal
{  
String color="black";  
void printColor()
{  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}   
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  
}
}  

class Animal1{  
void eat(){System.out.println("eating...");}  
}  
class Dog1 extends Animal1{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}   
public static void main(String args[]){  
Dog1 d=new Dog1();  
d.work();  
}
}  

class Animal3{  
Animal3()
{
System.out.println("animal is created");
}  
}  
class Dog3 extends Animal3{  
Dog3(){  
super();  
System.out.println("dog is created");  
}  
public static void main(String args[]){  
Dog3 d=new Dog3();  
}
}  