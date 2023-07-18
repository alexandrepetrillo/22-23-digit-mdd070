package abstractfactory.batiment.sans_pattern;

import java.util.Objects;

public class Client {

    public static void main(String[] args) {
        if (args.length == 0 || Objects.equals(args[0], "classic")) {
            Chaise chaise1 = new ChaiseClassic();
            Table table1 = new TableClassic();
            // ajoute dans notre piece.
        } else if (Objects.equals(args[0], "moderne")) {
            Chaise chaise1 = new ChaiseModerne();
            Table table1 = new TableModerne();
        }
    }

}
