package iterator;

public class MonArrayListClient {

    public static void main(String[] args) {
        MonArrayList monArrayList = new MonArrayList();
        System.out.println(monArrayList.size());
        monArrayList.add("A");
        System.out.println(monArrayList.size());
        monArrayList.add("B");
        monArrayList.add("C");
        monArrayList.add("D");
        monArrayList.add("E");
        monArrayList.add("F");
        monArrayList.add("G");
        monArrayList.add("H");
        monArrayList.add("I");
        monArrayList.add("J");
        monArrayList.add("K");

        System.out.println(monArrayList.size());
        System.out.println(monArrayList.get(5));

        // itération facile même sans design pattern iterator
        for (int i = 0; i < monArrayList.size(); i++) {
            System.out.println(monArrayList.getArray()[i]);
        }

        Iterator iterator = monArrayList.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

    }
}
