package java_2.oop.rainforest;

import java.util.Arrays;
import java.util.Random;

public class Aligator extends RainforestCreature {
    public Aligator(String name, String origin, String color, String[] food) {
        super(name, origin, color, food);
    }

    @Override
    public void eat() {
        System.out.println("The Aligator is swollowing" + food[new Random().nextInt(food.length)]);
    }

    @Override
    public String toString() {
        return "Aligator{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", color='" + color + '\'' +
                ", food=" + Arrays.toString(food) +
                '}';
    }
}