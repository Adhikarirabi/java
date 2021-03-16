package java_2.oop.rainforest;

public class RainforestApp {

	public static void main(String[] args) {

	//	You are exploring the rainforests of the Amazon.  You have observed many different types of wildlife on your excursion.  To jog your memory,  different kinds of Rainforest Animals that you observed are found in the following URL : https://www.ietravel.com/blog/amazon-rainforest-animals-beginners-guide-21-species.  Feel free to use additional resources for more animal ideas.

	//	Pick 6 rainforest creatures and model them using the RainforestCreature class. i.e. Instantiate 6 rainforest creatures. Each Rainforest Creature should have 1 unique characteristic , and 1 unique action that it can do in addition to any general characteristics and actions that Creatures can do in general.*/

/*		Instantiate all 6 rainforest creatures here, print to the console each Rainforest Creature as a String representation, and have them perform any actions defined in the RainforestCreature class.

		ex : RainforestCreature riverDolphin = new RiverDolphin("riverDolphin","Amazon","pink",new String[]{"fish","crabs","turtles"};
			System.out.println(riverDolphin); => RiverDolphin{ properties... }.
			riverDolphin.eat() => "The river dolphin is eating fish."

		choose your own characteristics and methods to model).

*/
		RainforestCreature Snake = new Snake("Snake", "Amazon", "green", new String[]{"Monkey", "Mouse", "eagle", "deer", "fish"});
		System.out.println(Snake);
		Snake.eat();

		RainforestCreature Comodo = new Comodo("Comodo", "Amazon", "grey", new String[]{"bird", "lizard", "eagle", "deer", "fish"});
		System.out.println(Comodo);
		Comodo.eat();

		RainforestCreature Aligator = new Aligator("Aligator", "Amazon", "green", new String[]{"Zebra", "fish", "waterBuffalo", "WaterSnake"});
		System.out.println(Aligator);
		Aligator.eat();

		RainforestCreature Bobcat = new Bobcat("Bobcat", "Amazon", "Yellow", new String[]{"Monkey", "Mouse", "eagle", "pig", "fish"});
		System.out.println(Bobcat);
		Bobcat.eat();

		RainforestCreature Jaguar = new Anaconda("Jaguar", "Amazon", "Black", new String[]{"Monkey", "Mouse", "birds", "deer", "fish"});
		System.out.println(Jaguar);
		Jaguar.eat();

		RainforestCreature Mouse = new Mouse("Anaconda", "Amazon", "white", new String[]{"egg", "lizard", "insect", "flowers", "fruits"});
		System.out.println(Mouse);
		Mouse.eat();
	}

}
