package datastructures;

public class Node<T> {

    private T value;
    Node<T> next;

    Node(T value, Node<T> next) {
        this.value = (T) value;
        this.next = next;
    }

    T getValue() {
        return value;
    }

    void setValue(T newValue) {
        value = newValue;
    }

    boolean hasNext() {
        return next != null;
    }

    void setNext(Node node) {
        next = node;
    }

    Node getNext() {
        return next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<T> node = (Node<T>) o;

        return this.value.equals(node.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
