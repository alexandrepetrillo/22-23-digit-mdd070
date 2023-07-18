package abstractfactory.batiment.avec_pattern;


public class ClassicFactory implements MeubleFactory {

    @Override
    public Chaise creerChaise() {
        return new ChaiseClassic();
    }

    @Override
    public Table creerTable() {
        return new TableClassic();
    }
}
