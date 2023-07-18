package iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        MonArrayList monArrayList = new MonArrayList();
        MonTreeSet monTreeSet = new MonTreeSet();

        // Les deux class sont des iterable, je peux donc manipuler des iterables sans me soucier de leur implémentation réélle.
        Iterable iterable = null;
        iterable = monArrayList;
        iterable = monTreeSet;

        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Le pattern iterable est tellement pratique que le language a défini dans le jdk les classes Iterable et Iterator et la syntaxe foreach est compatible avec tout objet de type iterable.
        List<String> list = new ArrayList<>();
        for (String e : list) {

        }
    }
}
