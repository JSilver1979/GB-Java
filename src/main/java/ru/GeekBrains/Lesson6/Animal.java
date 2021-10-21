package ru.GeekBrains.Lesson6;

public class Animal {
    protected String name;
    protected int runStamina;
    protected int swimStamina;
    static int animalCount;

    public Animal() {
    }

    public Animal (String name) {
        this.name = name;
        animalCount++;
    }

    public void getInfo() {
        System.out.println("Имя животного: " + name);
    }

    public void run(int runDistance) {
        System.out.println("Животное пробежало:" + runDistance + " метров.");
    }

    public void swim(int swimDistance) {
        System.out.println("Животное проплыло: " + swimDistance + " метров.");
    }
}
