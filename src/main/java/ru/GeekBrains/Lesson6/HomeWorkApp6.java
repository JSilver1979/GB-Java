package ru.GeekBrains.Lesson6;

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Маркиз");
        cat.getInfo();
        cat.run(300);
        cat.swim(0);

        Dog dog1 = new Dog("Бобик");
        dog1.getInfo();
        dog1.run(1000);
        dog1.swim(10);

        Dog dog2 = new Dog("Моська");
        dog2.getInfo();
        dog2.run(450);
        dog2.swim(30);

        System.out.println("Собак пробежало: " + Dog.dogCount);
        System.out.println("Котов проплыло: " + Cat.catCount);
        System.out.println("Животных создано: " + Animal.animalCount);

    }
}
