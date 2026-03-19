java.util.*;


public class checkingAccount implements hasMenu {
	double balance;

	public static void main(String[] args){
		checkingAccount ck = new checkingAccount();
		ck.start();
	} //end main
	
	public checkingAccount() {
		this.balance = 0d;
	} //end checkingAccount()
	public checkingAccount(double balance) {
		this.balance = balance;
	} //end checkingAccount(balance)

	public String menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("0) quit");
		System.out.println("1) check balance");
		System.out.println("2) make a deposit");
		System.out.println("3) make a withdrawal"");


	} //end menu
} //end class
