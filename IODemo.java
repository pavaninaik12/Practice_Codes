import java.text.*;

class IODemo
{
  public static void main ( String[] args )
  {
    int value = 123456789 ;
    DecimalFormat decform = new DecimalFormat();   
    System.out.println( "value = " + decform.format(value) );// formats the integer values according to the international strandard(, . <space>)
  } // it also works without giving Locale.getDefault() compulsorily 
}


//import java.text.*;

class IODemoFloat
{
  public static void main ( String[] args )
  {
    double value = 12345.6789 ;    
    DecimalFormat numform = new DecimalFormat(); 
    System.out.println( "value = " + numform.format(value) ); // formats the decimal values given 
  }
}