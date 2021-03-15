package java_2.oop.coffee;

public class CoffeeApp {

	public static void main(String[] args) {
/*
	- Create 4 different CoffeeBean (instances) (Java, Kona, Geisha, etc.)
	- Create 4 different cups for the brewed coffee
	- Create at least 1 CoffeeMaker to brew the Coffee.
	- Brew Coffee in the Coffee Maker and fill the four cups with different types of Coffee.
	-
 */

		CoffeeBeans java = new CoffeeBeans("Java", "Hawaiii", "Spring Flavor");
		CoffeeBeans Mocha = new CoffeeBeans("Mocha", "Japan", "Ocean Flavor");
		CoffeeBeans Arabica = new CoffeeBeans("Arabica", "Dubai", "Robusta Flavor");
		CoffeeBeans Liberica = new CoffeeBeans("Liberica", "Veitnam", "Earthy Flavor");


		Cup mug = new Cup(16,"Mug");
		Cup PaperCup = new Cup(8,"Black");
		Cup SteeleCup = new Cup(32,"Cappuchino");
		Cup GlassCup = new Cup(16, "ColdBrew");



		CoffeeMaker keureg = new CoffeeMaker("Coffee Brewer", "Keureg", true, "Dark");
		keureg.powerOn();
		java.roast();
		Mocha.roast();
		Arabica.roast();
		Liberica.roast();


//		keureg.powerOn();  (Defined in the Machine Interface)
		mug = keureg.brew(java,mug);
		mug.drink(1);
		mug.getFill();

		PaperCup = keureg.brew(Mocha,PaperCup);
		PaperCup.drink(4);
		PaperCup.getFill();

		SteeleCup = keureg.brew(Arabica,SteeleCup);
		SteeleCup.drink(3);
		SteeleCup.getFill();

		GlassCup = keureg.brew(Liberica,GlassCup);
		GlassCup.drink(2);
		GlassCup.getFill();


	}
}
