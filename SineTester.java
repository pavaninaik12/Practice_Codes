import java.util.Random;

class SineTester
{
  public static void main ( String[] args )
  {
    int j=0;
    Random rand = new Random();
    
    System.out.println(" x " + "\t\t\t sin(x)");// "/t" is used for space 
    while ( j<10 )
    {
      double x = rand.nextDouble()*(20*Math.PI) - 10*Math.PI;//calculating between (-10.pi,10.pi)radians
      System.out.println("" + x + "\t" + Math.sin(x));
      j = j+1;
    }
  }
}

/*
OUTPUT 
 x                       sin(x)
30.6341314674754        -0.7045544238802954
29.55518514784586       -0.9582595839223276
29.768749618901857      -0.9970844205900284
-3.5066808453836806     0.3570316751388758
15.276085492127564      0.41857690038160167
-24.511670912579497     0.5819059348080916
22.140631310793573      -0.14892665649031964
-14.384905562233623     -0.969469417904207
7.719544402573568       0.9909769174878948
17.35135517867632       -0.997366097649819
*/