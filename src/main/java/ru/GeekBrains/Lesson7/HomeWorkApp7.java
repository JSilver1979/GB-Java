package ru.GeekBrains.Lesson7;

public class HomeWorkApp7 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 21);
        Plate plate = new Plate(50);


        Cat[] cats  = new Cat[3];
        cats[0] = new Cat ("Murzik", 10);
        cats[1] = new Cat ("Markiz", 25);
        cats[2] = new Cat("Shustrik", 16);

        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
            plate.info();
            cats[i].eat(plate);
            cats[i].info();
            plate.info();
            System.out.println("--------");
        }
        plate.addFood(100);
        plate.info();
        cats[2].eat(plate);
        cats[2].info();
        plate.info();

    }
}
