package visitor.poi;

import java.util.List;

public class Banque implements LieuInteret {

    private String coord;
    private String societe;

    public Banque(String coord, String societe) {
        this.coord = coord;
        this.societe = societe;
    }

    public String getCoord() {
        return coord;
    }

    @Override
    public void accept(LieuInteretVisitor visitor) {
        visitor.visitBanque(this);
    }

    public void setCoord(String coord) {
        this.coord = coord;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }
}
