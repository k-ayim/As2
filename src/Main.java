public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("ArrayList size: " + arrayList.size());

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("LinkedList size: " + linkedList.size());
    }
}