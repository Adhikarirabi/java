package java_3.serial;

import java.io.*;

public class Fax {

/*	Properties :
		brand
		model
		year

	Methods :
		transmit(message)
		receive(message)

 */
    String brand;
	String model;
	String year;

	public Fax(String brand, String model, String year) throws IOException {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public static void transmit(Message msg, String msgFileName) throws IOException {
		//The transmit message must serialize a Message, and write it to a file.
			System.out.println("message transmit");
			FileOutputStream fileOutputStream = new FileOutputStream(msgFileName);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(msg);
			fileOutputStream.close();
			objectOutputStream.close();

	}

	public static Message receive(String filename) throws IOException, ClassNotFoundException  {
//		The receive method should deserialize a message by reading it in from a file. and then print it to the console.
			System.out.println("message receive");
			FileInputStream fileInputStream = new FileInputStream(filename);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Object msg = objectInputStream.readObject();
			fileInputStream.close();
			objectInputStream.close();
			return (Message) msg;
		}
	}




