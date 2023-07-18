package abstractfactory.batiment.avec_pattern;


public class ModerneFactory implements MeubleFactory {

    @Override
    public Chaise creerChaise() {
        return new ChaiseModerne();
    }

    @Override
    public Table creerTable() {
        return new TableModerne();
    }
}
