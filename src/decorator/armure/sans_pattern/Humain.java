package decorator.armure.sans_pattern;

public class Humain {

    private Casque casque;
    private Armure armure;

    public Humain(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    private int pointDeVie;

    public void encaisserDegat(int degat) {
        if (casque != null) {
            degat = degat - (degat * casque.percentReductionDegat / 100);
        }
         if (armure != null) {
            degat = degat - (degat * armure.percentReductionDegat / 100);
        }
        pointDeVie -= degat;
        if (pointDeVie <= 0) {
            throw new RuntimeException("Personnage mort!");
        }
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setCasque(Casque casque) {
        this.casque = casque;
    }

    public void setArmure(Armure armure) {
        this.armure = armure;
    }
}
