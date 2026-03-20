import java.util.*;


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
		System.out.println("3) make a withdrawal");
		System.out.println();
		System.out.print("Please select an option (0-3)...");

		String menuResponse = input.nextLine();
		return menuResponse;
	} //end menu
	
	public void start() {
		boolean keepGoing = true;
		String menuResponse;
		while(keepGoing) {
			menuResponse = menu();
			if (menuResponse.equals("0")) {
				keepGoing = false;
			} //end if 0
			else if (menuResponse.equals("1")) {
				System.out.println("Checking Balance... ");
				this.checkBalance();
			} //end if 1
			else if (menuResponse.equals("2")) {
				System.out.println("Making a Deposit... ");
				this.makeDeposit();
			} //end if 2
			else if (menuResponse.equals("3")) {
				System.out.println("Making a Withdrawl... ");
				this.makeWithdrawl();
			} //end if 3
			else {
			} //end else

		} //end while
	} //end start
	
	public double getBalance() {
		return this.balance;
	} //end getBalance
	
	public String getBalanceString() {
		String strBalance = String.format("$%.02f", this.balance);
		return strBalance;
	} //end getBalanceString
	
	public void setBalance(double balance) {
		this.balance = balance;
	} //end setBalance
	
	public void checkBalance() {
		System.out.print("Current Balance: ");
		System.out.println(this.getBalanceString());
	} //end checkBalance
	
	private double getDouble() {
		Scanner input = new Scanner(System.in);
		String strInput = input.nextLine();
		double dbInput = 0d;
		try {
			dbInput = Double.parseDouble(strInput);

		} catch (Exception e) {
			System.out.println("Not a legal input, changing to 0.");
			dbInput = 0d;
		} //end try
		return dbInput;
	} //end getDouble
	
	public void makeDeposit() {
		System.out.print("How much to deposit?: ");
		double deposit = getDouble();
		this.balance += deposit;
		System.out.println("New blance: " + getBalanceString());
	} //end makeDeposit
	
	public void makeWithdrawl() {
		System.out.print("How much to withdrawl?: ");
		double withdrawl = getDouble();
		if(withdrawl > balance) {
			System.out.println("you don't have that kind of cash...");
		} //end if negative balance
		else if(withdrawl < 0) {
			System.out.println("that doesn't make sense...");
		} //end if negative withdrawl
		else {
			this.balance -= withdrawl;
		} //end else
		System.out.println("New blance: " + getBalanceString());
	} //end makeWtihdrawl
} //end class
