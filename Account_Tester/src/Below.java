import java.io.*;
class Above
  { void sum(int a)
     { System.out.println(a+a);
     }
  }
class Below extends Above
  { void sum(int a)
    { System.out.println(a+a+a);
      this.sum(5);
     }
     public static void main(String args[])
    { Below a = new Below();
      a.sum(5);
    }
  }