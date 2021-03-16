package java_2.oop.phone;

class CellPhone implements Phoneable {
    /*
        * Properties :
        * 	contact list
        * 	cost
        *   carrier (Verizon, AT&T, T-Mobile, etc.)
        *   brand (Apple, Samsung, Motorola, etc.)
        * 	power (is the phone turned on or off? yes or no)

        * Functionality :
             - call(Contact); display a message indicating the Contact's phone number is being called. Note that the cell phone can only call contacts that are in the contact list.
            - addContact(Contact) add a new Contact to the contact list.
            - updateContact(Contact) //setter
            ****When adding or updating be sure to check if the contact already exists****
            - removeContact(Contact) remove a contact from the contact list of the cell phone
            - searchContacts(Contact) return a contact from the contact list if one exists.
            * getters and setters for carrier, brand, and cost

    ****Be sure not to expose the inner workings of the CellPhone (use concepts of encapsulation)**
    */
    public List<Contact> contactList;
    public boolean power;
    private double cost;
    private String carrier, brand;

    public CellPhone(double cost, String carrier, String brand, boolean power) {
        contactList = new ArrayList<>();
        this.cost = cost;
        this.carrier = carrier;
        this.brand = brand;
        this.power = power;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void call(Contact contact) {
        if (power) {
            System.out.println(contact.phoneNumber +);
            ring();
        } else {
            System.out.println(" cell is turned off");
        }
        public void addContact (Contact contact){
            if (power) {
                if (contactList.contains(contact)) {
                    System.err.println("This contact is in contact list");
                } else {
                    contactList.add(contact);
                }
            } else {
                System.out.println("cell is turned off");
            }
            public void updateContact (Contact contact){
                Iterator<Contact> i = contactList.iterator();
                while (i.hasNext()) {
                    Contact c = i.next();
                    if (c.name == contact.name) {
                        i.remove();
                        break;
                    }
                }
                contactList.add(contact);
            }
            public Contact removeContact (Contact contact){
                contactList.remove(contact);
                return contact;
            }

            public Contact searchContact (Contact contact){
                if (contactList.contains(contact)) {
                    return contact;
                } else {
                    return null;
                }
            }

            public Contact getContactByName (String name){
                for (Contact contact1 : contactList) {
                    if (contact1.name == name) {
                        return contact1;
                    }
                }
                return null;
            }
            @Override
            public String toString() {
                return "CellPhone{" +
                        "contactList=" + contactList +
                        ", power=" + power +
                        ", cost=" + cost +
                        ", carrier='" + carrier + '\'' +
                        ", brand='" + brand + '\'' +
                        '}';
            }

        }


