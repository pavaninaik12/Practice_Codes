class Animal_1{  
public void Animal()
{System.out.println("animal is created");}  
}  
class Dog_Super extends Animal_1
{  
Dog_Super()
{  
super();  
System.out.println("dog is created");  
}  
public static void main(String args[]){  
Dog_Super d=new Dog_Super();  
}
}
