package visitor.poi;

public interface LieuInteretVisitor {

    void visitMairie(Mairie mairie);

    void visitRestaurant(Restaurant restaurant);

    void visitBanque(Banque banque);

    void visitPolice(Police police);
    void visitParc(Parc parc);

}
