package java_2.oop.coffee;

public abstract class Machine {
	 final String type;
	 final String brand;
	 boolean on;



	protected Machine(String type, String brand, boolean on) {
		this.type = type;
		this.brand = brand;
		this.on = on;
	}

	public abstract void powerOn();
	public abstract void powerOff();
}
