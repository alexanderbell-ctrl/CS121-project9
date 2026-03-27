import java.util.*;
import java.io.*;
class Admin extends User implements hasMenu, Serializable {
	
	public static void main(String[] args){
		Admin q = new Admin();
		q.start();
	} //end main

	public Admin() {
		this.userName = "admin";
		this.PIN = "1111";
	} //end constructor

	public String menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("0) quit");
		System.out.println("1) Full Customer Report");
		System.out.println("2) Add User");
		System.out.println("3) Apply interest to savings accounts");
		System.out.println();
		System.out.print("Please select an option (0-3)...");
		
		String menuResponse = input.nextLine();
		return menuResponse;		
		
	} //end menu

	public void start() {
	
	} //end start
	
	public String getReport() {
		String report = "Admin username: " + this.getUserName();
		report += "Admin PIN: " + this.getPIN();
		return report;
	} //end getReport
} //end class
