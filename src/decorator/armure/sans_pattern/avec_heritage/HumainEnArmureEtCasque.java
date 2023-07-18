package decorator.armure.sans_pattern.avec_heritage;

public class HumainEnArmureEtCasque extends HumainEnArmure {

    public int percentReductionDegatCasque;

    public HumainEnArmureEtCasque(int pointDeVie, int percentReductionDegatArmure, int percentReductionDegatCasque ) {
        super(pointDeVie, percentReductionDegatArmure);
        this.percentReductionDegatCasque = percentReductionDegatCasque;
    }

    @Override
    public void encaisserDegat(int degat) {
        degat = degat - (degat * percentReductionDegatCasque / 100);
        super.encaisserDegat(degat);
    }
}
