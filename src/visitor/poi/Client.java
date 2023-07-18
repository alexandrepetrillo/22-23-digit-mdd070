package visitor.poi;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<LieuInteret> lieux = new ArrayList<>();

        lieux.add(new Banque("1.12;2.24", "LCL"));
        lieux.add(new Banque("3.12;2.24", "Credit Agricole"));
        lieux.add(new Mairie("2.12;2.14", "10h-11h30 15h-16h30"));
        lieux.add(new Parc("2.15;1.14"));
        lieux.add(new Police("1.615;1.14"));
        lieux.add(new Restaurant("1.15;1.64", "12h-14h", "Cher"));

        System.out.println("sans pattern");
        faireUnResumePourUnTouriste_SANS_PATTERN(lieux);
        System.out.println("avec pattern");
        faireUnResumePourUnTouriste_AVEC_PATTERN(lieux);
    }

    private static void faireUnResumePourUnTouriste_SANS_PATTERN(List<LieuInteret> lieux) {
        for (LieuInteret lieuInteret : lieux) {
            if (lieuInteret instanceof Banque) {
                // Rien
            } else if (lieuInteret instanceof Mairie) {
                // Rien
            } else if (lieuInteret instanceof Parc) {
                Parc parc = (Parc) lieuInteret;
                System.out.println(parc.getCoord() + " il s'agit d'un parc");
            } else if (lieuInteret instanceof Police) {
                // Rien
            } else if (lieuInteret instanceof Restaurant) {
                Restaurant restaurant = (Restaurant) lieuInteret;
                System.out.println(restaurant.getCoord() + " Il s'agit d'un restaurant " + restaurant.getPrix());
            }
        }
    }

    private static void faireUnResumePourUnTouriste_AVEC_PATTERN(List<LieuInteret> lieux) {
        TouristeVisitor visitor = new TouristeVisitor();
        for (LieuInteret lieuInteret : lieux) {
            lieuInteret.accept(visitor);
        }
    }
}
