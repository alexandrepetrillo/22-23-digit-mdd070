package decorator.armure.sans_pattern.avec_heritage;

public class HumainEnArmure extends Humain {

    private int percentReductionDegatArmure;

    public HumainEnArmure(int pointDeVie, int percentReductionDegatArmure) {
        super(pointDeVie);
        this.percentReductionDegatArmure = percentReductionDegatArmure;
    }

    @Override
    public void encaisserDegat(int degat) {
        degat = degat - (degat * percentReductionDegatArmure / 100);
        super.encaisserDegat(degat);
    }
}
