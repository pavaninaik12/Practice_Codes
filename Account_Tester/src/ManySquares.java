import java.util.Scanner;
import java.io.*;

class ManySquares
{
  public static void main (String[] args) throws IOException
  { 
    File    file = new File("myData.txt");   // create a File object
    Scanner scan = new Scanner( file );      // connect a Scanner to the file
    float num, square;      

    while( scan.hasNextFloat() )   // is there more data to process? 
    {
      num = scan.nextFloat();
      square = num * num ;      
      System.out.println("The square of " + num + " is " + square);
    }
  }
}