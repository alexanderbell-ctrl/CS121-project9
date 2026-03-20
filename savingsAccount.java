import java.util.*;


class savingsAccount extends checkingAccount {
	double interestRate;

	public static void main(String[] args){
		savingsAccount sg = new savingsAccount();
		sg.start();
	} //end main
	
	public void calcInterest() {
		double interestAmount = balance*interestRate;
		this.balance += interestAmount;
		System.out.println("New balance: " + this.balance);
	} //end calcInterest
	
	public void interestRate(double interestRate) {
		this.interestRate = interestRate;
	} //end interestRate
	
	public double getInterestRate() {
		return interestRate;
	} //end getInterestRate
} //end class
