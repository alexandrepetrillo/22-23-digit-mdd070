package composite.militaire.avec_pattern;

public class Joueur {

    private Unite unite;

    void init() {
        Soldat soldat1 = new Soldat();
        Soldat soldat2 = new Soldat();
        Soldat soldat3 = new Soldat();
        Soldat soldat4 = new Soldat();

        Brigade brigade1 = new Brigade();
        Brigade brigade2 = new Brigade();

        brigade1.add(soldat1);
        brigade1.add(soldat2);

        brigade2.add(soldat3);
        brigade2.add(soldat4);

        Brigade brigade0 = new Brigade();
        brigade0.add(brigade1);
        brigade0.add(brigade2);

        unite = brigade0;
    }

    void attaqueGenerale() {
        unite.attaquer();
    }

    public static void main(String[] args) {
        Joueur joueur = new Joueur();
        joueur.init();
        joueur.attaqueGenerale();
    }

}































