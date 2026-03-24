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
