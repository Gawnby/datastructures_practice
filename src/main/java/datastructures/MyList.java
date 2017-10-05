package datastructures;

public interface MyList<T> {

    void add(T element);

    String toString();

    boolean isEmpty();

    int size();

    T get(int index);

    void remove(int index);

    void set(int index, T newValue);

    void clear();

    int indexOf(T searchedValue);

    boolean contains(T searchedValue);

}

