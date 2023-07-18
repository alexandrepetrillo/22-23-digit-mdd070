package abstractfactory.batiment.avec_pattern;

import java.util.Objects;

public class Client {

    public static void main(String[] args) {
        MeubleFactory meubleFactory = null;
        if (args.length == 0 || Objects.equals(args[0], "classic")) {
            meubleFactory = new ClassicFactory();
        } else if (Objects.equals(args[0], "moderne")) {
            meubleFactory = new ModerneFactory();
        }

        Chaise chaise1 = meubleFactory.creerChaise();
        Table table1 = meubleFactory.creerTable();
        // ajoute dans notre piece.
    }

}
