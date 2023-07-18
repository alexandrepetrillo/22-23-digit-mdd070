package decorator.armure.avec_pattern;

public class ArmureDecorator extends PersonnageDecorator {

    private int percentReductionDegat;

    public ArmureDecorator(Personnage personnage, int percentReductionDegat) {
        super(personnage);
        this.percentReductionDegat = percentReductionDegat;
    }

    @Override
    public void encaisserDegat(int degat) {
        degat = degat - (degat * percentReductionDegat / 100);
        personnage.encaisserDegat(degat);
    }

    @Override
    public int getPointDeVie() {
        return personnage.getPointDeVie();
    }
}
