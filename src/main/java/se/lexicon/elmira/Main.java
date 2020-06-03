package se.lexicon.elmira;

public class Main {

    public static void main(String[] args) {
        System.out.println("The counter is: " + BankAccount.getCounter());
        BankAccount customer = new BankAccount("", 00, 0.0, "", "");
        customer.setCustomerName("Elmira");
        customer.setAccountNumber(123);
        customer.setBalance(0.0);
        customer.setEmail("elmiramadadi@gmail.com");
        customer.setPhoneNumber("0723878480");

        System.out.println("The counter is: " + BankAccount.getCounter());

        System.out.println(customer.getCustomerName());
        System.out.println(customer.getAccountNumber());
        System.out.println(customer.getBalance());
        System.out.println(customer.getEmail());
        System.out.println(customer.getPhoneNumber());

        System.out.println(" ");

        BankAccount customer1 = new BankAccount("Elmira Madadi", 123, 0.00, "elmiramadadi@gmail.com", "0723878480");
        new BankAccount();
        System.out.print("Deposit: ");
        System.out.println(customer1.deposit(400));
        System.out.print("Current balance: ");
        System.out.println(customer1.getBalance());

        System.out.println(" ");

        System.out.print("Withdraw: ");
        System.out.println(customer1.withdraw(600));
        System.out.print("Current balance: ");
        System.out.println(customer1.getBalance());
        System.out.println("The counter is: " + BankAccount.getCounter());
    }
}
