import java.util.*;
import java.io.*;

public class Bank implements hasMenu {
	Admin admin = new Admin();
	CustomerList customers = new CustomerList();

	public static void main(String[] args) {
		Bank bank = new Bank();
	} //end main
	
	public Bank() {
		this.loadSampleCustomers();
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
				if(this.admin.login()) {
					startAdmin();
				} //end if
			} //end if 1
			else if(userResponse.equals("2")) {
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
				this.fullCustomerReport();
			} //end if 1
			if(userResponse.equals("2")) {
				System.out.println("Add user...");
				this.addUser();
			} //end if 2
			if(userResponse.equals("3")) {
				System.out.println("Apply interest...");
				this.applyInterest();
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
	
	public void fullCustomerReport() {
		for(Customer customer: customers) {
			System.out.println(customer.getReport());
		} //end for
	} //end fullCustomerReport
	
	public void addUser() {
		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		String userName = input.nextLine();
		System.out.print("PIN: ");
		String PIN = input.nextLine();

		customers.add(new Customer(userName, PIN));
	} //end addUser
	
	public void loginAsCustomer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		String INuserName = input.nextLine();
		System.out.print("PIN: ");
		String INPIN = input.nextLine();

		Customer currentCustomer = null;
		for(Customer customer: customers) {
			if(customer.login(INuserName, INPIN)) {
				currentCustomer = customer;
			} //end if
		} //end for

		if(currentCustomer == null) {
			System.out.println("Customer not found");
		} //end if
		else {
			currentCustomer.start();
		} //end else
	} //end loginAsCustomer

	public void applyInterest() {
		for(Customer customer: customers) {
			customer.savings.calcInterest();
		} //end for

	} //end applyInterest

} //end class

class CustomerList extends ArrayList<Customer> {};
