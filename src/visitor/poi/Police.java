package visitor.poi;

public class Police  implements LieuInteret {
    private String coord;

    public Police(String coord) {
        this.coord = coord;
    }

    public String getCoord() {
        return coord;
    }

    @Override
    public void accept(LieuInteretVisitor visitor) {
        visitor.visitPolice(this);
    }

    public void setCoord(String coord) {
        this.coord = coord;
    }
}
