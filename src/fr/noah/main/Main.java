package fr.noah.main;

import fr.noah.main.fruit.Attribus;
import fr.noah.main.fruit.Fruit;
import fr.noah.main.fruit.items.Apple;
import fr.noah.main.fruit.items.PineApple;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple();
        PineApple pineApple = new PineApple();


        Fruit.eatMessage();

        apple.all();

        pineApple.all();

    }

}
