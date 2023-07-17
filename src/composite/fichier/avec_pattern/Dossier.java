package composite.fichier.avec_pattern;

import java.util.ArrayList;
import java.util.List;

public class Dossier implements IFile {

    private List<IFile> iFiles = new ArrayList<>();

    @Override
    public int calculerTaille() {
        int tailleTotale = 0;
        for (IFile iFile : iFiles) {
            tailleTotale += iFile.calculerTaille();
        }
        return tailleTotale;
    }

    public void add(IFile iFile) {
        iFiles.add(iFile);
    }

}
