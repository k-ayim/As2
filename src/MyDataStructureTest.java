public class MyDataStructureTest {
    public static void main(String[] args) {
        testArrayList();
        testLinkedList();
    }

    private static void testArrayList() {
        MyList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("ArrayList size: " + list.size()); // Output: 3
        System.out.println("Element at index 1: " + list.get(1)); // Output: 2

        list.remove(1);
        System.out.println("ArrayList size after removal: " + list.size()); // Output: 2
        System.out.println("Element at index 1 after removal: " + list.get(1)); // Output: 3
    }

    private static void testLinkedList() {
        MyList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("LinkedList size: " + list.size()); // Output: 3
        System.out.println("Element at index 1: " + list.get(1)); // Output: 2

        // Add more test cases for LinkedList
    }
}
