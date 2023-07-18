package decorator.armure.sans_pattern.avec_heritage;

public class Client {

    public static void main(String[] args) {
        Humain humain = new Humain(100);
        HumainEnArmure humainArmure = new HumainEnArmure(100, 90);
        HumainEnArmureEtCasque humainEnArmureEtCasque = new HumainEnArmureEtCasque(100, 90, 20);

        // HumainAvecCasque ?
    }

}
