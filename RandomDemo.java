import java.util.Random;

public class RandomDemo {
   public static void main( String args[] ) {
      
      // create random object
      Random randomno = new Random();

      // setting seed
      randomno.setSeed(-1);

      // value after setting seed
      System.out.println("Object after seed: " + randomno.nextInt());
   }    
}