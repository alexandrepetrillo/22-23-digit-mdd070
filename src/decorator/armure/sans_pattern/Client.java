package decorator.armure.sans_pattern;

public class Client {

    public static void main(String[] args) {
        Humain humainArmure = new Humain(100);
        Armure armure = new Armure(90);
        humainArmure.setArmure(armure);

        Humain humainCasque = new Humain(100);
        Casque casque = new Casque(90);
        humainCasque.setCasque(casque);

        Humain humainNu = new Humain(100);



        System.out.println(humainArmure.getPointDeVie());
        humainArmure.encaisserDegat(60);
        System.out.println(humainArmure.getPointDeVie());
        humainArmure.encaisserDegat(50);
        System.out.println(humainArmure.getPointDeVie());

    }

}
