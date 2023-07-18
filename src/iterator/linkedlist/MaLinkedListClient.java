package iterator.linkedlist;

public class MaLinkedListClient {

    public static void main(String[] args) {
        MaLinkedList maLinkedList = new MaLinkedList();
        System.out.println(maLinkedList.size());
        maLinkedList.add("A");
        System.out.println(maLinkedList.size());
        maLinkedList.add("B");
        maLinkedList.add("C");
        maLinkedList.add("D");
        maLinkedList.add("E");
        maLinkedList.add("F");
        maLinkedList.add("G");
        maLinkedList.add("H");
        maLinkedList.add("I");
        maLinkedList.add("J");
        maLinkedList.add("K");

        System.out.println(maLinkedList.size());
        System.out.println(maLinkedList.get(5));

    }
}
