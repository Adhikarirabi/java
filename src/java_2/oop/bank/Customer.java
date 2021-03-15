package java_2.oop.bank;

public class Customer {
		/*
		 Add datatypes
			Properties :
				firstName;
				lastName;
				ssn;
				dob;
				wallet; $ in the wallet
		*/

    private String firstName;
    private String lastName;
    private final String ssn;
    private final String dob;
    private double wallet;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public String getDob() {
        return dob;
    }

    public double getWallet() {
        return wallet;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWallet(double money) {
        this.wallet += money;
    }

    public Customer(String firstName, String lastName, String ssn, String dob, double wallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.dob = dob;
        this.wallet = wallet;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", dob='" + dob + '\'' +
                ", wallet=" + wallet +
                '}';
    }


}

