package composite.militaire.avec_pattern;

import java.util.ArrayList;
import java.util.List;

public class Brigade implements Unite {

    private List<Unite> sousUnites = new ArrayList<>();

    public void attaquer() {
        for (Unite sousUnite : sousUnites) {
            sousUnite.attaquer();
        }
    }

    public void add(Unite sousUnite) {
        sousUnites.add(sousUnite);
    }
}
