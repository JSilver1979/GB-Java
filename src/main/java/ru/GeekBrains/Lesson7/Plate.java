package ru.GeekBrains.Lesson7;

public class Plate {
    private int food;
    boolean isFoodEated;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int eated) {
        if (food >= eated) {
            food -= eated;
            isFoodEated = true;
        } else {
            System.out.println("В тарелке мало еды для кота");
            isFoodEated = false;
        }
    }

    public void addFood(int food) {
        this.food += food;
        System.out.println(food + " еды положили в тарелку");
    }
}
