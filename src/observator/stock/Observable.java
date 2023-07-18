package observator.stock;

public interface Observable {

    void subscribe(Observator observator);

    void unsubscribe(Observator observator);
}
