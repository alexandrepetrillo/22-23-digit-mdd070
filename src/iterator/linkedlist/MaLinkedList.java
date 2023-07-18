package iterator.linkedlist;

public class MaLinkedList {

    private Maillon first = null;

    public void add(String e) {
        Maillon maillon = new Maillon();
        maillon.valeur = e;

        if (first == null) {
            first = maillon;
        } else {
            Maillon maillonCourant = first;
            while (maillonCourant.next != null) {
                maillonCourant = maillonCourant.next;
            }
            maillonCourant.next = maillon;
        }
    }

    public String get(int i) {
        int indexCourant = 0;
        Maillon maillonCourant = first;
        while (indexCourant != i) {
            if (maillonCourant == null) {
                throw new ArrayIndexOutOfBoundsException();
            }
            maillonCourant = maillonCourant.next;
            indexCourant++;
        }
        return maillonCourant.valeur;
    }

    public int size() {
        int size = 0;
        Maillon maillonCourant = first;
        while (maillonCourant != null) {
            size++;
            maillonCourant = maillonCourant.next;
        }
        return size;
    }



    private static class Maillon {

        Maillon next;
        String valeur;
    }

}
