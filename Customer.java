import java.util.*;
import java.io.*;

public class Customer extends User implements Serializable {
	static final long serialVersionUID = 1L;

	checkingAccount checking = new checkingAccount();
	savingsAccount savings = new savingsAccount();

	public static void main(String[] args) {
		Customer c = new Customer();
		if(c.login()) {
			c.start();
		} //end if
	} //end main
	
	public Customer() {
		this.userName = "Alice";
		this.PIN = "1111";
	} //end Customer
	public Customer(String userName, String PIN) {
		this.userName = userName;
		this.PIN = PIN;
	} //end Customer()
	
	public void start() {
		boolean keepGoing = true;
		String menuResponse;
		while(keepGoing) {
			menuResponse = menu();
			if (menuResponse.equals("0")) {
				keepGoing = false;
			} //end if 0
			else if (menuResponse.equals("1")) {
				System.out.println("Checking Account... ");
				this.checking.start();
			} //end if 1
			else if (menuResponse.equals("2")) {
				System.out.println("Savings Account... ");
				this.savings.start();
			} //end if 2
			else if (menuResponse.equals("3")) {
				System.out.println("Changing PIN Number... ");
				this.changePIN();
			} //end if 3	
			else {
			} //end else
		} //end while
	} //end start
	public String menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Customer Menu");
		System.out.println();
		System.out.println("0) quit");
		System.out.println("1) Manage Checking");
		System.out.println("2) Manage Savings");
		System.out.println("3) Change PIN Number");
		System.out.println();
		System.out.print("Please select an option (0-3)...");
		String usrInput = input.nextLine();
		return usrInput;
	} //end menu
	
	public void changePIN() {
		Scanner input = new Scanner(System.in);
		System.out.print("Insert new PIN number: ");
		String newPIN = input.nextLine();
		this.PIN = newPIN;
	} //end changePIN
	public String getReport() {
		String report = "Username: " + this.getUserName();
		report += ", Checking: " + this.checking.getBalanceString();
		report += ", Savings: " + this.savings.getBalanceString();

		return report;
	} //end getReport
} //end class 
