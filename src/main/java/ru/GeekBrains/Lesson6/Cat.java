package ru.GeekBrains.Lesson6;

public class Cat extends Animal {
    static int catCount;


    public Cat (String name) {
        this.name = name;
        runStamina = 200;
        swimStamina = 0;
        catCount ++;
        animalCount++;
    }

    @Override
    public void getInfo() {
        System.out.println("Имя кота: " + name);
        System.out.println("Выносливость кота в беге: " + runStamina);
        System.out.println("Выносливость кота в плавании: " + swimStamina);
        System.out.println();
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= runStamina && runDistance > 0) {
            System.out.println("Кот " + name + " пробежал " + runDistance + " метров");
        } else if (runDistance > runStamina){
            System.out.println("Кот " + name + " пробежал " + runStamina + " метров и упал от усталости");
        }
        System.out.println();
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance != swimStamina) {
            System.out.println("Кот " + name + " отказался плыть, потому что не умеет");
        } else {
            System.out.println("Кот " + name + " помочил лапки");
        }
        System.out.println();
    }
}
