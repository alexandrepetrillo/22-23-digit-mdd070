package visitor.poi;

public class Mairie implements LieuInteret {

    private String coord;

    public Mairie(String coord, String heureOuverture) {
        this.coord = coord;
        this.heureOuverture = heureOuverture;
    }

    private String heureOuverture;

    public String getHeureOuverture() {
        return heureOuverture;
    }

    public void setHeureOuverture(String heureOuverture) {
        this.heureOuverture = heureOuverture;
    }

    public String getCoord() {
        return coord;
    }

    @Override
    public void accept(LieuInteretVisitor visitor) {
        visitor.visitMairie(this);
    }

    public void setCoord(String coord) {
        this.coord = coord;
    }
}
