package decorator.armure.avec_pattern;

public abstract class PersonnageDecorator implements Personnage {

    protected Personnage personnage;

    public PersonnageDecorator(Personnage personnage) {
        this.personnage = personnage;
    }
}
