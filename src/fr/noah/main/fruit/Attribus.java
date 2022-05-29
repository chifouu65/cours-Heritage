package fr.noah.main.fruit;

public class Attribus {
    private  String sucre;
    private String amerre;

    public Attribus(String sucre, String amerre) {
        this.sucre = sucre;
        this.amerre = amerre;
    }

    public static String setSucre() {
        String s = (" | Et il est sucré");
        return s;
    }

    public static String setAmerre() {
        String a = (" | Et il est amère");
        return a;
    }





}
