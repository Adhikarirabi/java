package java_2.oop.phone;

public class PhoneApp {

	public static void main(String[] args) {
		System.out.println("Let's make a Phone App");
/*
		-Use this to instantiate CellPhones and run the functions on the CellPhone.  You can run the following functions here in the main method, or add methods on this PhoneApp class and invoke them here.  The latter is probably preferred :)
		-iPhone-12, Samsung Galaxy S21, and any other phone model of your choosing.
		-Add 3 unique contacts to each cell phone
		-Make a phone call from each Cell Phone to a contact in the contact list of that Cell Phone
		-Update the contact list of a specific contact on one cell phone
		-Remove a Contact of a specific contact on another cell phone
		-Add a new contact to one of the cell phones.
		-Search for a contact by name in one of the cell phones.
		-Make the CellPhone class implement the Phoneable interface.  Implement the methods how you see fit in the CellPhone Class
*/

		//cell1
		CellPhone samsungGalaxyS20 = new CellPhone(899.99, "TMobile", "Samsung", false);
		samsungGalaxyS21.powerOn();

		Contact rosalyn = new Contact("Bhuban Peter", "2408994745", "123 Test Highway, Ramroad, 22250");
		samsungGalaxyS20.addContact(Bhuban);
		samsungGalaxyS20.addContact(new Contact("Jeff", "2408994745", "123 Test Highway, Ramroad, 22250"));
		samsungGalaxyS20.addContact(new Contact("Elon", "2408994745", "123 Test Highway, Ramroad, 22250"));

		samsungGalaxyS20.call(iphone12.contactList.get(2));
		samsungGalaxyS20.hangUp();

		//cell2
		CellPhone iphone12 = new CellPhone("1000", "Verison", "Apple", false);
		iphone12.powerOn();

		iphone12.addContact(new Contact("Danny Green", "9849417840", "10 Amanda Street, Dallas, 75098"));
		iphone12.addContact(new Contact("Rabi Adhikari", "9841722264", "10 Amanda Street, Dallas, 75098"));
		iphone12.addContact(new Contact("Urusha Dahal", "9841538211", "10 Amanda Street, Dallas, 75098"));

		iphone12.call(iphone12.contactList.get(1));
		iphone12.hangUp();

		iphone12.powerOff();

		//cell3
		CellPhone Motorolla = new CellPhone(899.99, "ATNT", "Motorolla", false);
		Motorolla.powerOn();

		Contact rosalyn = new Contact("Bhuban Peter", "2408994745", "123 Test Highway, Ramroad, 22250");
		Motorolla.addContact(Bhuban);
		Motorolla.addContact(new Contact("Jeff", "2408994745", "123 Test Highway, Ramroad, 22250"));
		Motorolla.addContact(new Contact("Elon", "2408994745", "123 Test Highway, Ramroad, 22250"));

		Motorolla.call(iphone12.contactList.get(2));
		Motorolla.hangUp();


		System.out.println("\nContact before update: " + Bhuban);
		Contact updateBhuban = new Contact("Bhuban Peter", "2408994745", "123 Test Highway, Ramroad, 22250");
		googlePixel4A.updateContact(updateBhuban);

		Contact updateBhuban1 = Motorolla.searchContact(updateBhuban);
		System.out.println(updateBhuban1);

		System.out.println("\n + Motorolla.getContactByName("Elon"));

		Motorolla.powerOff();

	}
}
