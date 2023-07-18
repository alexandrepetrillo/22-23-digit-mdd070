package iterator;

import java.util.ArrayList;
import java.util.List;
import javax.lang.model.type.ArrayType;

public class MonTreeSet implements Iterable {

    private Arbre arbre;

    public void add(String valeur) {
        if (arbre == null) {
            arbre = new Arbre();
            arbre.valeur = valeur;
        } else {
            arbre.add(valeur);
        }
    }

    public int size() {
        if (arbre == null) {
            return 0;
        } else {
            return arbre.size();
        }
    }

    public Arbre getArbre() {
        return arbre;
    }

    public Iterator iterator() {
        return new MonTreeSetIterator(arbre);
    }

    public static class Arbre {

        private Arbre gauche;
        private Arbre droit;

        private String valeur;

        public void add(String valeur) {
            if (valeur.compareTo(this.valeur) < 0) {
                if (gauche == null) {
                    gauche = new Arbre();
                    gauche.valeur = valeur;
                } else {
                    gauche.add(valeur);
                }
            } else {
                if (droit == null) {
                    droit = new Arbre();
                    droit.valeur = valeur;
                } else {
                    droit.add(valeur);
                }
            }
        }

        public int size() {
            int sizeG = gauche == null ? 0 : gauche.size();
            int sizeD = droit == null ? 0 : droit.size();
            return sizeG + sizeD + 1;
        }

        public String getValeur() {
            return valeur;
        }

        public Arbre getGauche() {
            return gauche;
        }

        public Arbre getDroit() {
            return droit;
        }
    }

    private class MonTreeSetIterator implements Iterator {
        private List<Arbre> arbresATraiter = new ArrayList<>();

        MonTreeSetIterator(Arbre arbre) {
            arbresATraiter.add(arbre);
        }
        @Override
        public boolean hasNext() {
            return !arbresATraiter.isEmpty();
        }
        @Override
        public String next() {
            Arbre arbre = arbresATraiter.remove(0);
            if (arbre.getGauche() != null) {
                arbresATraiter.add(arbre.getGauche());
            }
            if (arbre.getDroit() != null) {
                arbresATraiter.add(arbre.getDroit());
            }
            return arbre.valeur;
        }
    }
}

