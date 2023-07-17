package iterator.monarraylist;

public class MonTreeSet {

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
}

