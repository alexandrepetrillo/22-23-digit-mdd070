package iterator;

import java.util.ArrayList;
import java.util.List;

import iterator.MonTreeSet.Arbre;

public class MonTreeSetClient {

    public static void main(String[] args) {
        MonTreeSet montTreeSet = new MonTreeSet();
        System.out.println(montTreeSet.size());
        montTreeSet.add("A");
        montTreeSet.add("B");
        montTreeSet.add("C");
        montTreeSet.add(".D");
        montTreeSet.add(".E");
        montTreeSet.add("F");
        montTreeSet.add("G");
        montTreeSet.add("H");
        montTreeSet.add("I");
        montTreeSet.add("J");
        montTreeSet.add("K");

        System.out.println(montTreeSet.size());

        System.out.println("Parcours sans iterator");
        // itération diffile sans design pattern iterator
        List<Arbre> arbres = new ArrayList<>();
        arbres.add(montTreeSet.getArbre());
        while (!arbres.isEmpty()) {
            Arbre arbre = arbres.remove(0);
            if (arbre != null) {
                System.out.println(arbre.getValeur());
                arbres.add(arbre.getGauche());
                arbres.add(arbre.getDroit());
            }
        }

        System.out.println("Parcours avec iterator");
        Iterator iterator = montTreeSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


    }
}
