package java_3.serial;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String msgFilename = "messenger";
        Message msg = new Message(1, "Text");
        Fax fax = new Fax("HP", "Pavon", "2018");
        fax.transmit(msg, msgFilename);
        Message deMessage = fax.receive(msgFilename);
        System.out.println("Message: " + deMessage.getMsgTxt());
    }

}


