import java.util.Scanner;
import java.io.*;
class ScanForInts
{
  public static void main ( String[] args ) throws IOException

  {
    Scanner scan = new Scanner( new File( "myData.txt" ) );

    // continue while there are unread tokens
    while ( scan.hasNext())
    {
      // if the next token is an integer get it and write it out
      if ( scan.hasNextInt() )
      {
        int number = scan.nextInt();
        System.out.println( number );
      }
      else
        scan.hasNext();  // discard non-number token
	  scan.close();
    }
   
  }
}