package composite.fichier.avec_pattern;

public class Client {

    public static void main(String[] args) {
        Fichier fichier1 = new Fichier("fichier1", 40);
        Fichier fichier2 = new Fichier("fichier2", 10);
        Fichier fichier3 = new Fichier("fichier3", 35);
        Fichier fichier4 = new Fichier("fichier4", 80);
        Fichier fichier5 = new Fichier("fichier5", 22);

        Dossier dossierRoot = new Dossier();
        Dossier dossier1 = new Dossier();
        Dossier dossier2 = new Dossier();
        Dossier dossier3 = new Dossier();

        dossierRoot.add(dossier1);
        dossierRoot.add(dossier2);
        dossier2.add(dossier3);

        dossier1.add(fichier1);
        dossier2.add(fichier2);
        dossier3.add(fichier3);
        dossier3.add(fichier4);
        dossier3.add(fichier5);

        System.out.println(dossierRoot.calculerTaille());
    }
}
