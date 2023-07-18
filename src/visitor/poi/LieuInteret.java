package visitor.poi;

public interface LieuInteret {

    String getCoord();

    void accept(LieuInteretVisitor visitor);
}
