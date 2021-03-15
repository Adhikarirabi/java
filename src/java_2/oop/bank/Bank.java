package java_2.oop.bank;

import java.util.List;

public class Bank {

	/*
		Properties:
			accounts;

		Methods :
			openAccount(); //create a new account, add it to the accounts list, and return it.
			closeAccount(Account); close the account by removing it from the account list. and removing it's association with this Bank
	 		getAccountByCustomer(Customer);
	 		getAccountByNumber(acctNum);
	 */
    private String name;
    private List<Account> accounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bank(String name, List<Account>accounts) {
        this.name = name;
        this.accounts = accounts;
    }
    public void showAccounts(){
        if(accounts == null){
            System.out.println("No open Accounts");
        } else{
            for (Account account : accounts) {
                System.out.println();
                System.out.print("Account number: " + account.getAccountNumber() +" Customer: "+ account.getCustomer().getFirstName() + " "+ account.getCustomer().getLastName());
            }

        }

    }
    public List<Account> getAccounts() {
        return accounts;
    }

    public Account openAnAccount(int accountNumber, Customer customer, double balance, String type, List<String> transactions) {

        Account newAccount = new Account(this.name, accountNumber, customer, balance, type, transactions);

        accounts.add(newAccount);
        return newAccount;
    }
    public void closeAnAccount(Account account){
        accounts.remove(account);
        System.out.println("Removed");
    }
    public Account getCustomerAccount(String lastName){
        for (Account account : accounts) {
            if (account.getCustomer().getLastName().equals(lastName)) {
                System.out.println("Account found");
                return account;
            }
        }
        return null;
    }
    public Account getAccountNumber(int acctNum){
        for (Account account : accounts){
            if (account.getAccountNumber() == acctNum){
                System.out.println("Account found");
                return account;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}