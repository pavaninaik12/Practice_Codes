class CheckingAccount
{
  // instance variables
 private String accountNumber;
 private String accountHolder;
 private int    balance;

  //constructors
  CheckingAccount( String accNumber, String holder, int start )
  {
    accountNumber = accNumber ;
    accountHolder = holder ;
    balance       = start ;
  }

  // methods
  int getBalance()
	{ return balance;
	}
  void getDeposit(int amount)
	{ //int balance = 0;  here we are initializing balance local variable for which scope starts here and ends at this block 
	  balance = amount+balance;// here if we put this.balance then the balance will be coming from object 
		
	}
  void getCheck(int amount)//scenario: if its less than 100000 then charge 15 rps
	{ int charge;
	  if(balance<100000)
		  charge = 15;
      else
		  charge=0;
	  balance = balance-amount-charge;
		
	}
   public String toString()
	{
	return "Account_no: "+accountNumber+"; Name: "+accountHolder+"; balance "+balance+".";
	}
}

class CheckingAccountTester
{
  public static void main( String[] args )
  {
    CheckingAccount account1 
            = new CheckingAccount( "123", "Bob", 100 );
	// account1.balance=account1.balance+100; - if you give something like this then it will give an error saying that can't access it because we have given private  
	account1.getDeposit(100000); // private can be accesible in main only by giving access methods 
	account1.getCheck(1800);

    System.out.println(account1.toString());
  }
}