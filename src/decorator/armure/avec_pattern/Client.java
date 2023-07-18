package decorator.armure.avec_pattern;


public class Client {

    public static void main(String[] args) {
        Personnage humain = new Humain(100);
        Personnage humainEnArmure = new ArmureDecorator(humain, 90);
        Personnage humainEnArmureEtCasque = new CasqueDecorator(humainEnArmure, 20);


        Personnage humainEnCasque = new CasqueDecorator(humain, 20);


        System.out.println(humainEnCasque.getPointDeVie());
        humainEnCasque.encaisserDegat(60);
        System.out.println(humainEnCasque.getPointDeVie());
        humainEnCasque.encaisserDegat(50);
        System.out.println(humainEnCasque.getPointDeVie());

    }

}
