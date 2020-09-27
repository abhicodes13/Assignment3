import java.util.Scanner;

public class currencyconversion{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Scanner object

		// Prompt the user to enter the exchange rate from USD to RMB
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate= input.nextDouble();

		// Prompt the user to enter 0 to convert from USD to RMB
		// and 1 to convert from RMB to USD
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int inRate= input.nextInt();
		double amount;
		switch(option)
		{
			case 0: System.out.print("Enter the dollar amount: ");
					  amount = input.nextDouble();
					  System.out.println("$" + amount + " is " + 
					  	(amount * exchangeRate + " yuan"); break;
			case 1: System.out.print("Enter the RMB amount: ");
					  amount = input.nextDouble();
					  System.out.println(amount + " yuan is $" + 
					  	((int)((amount * 100) / rate)) / 100.0); break;
			default: System.out.println("Invalid");
		} 
	}
}