package observator.stock;

public class Client implements Observator {

    @Override
    public void notification() {
        System.out.println("On vient de me prevenir que le telephone était a nouveau en stock");
    }
}
