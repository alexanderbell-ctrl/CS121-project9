import java.util.*;
import java.io.*;

public class Customer extends User implements Serializable {
	static final long serialVersionUID = 1L;

	checkingAccount checking = new checkingAccount();
	savingsAccount savings = new savingsAccount();

	public static void main(String[] args) {
		Customer c = new Customer();
		if(c.login()) {
			this.start();
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
	
	} //end start
	public String menu() {
		return "";
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
