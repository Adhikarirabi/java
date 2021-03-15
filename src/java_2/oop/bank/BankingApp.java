package java_2.oop.bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankingApp {

	public static void main(String[] args) {

		/*
		Bank - +void withdraw(Account account, [numeric type] amount)
		        +void deposit(Account account, [numeric type] amount)
		        +void openAccount(Account account, [numeric type] amount)
		        List<Account>getAccount(String accountNumber)
		        List<Account>getAccount(Customer customer)

         List(Account)

		Customer
		[Types] credentials

		Account
		boolean isOpen
		Customer owner
		-[numeric] balance
		withdraw[numeric amount]
       void deposit [numeric amount]
       void close() [numeric amount]
				-Create a Bank
				-Create 5 Customers
				-Open a new account for each customer.
				-have 3 customers withdraw and deposit, making sure the account balances update.
				-Close 2 of the customer accounts.
				-view the opened accounts at the Bank.
				-find an account by any of the customer credentials
				-find an account by account number.
		 	*/

		List<Account> accounts = new ArrayList<>(Arrays.asList());
		Bank bank1 = new Bank("Golden Hoard Bank", accounts);
		Customer Tim = new Customer("Tim", "Cook","123-45-6789","01/12/1980", 100.00);
		Customer Bill = new Customer("Bill", "Gates","999-99-9999","02/22/2001",758.25);
		Customer Mark = new Customer("Mark", "Ray","984-45-6235", "12/11/1960", 250.50);
		Customer Jack = new Customer("Jack", "Ma", "984-41-7840","09/11/1993", 19.95);
		Customer Jeff= new Customer("Jeff", "Bezos", "220-90-4000", "05/06/1994", 20.03);

		List<String> BillTrans1 = new ArrayList<>(Arrays.asList("Account Created"));
		List<String> TimTrans2 = new ArrayList<>(Arrays.asList("Account Created"));
		List<String> MarkTrans3 = new ArrayList<>(Arrays.asList(" Account Created"));
		List<String> JackTrans4= new ArrayList<>(Arrays.asList("Account Created"));
		List<String> JeffTrans5 = new ArrayList<>(Arrays.asList(" Account Created"));

		Account Bills = bank1.openAnAccount(22222,Bill,300.00,"Checking Accounts", BillTrans1);
		Account Tims = bank1.openAnAccount(7789645, Tim, 750.00, "Checking Accounts", TimTrans2);
		Account Marks = bank1.openAnAccount(1535445, Mark, 2.78, "Saving Accounts", MarkTrans3);
		Account Jacks = bank1.openAnAccount(4853541, Jack, 4.44, "Savings Accounts", JackTrans4);
		Account Jeffs = bank1.openAnAccount(545222, Jeff, 11.11, "Checking", JackTrans4);

		bank1.showAccounts();
		bank1.closeAnAccount(Jeffs);
		bank1.closeAnAccount(Bills);
		bank1.showAccounts();
		System.out.println("By customer: " + bank1.getCustomerAccount("Brewer"));
		System.out.println("By number: " + bank1.getAccountNumber(34567));

		//Customer 1 Account
		System.out.println("Timys Account");
		System.out.println("Total Available balance" +Tims.getBalance());
		System.out.println("Tims Wallet" +Tim.getWallet());

		Tims.deposit(900.99);
		System.out.println("Deposited : " +Tim.getWallet());
		System.out.println("Total Balance" +Tims.getBalance());

		Tims.withdraw(21.01);
		System.out.println("Wallet Balance " +Tim.getWallet());
		System.out.println("Total" +Tims.getBalance());
		System.out.println("Transaction "+Tims.getTransactions());

		Tims.withdraw(9999);
		System.out.println("Negative Balance " +Tim.getWallet());
		System.out.println("Balance " +Tims.getBalance());
		System.out.println();

		//Customer 2 Account
		System.out.println("Marks Account");
		System.out.println("Total Available balance" +Marks.getBalance());
		System.out.println("Tims Wallet" +Mark.getWallet());

		Tims.deposit(68.23);
		System.out.println("Deposited : " +Mark.getWallet());
		System.out.println("Total Balance" +Marks.getBalance());

		Tims.withdraw(78.80);
		System.out.println("Wallet Balance " +Mark.getWallet());
		System.out.println("Total" +Marks.getBalance());
		System.out.println("Transaction "+Marks.getTransactions());

		Tims.withdraw(2000000);
		System.out.println("Negative Balance " +Mark.getWallet());
		System.out.println("Balance " +Marks.getBalance());
		System.out.println();

		//Customer 3 Acoount
		System.out.println("Jacks Account");
		System.out.println("Total Available balance" +Jacks.getBalance());
		System.out.println("Tims Wallet" +Jack.getWallet());

		Tims.deposit(100.23);
		System.out.println("Deposited : " +Jack.getWallet());
		System.out.println("Total Balance" +Jacks.getBalance());

		Tims.withdraw(19.95);
		System.out.println("Wallet Balance " +Jack.getWallet());
		System.out.println("Total" +Jacks.getBalance());
		System.out.println("Transaction "+Jacks.getTransactions());

		Tims.withdraw(1010000);
		System.out.println("Negative Balance " +Jack.getWallet());
		System.out.println("Balance " +Jacks.getBalance());
		System.out.println();

	}
}
