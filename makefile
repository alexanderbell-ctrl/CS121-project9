Customer.class: Customer.java User.class checkingAccount.class savingsAccount.class
	javac -g Customer.java

User.class: User.java hasMenu.class
	javac -g User.java

CheckingAccount.class: checkingAccount.java hasMenu.class
	javac -g checkingAccount.java

SavingsAccount.class: savingsAccount.java checkingAccount.class
	javac -g savingsAccount.java

HasMenu.class: hasMenu.java
	javac -g hasMenu.java

testAdmin: Admin.class
	java Admin

testCustomer: Customer.class
	java Customer

testChecking: checkingAccount.class
	java checkingAccount

testSavings: savingsAccount.class
	java savingsAccount

clean:
	rm *.class
