package fr.noah.main.fruit.items;

import fr.noah.main.fruit.Attribus;
import fr.noah.main.fruit.Fruit;

public class PineApple extends Fruit {

    String fruit = "pineApple";

    public void all() {
        System.out.println("=======================");//séparations

        System.out.println("TYPE : " + fruit);
        System.out.println("Sucré ? : " + taste() + Attribus.setSucre());
        System.out.println ("TAILLE : " + getSize());
        System.out.println(" PEPINS / GRAINES : "+ hasSeed());
    }


    @Override
    public boolean taste() {
        return true;
    }

    @Override
    public int getSize() {
        return 2;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }
}
