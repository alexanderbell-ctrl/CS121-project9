import java.util.*;
import java.io.*;

public class Bank implements hasMenu {
	Admin admin = new Admin();
	CustomerList customers = new CustomerList();

	public static void main(String[] args) {
		Bank bank = new Bank();
	} //end main
	
	public Bank() {
		this.loadSampleCutomers();
		this.start();
	} //end constructor

	public String menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("0) quit");
		System.out.println("1) Login as Admin");
		System.out.println("2) Login as Customer");
		System.out.println();
		System.out.print("Please select an option (0-3)...");
		
		String menuResponse = input.nextLine();
		return menuResponse;
	} //end menu

	public void start() {
		boolean keepGoing = true;
		while(keepGoing) {
			String userResponse = menu();
			if(userResponse.equals("0")) {
				keepGoing = false;
			} //end if 0
			if(userResponse.equals("1")) {
				System.out.println("Admin login...");
				startAdmin();
			} //end if 1
			if(userResponse.equals("2")) {
				System.out.println("Customer login...");
			} //end if 2
			else{
				System.out.println("Enter a valid option");
			}
		} //end while 
	} //end start

	public void startAdmin() {
		boolean keepGoing = true;
		while(keepGoing) {
			String userResponse = menu();
			if(userResponse.equals("0")) {
				keepGoing = false;
			} //end if 0
			if(userResponse.equals("1")) {
				System.out.println("Customer Report...");
				startAdmin();
			} //end if 1
			if(userResponse.equals("2")) {
				System.out.println("Add user...");
			} //end if 2
			if(userResponse.equals("3")) {
				System.out.println("Apply interest...");
			} //end if 2
			else{
				System.out.println("Enter a valid option");
			}
		} //end while	
	} //end startAdmin

	public void loadSampleCustomers() {
		customers.add(new Customer("Alice", "1111"));
		customers.add(new Customer("Bob", "2222"));
		customers.add(new Customer("Cindy", "3333"));
	} //end loadSampleCustomers

} //end class

class CustomerList extends ArrayList<Customer> {};
