package iterator;

public class MonArrayList implements Iterable {

    private String[] array = new String[10];
    private int size = 0;

    public int size() {
        return size;
    }

    public void add(String e) {
        if (size == array.length) {
            // nouveau tableau plus grand
            String[] array2 = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }
            this.array = array2;
        }
        array[size++] = e;
    }

    public String get(int i) {
        return array[i];
    }

    public String[] getArray() {
        return array;
    }

    @Override
    public Iterator iterator() {
        return new MonArrayListIterator(array, size);
    }
}
