package composite.militaire.sans_pattern;

import java.util.List;

public class Joueur {

    private List<Soldat> soldats;
    private List<Brigade> brigades;

    void attaqueGenerale() {
        for (Soldat soldat : soldats) {
            soldat.attaquer();
        }
        for (Brigade brigade : brigades) {
            brigade.attaquer();
        }

        // Désavantages:
        // repetition du code
        // pas évolutif si j'ajoute de nouveaux types d'unités
    }

}































