package visitor.poi;

public class Restaurant implements LieuInteret {

    private String coord;

    private String heureOuverture;
    private String prix;

    public Restaurant(String coord, String heureOuverture, String prix) {
        this.coord = coord;
        this.heureOuverture = heureOuverture;
        this.prix = prix;
    }

    public String getHeureOuverture() {
        return heureOuverture;
    }

    public void setHeureOuverture(String heureOuverture) {
        this.heureOuverture = heureOuverture;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getCoord() {
        return coord;
    }

    @Override
    public void accept(LieuInteretVisitor visitor) {
        visitor.visitRestaurant(this);
    }

    public void setCoord(String coord) {
        this.coord = coord;
    }
}
