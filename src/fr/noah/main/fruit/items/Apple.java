package fr.noah.main.fruit.items;

import fr.noah.main.fruit.Attribus;
import fr.noah.main.fruit.Fruit;

public class Apple extends Fruit {

    String fruit = "POMME : ";

    Attribus attribus;

    Apple apple= this;

    public Apple() {
        this.apple = this;
    }

    public void all() {
        System.out.println("=======================");//séparations

        System.out.println("TYPE : " +fruit);
        System.out.println("Sucré ? : "+ taste() + Attribus.setSucre());
        System.out.println ("TAILLE : " + getSize());
        System.out.println(" PEPINS / GRAINES : "+ hasSeed());
    }


    public boolean taste() {
        return true;
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }
}
