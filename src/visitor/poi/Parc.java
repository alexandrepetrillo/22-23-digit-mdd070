package visitor.poi;

public class Parc implements LieuInteret {
    private String coord;

    public Parc(String coord) {
        this.coord = coord;
    }

    public String getCoord() {
        return coord;
    }

    @Override
    public void accept(LieuInteretVisitor visitor) {
        visitor.visitParc(this);
    }

    public void setCoord(String coord) {
        this.coord = coord;
    }
}
