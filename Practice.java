class Fleet
{
  // data
  private Car town;
  private Car suv;

  // constructor
  Fleet( int start1, int end1, double gal1, 
         int start2, int end2, double gal2 )
  {
    town = new Car( start1, end1, gal1) ;
    suv  = new Car( start2, end2, gal2) ;
  }

  // method
  double calculateMPG()
  {
    double sumMPG; 
    sumMPG = town.calculateMPG() + suv.calculateMPG() ;
    return sumMPG/2.0;
  }

  void fillUp( int townOdo, double townGal, int suvOdo, double suvGal)
  {

    town.fillUp( townOdo, townGal );

    suv .fillUp( suvOdo, suvGal );
  }
}

class Car
{
  // data
  private int startMiles;   // Stating odometer reading
  private int endMiles;     // Ending odometer reading
  private double gallons;   // Gallons of gas used between the readings

  // constructor
  Car(  int first, int last, double gals  )
  {
    startMiles = first ;
    endMiles   = last ;
    gallons    = gals ;
  }

  // methods
  double calculateMPG()
  {
    return (endMiles - startMiles)/gallons ;
  }

  void fillUp(int newOdo, double fillUpGals )
  {
     startMiles  =  endMiles ;
     endMiles    =  newOdo ;
     gallons     =  fillUpGals ;
  }
}

class Practice
{
  public static void main ( String[] args)
  {
    Fleet myCars = new Fleet( 1000, 1234, 10, 777, 999, 20 );
    System.out.println("Fleet average MPG= " + myCars.calculateMPG() );

    myCars.fillUp( 1434, 10, 1099, 10 );
    System.out.println("new average MPG= " + myCars.calculateMPG() );
  }
}

