import java.util.Scanner; 

public class Bank
{
	public static void main(String[] args)	{
	
	Scanner scan=new Scanner(System.in);
		
		Account A1= new Account ("Nadim","0187220",10000.0,"272627161812862");
		
		while(true)
		{
			int Choice;
		
			System.out.println("1.Checking All Information \n 2. Deposit \n 3.Withraw \n 4.Exit");
			System.out.print("Enter Your Choice: " );
		
			Choice=scan.nextInt();
			System.out.println();
			
			if(Choice == 1) {
			
				A1.printAllInfo();
				System.out.println();
			}
			
			else if (Choice == 2)
			{
				double amount;
				System.out.println("Enter the ammount of Deposit: " );
				amount=scan.nextDouble();
				
				A1.deposit(amount);
			}
			
			else if(Choice ==3)
			{
				double amount;
				System.out.println("Enter the ammount of Withraw: " );
				amount=scan.nextDouble();
				
				A1.withdraw(amount);
			}
			else if (Choice == 4)
			 break ;
			
			else System.out.println("Try for the next time ");
			
		}
		
	}

}

