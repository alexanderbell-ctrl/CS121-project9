import java.util.*;

public abstract class User implements hasMenu {
	String userName = "";
	String PIN = "";

	public boolean login() {
		Scanner input = new Scanner(System.in);
		boolean result = false;
		System.out.print("Enter username: ");
		String userNameIn = input.nextLine();
		if(userNameIn.equals(this.userName)){
			System.out.print("Enter PIN number:");
			String PINIn = input.nextLine();
			if(PINIn.equals(this.PIN)) {
				System.out.println("Logging in...");
				result = true;
			} //end if
			else {
				System.out.println("Incorrect PIN...");
			} //end else
		} //end if
		else {
			System.out.println("This user does not exist...");
		} //end else
	return result;
	} //end login

	public boolean login(String userNameTest, String PINTest) {
		boolean result = false;
		if(userNameTest.equals(this.userName)) {
			if(PINTest.equals(this.PIN)) {
				result = true;
			} //end if
		} //end if
		return result;
	} //end login()

	public void setUserName(String userName) {
		this.userName = userName;
	} //end setUserName
	public String getUserName() {
		return this.userName;
	} //end getUserName
	public void setPIN(String PIN) {
		this.PIN = PIN;
	} //end setPIN
	public String getPIN() {
		return this.PIN;
	} //end getPIN
	
	public abstract String getReport();
	//end getReport
} //end class
