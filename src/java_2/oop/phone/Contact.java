package java_2.oop.phone;

class Contact {
/*
	Properties :
        - Name
        - Phone number
		- Address
*/

    String Name;
    String PhoneNumber;
    String Address;

    public Contact(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public java.lang.String toString() {
        return "Contact{" +
                "Name='" + Name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}

