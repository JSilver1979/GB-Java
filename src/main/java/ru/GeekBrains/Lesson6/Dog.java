package ru.GeekBrains.Lesson6;

public class Dog extends Animal{
    static int dogCount;

    public Dog (String name) {
        this.name = name;
        runStamina = 500;
        swimStamina = 10;
        dogCount ++;
        animalCount ++;
    }

    @Override
    public void getInfo() {
        System.out.println("Имя собаки: " + name);
        System.out.println("Выносливость собаки в беге: " + runStamina);
        System.out.println("Выносливость собаки в плавании: " + swimStamina);
        System.out.println();
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= runStamina && runDistance > 0) {
            System.out.println("Собака " + name + " пробежала " + runDistance + " метров");
        } else if (runDistance > runStamina){
            System.out.println("Собака " + name + " пробежала " + runStamina + " метров и остановилась высунув язык");
        }
        System.out.println();
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance <= swimStamina && swimStamina > 0) {
            System.out.println("Собака " + name + " проплыла " + swimDistance + " метров");
        } else if (swimDistance > swimStamina){
            System.out.println("Собака " + name + " не уверена, что может проплыть больше " + swimStamina + " метров");
        }
        System.out.println();
    }
}
