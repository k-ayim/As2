public class MyLinkedList<E> implements MyList<E> {
    private static class MyNode<E> {
        E data;
        MyNode<E> next;
        MyNode<E> prev;

        public MyNode(E data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private MyNode<E> head;
    private MyNode<E> tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void add(E element) {
        MyNode<E> newNode = new MyNode<>(element);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        // Implement remove method
    }

    @Override
    public E get(int index) {
        // Implement get method
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
