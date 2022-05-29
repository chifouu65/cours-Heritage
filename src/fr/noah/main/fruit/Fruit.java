package fr.noah.main.fruit;

public abstract class Fruit {
//info: abstact veux dire que l'ont devras redéfinir les obj dans la class

    Attribus attribus;

    public abstract boolean taste();

    public abstract int getSize();

    public abstract boolean hasSeed();

    public static void eatMessage() {
        System.out.println("eat a Fruits ! ");
    }
}
