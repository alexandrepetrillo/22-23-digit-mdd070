package composite.fichier.sans_pattern;

public class Fichier {

    private String nom;
    private int tailleKo;

    public Fichier(String nom, int tailleKo) {
        this.nom = nom;
        this.tailleKo = tailleKo;
    }

    public String getNom() {
        return nom;
    }

    public int getTailleKo() {
        return tailleKo;
    }
}
