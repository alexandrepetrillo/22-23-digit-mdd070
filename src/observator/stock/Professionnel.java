package observator.stock;

public class Professionnel implements Observator {

    @Override
    public void notification() {
        System.out.println("On vient de me prevenir que le telephone était a nouveau en stock");
    }
}
