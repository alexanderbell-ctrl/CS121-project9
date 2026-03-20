# CS121-project9
Bank on It Pt1

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

```
- boolean login(userName, PIN)
```

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
- void main()
```

```
- Customer
```

```
- Customer(userName, PIN)
```

```
- void start()
```

```
- string menu()
```

```
- void changePIN()
```

```
- string getReport()
```

```
