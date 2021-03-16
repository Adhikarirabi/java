package java_2.oop.rainforest;

public class RainforestCreature extends Creature {
	//your code here

    String name;
    String origin;


    Stringcolor;
    String[] food;

    public RainforestCreature(String name, String origin, String color, String[] food) {
        this.name = name;
        this.origin = origin;
        this.color = color;
        this.food = food;
    }

    @Override
    public void eat() {
        super.eat();
    }
}
}
