package decorator.armure.sans_pattern.avec_heritage;

public class Humain {

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
