public class MyQueue<V> {
    private class Node<V> {
        V v;
        Node next;
        public Node(V v) {
            this.v  = v;
        }
    }

    private int size;
    private Node<V> head;
    private Node<V> tail;

    public MyQueue() {
        size = 0;
        head = null;
        tail = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(V v) {
        if (head == null) {
            head = new Node(v);
            tail = head;
        } else {
            tail.next = new Node(v);
            tail = tail.next;
        }

        size++;
    }

    public V remove() {
        if (size == 0) return null;

        V v = head.v;
        head = head.next;
        size--;

        return v;
    }

    public V peek() {
        if (size == 0) return null;

        V v = head.v;

        return v;
    }

	
    public static void main(String args[]) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        System.out.println("Expected size 3, Actual size: " + myQueue.size());

        Integer i = (Integer) myQueue.remove();
        System.out.println("Expected size 2, Actual size: " + myQueue.size());
        System.out.println("Expected removed value 1, Actual removed value: " + i);

        i = (Integer) myQueue.remove();
        System.out.println("Expected removed value 2, Actual removed value: " + i);

        i = (Integer) myQueue.remove();
        System.out.println("Expected removed value 3, Actual removed value: " + i);

        System.out.println("Expected size 0, Actual size: " + myQueue.size());

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        i = (Integer) myQueue.peek();
        System.out.println("Expected size 3, Actual size: " + myQueue.size());
        System.out.println("Expected peeked value 1, Actual peeked value: " + i);

    }

}