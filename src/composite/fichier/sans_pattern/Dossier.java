package composite.fichier.sans_pattern;

import java.util.ArrayList;
import java.util.List;

public class Dossier {

    private List<Fichier> fichiers= new ArrayList<>();

    private List<Dossier> sousDossiers = new ArrayList<>();

    public int calculerTailleTotale() {
        int tailleTotale = 0;
        for (Fichier fichier : fichiers) {
            tailleTotale += fichier.getTailleKo();
        }
        for (Dossier sousDossier : sousDossiers) {
            tailleTotale += sousDossier.calculerTailleTotale();
        }
        return tailleTotale;
    }

    public void addFichier(Fichier fichier1) {
        fichiers.add(fichier1);
    }

    public void addSousDossier(Dossier dossier3) {
        sousDossiers.add(dossier3);
    }
}
