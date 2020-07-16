import java.util.*;
class Pavani1
{void add(int a)
{
 System.out.println(a+a);
}
void add(int a,int b)
{System.out.println(a*b);
}
}

class Pavani extends Pavani1
{ void add(int a)
{System.out.println(a+a+a);
}
 public static void main(String args[])
{ Pavani1 o= new Pavani1();
  o.add(5);

}
}