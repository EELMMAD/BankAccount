package se.lexicon.elmira;


public class BankAccount {
    String customerName;
    int accountNumber;
    private double balance;  //Only we can access in the class
    String email;
    String phoneNumber;
    static int counter;

    public BankAccount(String customerName, int accountNumber, double balance, String email, String phoneNumber) {
        this(customerName , accountNumber, email, phoneNumber);
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    // constructor
    public BankAccount (String name, int accountNumber, String email1, String phoneNumber1){
        this();
        this.customerName = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.email = email1;
        this.phoneNumber = phoneNumber1;

    }

    //Counter
    public BankAccount(){
        counter++;
    }

    // getters and setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Deposit
    public double deposit(double amount){
        balance = balance + amount;
        return balance;
    }

    public static int getCounter() {
        return counter;
    }

    // Withdraw
    public double withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            //throw new IllegalArgumentException("You cant do like this!");
            System.out.println("Transaction cancelled due to insufficient funds!");
        }
        return balance;
    }
}