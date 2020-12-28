public class Account

{

 	private String accName;

	private String accNumber;

	private double balance;

	private String nid_number;
	
	//public String getAccNumber(){
	// return accNumber;}


	public Account( String accName ,String accNumber ,double balance ,String nid_number){
	
	this.accName=accName;
	this.accNumber=accNumber;
	this.balance=balance;
	this.nid_number=nid_number;
	}


	public void withdraw(double amount)

	{
		System.out.println("enter amount: ");

		if((balance>=amount) && (amount>0.00) && (balance-amount)>500.00)

		{

			balance=balance-amount;

		}

		else 

		{
      
			System.out.println("Not enough amount");

		}
	  

	}

	public void deposit(double amount)

	{

		if(amount>=0.00) 

		balance=balance+amount;

	}
	

	public double checkBalance()

	{

		return this.balance;

	}

	public void printAllInfo()

	{

	   System.out.println("Name: " + accName + "\tAccount number = " + accNumber +  "\tBalance = " +balance);
		
		

	}
	
	public String accNumber()
	{
	
	return this.accNumber;
	
	}

}


