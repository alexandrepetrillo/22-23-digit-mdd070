package iterator;

public class MonArrayListIterator implements Iterator {

    private final String[] array;
    private final int size;

    private int i = 0;

    public MonArrayListIterator(String[] array, int size) {
        this.array = array;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return i < size;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new RuntimeException("index out of bound");
        }
        String e = array[i];
        i = i + 1;
        return e;
    }
}
