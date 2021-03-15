package java_2.oop.bank;

import java.util.List;

/*
		Properties:
			Bank (bank where the account is stored)
			accountNumber
			accountHolder (Customer)
			balance
			type (savings, checking, etc.)
			transactions (list of transactions)

		Methods :
			deposit(money); //add to the balance and the transaction history
			withdraw(money); //withdraw from the balance and add to the transaction history;


	 */
public class Account {
    private final String bankName;
    private final int accountNumber;
    private Customer customer;
    private double balance;
    private String type;
    private List<String> transactions;

    public String getBankName() {
        return bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTransactions(String transactions) {
        this.transactions.add(transactions);
    }

    public Account(String bankName, int accountNumber, Customer customer, double balance, String type, List<String> transactions) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
        this.type = type;
        this.transactions = transactions;
    }

    public void deposit(double money) {
        if (money > customer.getWallet()) {
            System.out.println("You don't have enough in your wallet to deposit this amount.");
        } else {
            customer.setWallet((-money));
            balance += money;
            transactions.add("Deposited " + money + " successfully");
        }

    }

    ;

    public void withdraw(double money) {
        if (balance - money < 0) {
            System.out.println("Sorry, insufficient funds. Your current balance is: " + balance + " please try " +
                    "again or select a different amount.");
        } else {
            balance -= money;
            transactions.add("Withdrew " + money + " successfully");
            customer.setWallet(money);
        }
    }

    ;

    @Override
    public String toString() {
        return "Account{" +
                "bankName=" + bankName +
                ", accountNumber=" + accountNumber +
                ", customer=" + customer +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}





