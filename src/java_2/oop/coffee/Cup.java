package java_2.oop.coffee;

public class Cup {

/*
	Properties :
		-capacity (oz)
		-type (glass,mug,tumbler,styrofoam, etc.)
		-fluidContents (coffee,tea,lemonade,etc.)
		-fill (how much is the cup filled?  max == cup capacity)

	Methods :
		-drink(oz) - lowers the fill of the cup by how much is 'drunk'. Display a message indicating the type of coffee being consumed.
 */

	 int capacity;
	 String type;
	 String fluidContents;
	 int fill;

	public void getCapacity() {
		System.out.println(this.capacity);
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public String getFluidContents() {
		return fluidContents;
	}

	public void setFluidContents(String fluidContents) {
		this.fluidContents = fluidContents;
	}

	public void getFill() {
		System.out.println(this.fill);
	}

	public void setFill(int fill) {
		this.fill = fill;
	}

	public Cup(int capacity, String type) {
		this.capacity = capacity;
		this.type = type;
		this.fluidContents = "Empty";
		this.fill = 0;
	}
	public void drink(int drank) {
		if (this.fill <= 0){
			System.out.println("Empty");
		} else{
			this.fill -= fill;
			System.out.println("Had" +drank+ " oz of " + this.fluidContents);
		}

	};



}
