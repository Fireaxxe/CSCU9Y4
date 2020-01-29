public class LinkedList<T> {

    private Node _first;
    private int _size;

    public LinkedList() {
        _first = null;
        _size = 0;
    }

    public int getSize() {
        return _size;
    }

    public void add(T data) {
        Node current = _first;

        if (current == null) {
            _first = new Node(data);
            _size++;
            return;
        }

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Node(data));
        _size++;
    }

    public void add(T[] array) {
        for (T data : array) {
            add(data);
        }
    }

    public void remove(T data) {
        Node current = _first;
        Node next = current.getNext();

        if (_first.getData().equals(data)) {
            if (_size == 1) {
                _first.setData(null);
                _size--;
                return;
            }
            _first.setData(null);
            _first = _first.getNext();
            _size--;
            return;
        }

        while (next != null) {
            if (next.getData().equals(data)) {
                current.setNext(next.getNext());
                next = null;
                _size--;
                return;
            }
            current = next;
            next = current.getNext();
        }
    }

    private class Node<T> {

        private T _data;
        private Node _next;

        public Node(T data) {
            _data = data;
            _next = null;
        }

        public void setData(T data) {
            _data = data;
        }

        public T getData() {
            return _data;
        }

        public void setNext(Node next) {
            _next = next;
        }

        public Node getNext() {
            return _next;
        }
    }
}