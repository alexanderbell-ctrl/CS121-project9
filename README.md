# CS121-project9
Bank on It Pt2

## checkingAccount
- constructor()
```
balance = 0
```
- constructor(number)
```
balance = number
```
- String menu()
```
print menu options
get response
return response
```
- void start()
```
keepGoing loop
    call menu, response calls corresponding function
        0 -> stop keepGoing
        1 -> checkBalance()
        2 -> makeDeposit()
        3 -> makeWithdrawl()
```
- double getBalance()
```
return balance
```
- string getBalanceString()
```
String strBalance = value of balance
return strBalance
```
- void setBalance(double balance)
```
balance = double balance
```
- void checkBalance()
```
print "Current Balance: "
print getBalanceString
```
- private double getDouble()
```
Scanner
String strInput = user input
double dbInput = 0d
try
    dbInput = double conversion of strInput
catch 
    print "not an input, changing to 0"
    result = 0
```
- void makeDeposit()
```
print "How much?: "
double deposit = getDouble
balance += deposit
print "new balance: " + getBalanceString
```
- void makeWithdrawl()
```
print "How much?: "
double withdrawl = getDouble
if withdrawl > balance
    print "you don't have that kind of cash..."
elif withdrawl < 0
    print "that doesn't make sense..."
else
    balance -= withdrawl
print "new balance: " + getBalanceString
```

## savingsAccount
- main()
```
calls start
```
- calcInterest()
```
interestAmount = balance*interestRate
balance += interestAmount
print "New balance: " + balance
```
- void interestRate(double interestRate)
```
this.interestRate = interestRate
```
- double getInterestRate()
```
return interestRate
```

## User
- boolean login()
```
scanner
result is false
print "Enter username: "
user input userNameIn

if userNameIne == this.userName
    print "Enter PIN: "
    user input PINIn
        if PINIn == this.PIN
            print "Logging in..."
            result is true
        else
            print "Incorrect PIN..."
else
    print "This user does not exist..."
```
- boolean login(userNameTest, PINTest)
```
result is false
if userNameTest == this.userName
    if PINTest == this.PIN
        result is true
return result
```
- void setUserName(userName)
```
this.userName = userName
```
- string getUserName()
```
return this.userName
```
- void setPIN(PIN)
```
this.PIN = PIN
```
- string getPIN()
```
return this.PIN
```
- abstract string getReport()
```

```

## Customer
- Customer
```
userName = "Alice"
PIN = "1111"
```
- Customer(userName, PIN)
```
this.userName = userName
this.PIN = PIN
```
- void start()
```
keepGoing loop
    result = menu()
    if 0 -> stop keepGoing
    if 1 -> this.checking.start()
    if 2 -> this.savings.start()
    if 3 -> this.changePIN()
    
```
- string menu()
```
print customer menu
    0) exit
    1) manage checking
    2) manage savings
    3) change PIN
return user input
```
- void changePIN()
```
print "Input new PIN: "
this.PIN = userinput
```
- string getReport()
```
String report = "Username: " + getUserName()
report += ", Checking: " + checking.getBalanceString()
report += ", Savings:" + savings.getBalanceString()

return report
```


 For Part 2
=
### Alterations
- serializeable:
    checkingAccount
    User
    Customer
## Admin
```
extends User; implements hasMenu, serializeable
```
- constructor()
```
userName = admin
PIN = 1111
```
- String menu()
```
print: 0) Exit this menu
print: 1) Full customer report
print: 2) Add user
print: 3) Apply interest to savings accounts
print "Select an option:"
user input
return input
```
- void start()
```
IN BANK
```
- string getReport()
```
String = "Admin username: " getUserName()
String += "Admin PIN: " getPIN()
return String
```
## Bank
```
Admin instance
arraylist of customers --> new instance of container class
```
- constructor()
```
start()
```
- void main ()
```
new Bank
```
- void loadSampleCustomers()
```
customers.add(new instance "Alice","1111")
Bob, 2222
Cindy, 3333
```
- void loadCustomers()
```

```
- void saveCustomers()
```

```
- void fullCustomerReport()
```
for each customer:
    print: customer.getreport()
```
- void addUser()
```
print "Username: "
String userName = user input
print "PIN: "
String PIN = user input
customers.add(new Customer instance(userName, PIN))
```
- void applyInterest()
```
for each customer:
    customer.savingsAccount.calcInterest()
```
- void loginAsCustomer()
```
print "Username: "
String INuserName = user input
print "PIN: "
String INPIN = user input

Customer instance 'currentCustomer' = null
for each customer:
    if customer.login(INuserName, INPIN)
        currentCustomer = customer
if currentCustomer == null
    print "Customer not found"
else
    currentCustomer.start()  
```
- String menu()
```
print: "
Bank Menu

0) Exit system
1) Login as admin
2) Login as customer

Action:"
user input
return input
```
- void start()
```
keepGoing loop
    String response = menu()
    if 0:
        stop loop
    if 1:
        print "Admin login"
        startAdmin()
    if 2:
        print "Customer login"
        loginAsCustomer()
    else:
        print "Enter a valid option"
```
- void startAdmin ()
```
keepGoing loop
    String = admin.menu()
    if 0:
        stop loop
    if 1:
        fullCustomerReport()
    if 2:
        adduser()
    if 3:
        applyInterest()
```

