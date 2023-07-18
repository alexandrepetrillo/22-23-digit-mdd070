package observator.stock;

import java.util.ArrayList;
import java.util.List;

public class Magasin implements Observable {

    private List<Observator> observators = new ArrayList<>();
    private int stock = 0;

    public void acheter() {
        if (stock == 0) {
            throw new RuntimeException("Stock vide");
        }
        stock--;
    }

    public void receptionner(int qte) {
        boolean stockVideAvantReception = stock == 0;
        stock += qte;
        if (stockVideAvantReception) {
            for (Observator observator : observators) {
                observator.notification();
            }
        }
    }

    @Override
    public void subscribe(Observator observator) {
        observators.add(observator);
    }

    @Override
    public void unsubscribe(Observator observator) {
        observators.remove(observator);
    }
}
