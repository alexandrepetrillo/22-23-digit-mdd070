package decorator.armure.avec_pattern;

public class CasqueDecorator extends PersonnageDecorator {

    private int percentReductionDegat;

    public CasqueDecorator(Personnage personnage, int percentReductionDegat) {
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
