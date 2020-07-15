import java.util.*;
import java.io.*;

class RandomTest1
{ public static void main(String args[])
 {Random abc = new Random();
  for(int i=0;i<=10;i++)
	{ System.out.println(Math.round(abc.nextDouble()*10+10));// it will round off the pointer values and return 33,-44,76....
	}
 }
}

class RandomTest2
{ public static void main(String args[])
 {Random abc = new Random();
  for(int i=0;i<=10;i++)
	{ System.out.println(abc.nextDouble()*10+10);// pointer values
	}
 }
}

class RandomTest3
{ public static void main(String args[])
 {Random abc = new Random();
  for(int i=0;i<=10;i++)
	{ System.out.println(abc.nextInt()*10+1); // returns 475541201,-864937917.....
	}
 }
}

class RandomTest4
{ public static void main(String args[])
 {Random abc = new Random();
  for(int i=0;i<=10;i++)
	{ System.out.println(abc.nextInt(6)+1); // returns 1,2,3,4,5,6- if you dont put +1 then it will return 0,1,2,3,4,5 
	}
 }
}

class RandomTest
{ public static void main(String args[])
 {Random abc = new Random();
  for(int i=0;i<=10;i++)
	{ 
	  System.out.println(abc.nextBoolean());// true,false,true,false 
	}
 }
}