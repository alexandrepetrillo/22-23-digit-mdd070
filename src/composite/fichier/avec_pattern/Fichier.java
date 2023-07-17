package composite.fichier.avec_pattern;

public class Fichier implements IFile {

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

    @Override
    public int calculerTaille() {
        return getTailleKo();
    }
}
