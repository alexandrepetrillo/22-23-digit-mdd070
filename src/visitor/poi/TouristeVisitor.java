package visitor.poi;

public class TouristeVisitor extends EmptyVisitor {

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        System.out.println(restaurant.getCoord() + " Il s'agit d'un restaurant " + restaurant.getPrix());
    }

    @Override
    public void visitParc(Parc parc) {
        System.out.println(parc.getCoord() + " il s'agit d'un parc");
    }
}
