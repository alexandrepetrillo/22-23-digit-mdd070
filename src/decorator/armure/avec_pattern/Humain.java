package decorator.armure.avec_pattern;

import decorator.armure.sans_pattern.Armure;
import decorator.armure.sans_pattern.Casque;

public class Humain implements Personnage {

    public Humain(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    private int pointDeVie;

    public void encaisserDegat(int degat) {
        pointDeVie -= degat;
        if (pointDeVie <= 0) {
            throw new RuntimeException("Personnage mort!");
        }
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

}
