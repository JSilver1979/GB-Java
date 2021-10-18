package ru.GeekBrains.Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        if (plate.isFoodEated) {
            fullness = true;
        }
    }

    public void info() {
        System.out.println("Cat name: " + name);
        System.out.println("Cat appetite: " + appetite);
        System.out.println("Cat fullness: " + fullness);
    }
}
