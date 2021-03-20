package java_3.serial;


import java.io.Serializable;

public class Message implements Serializable {
	private int id;
	private String msgTxt;

	public Message(int id, String msgTxt) {
		this.id = id;
		this.msgTxt = msgTxt;
	}

	public Message() {}


	public String getMsgTxt() {
		return msgTxt;
	}

	public void setMsgTxt(String msgTxt) {
		this.msgTxt = msgTxt;
	}

	public String getMsgTxt(int id) {
		return msgTxt; //to get a message, the id must be passed in
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
