package composite.fichier.sans_pattern;

import java.util.ArrayList;
import java.util.List;

public class Dossier {

    private List<Fichier> fichiers;

    private List<Dossier> sousDossiers = new ArrayList<>();

    public int calculerTailleTotale() {
        //TODO
        return 0;
    }

    public void addFichier(Fichier fichier1) {
        fichiers.add(fichier1);
    }

    public void addSousDossier(Dossier dossier3) {
        sousDossiers.add(dossier3);
    }
}
