package datastructures;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {

    private int size = 0;
    private static final int initialCapacity = 10;
    private Object[] array;

    public MyArrayList() {
        array = new Object[initialCapacity];
    }

    public void add(T element) {
        if (size == initialCapacity) {
            increaseCapacity();
        }
        array[size++] = element;
    }

    private void increaseCapacity() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    @Override
    public String toString() {
        T current = (T) array[0];
        String out = "";
        if (current != null) {
            for (int i = 0; i < size; i++) {
                current = (T) array[i];
                out += String.valueOf(current.toString()) + ",";
            }
        } else {
            return "there no elements in this list";
        }
        return out;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (size < index) throw new IndexOutOfBoundsException("Too large index was given");
        return (T) array[index];
    }

    public void remove(int index) {
        if (index < size) {
            array[index] = null;
            int newIndex = index;
            while (newIndex < size) {
                array[newIndex] = array[newIndex + 1];
                array[newIndex + 1] = null;
                newIndex++;
            }
            size--;
        } else {
            throw new IndexOutOfBoundsException("Error");
        }
    }

    public void set(int index, T newValue) {
        if (size < index) throw new IndexOutOfBoundsException("There is not element with this index");
        array[index] = newValue;
    }

    public void clear() {
        Arrays.fill(array, null);
        size = 0;
    }

    public int indexOf(T searchedValue) {
        int index;
        for (index = 0; index < size; index++) {
            T current = (T) array[index];
            if (current.equals(searchedValue)) {
                break;
            }
        }
        return index;
    }

    public boolean contains(T searchedValue) {
        boolean contains = false;
        for (int index = 0; index < size; index++) {
            T current = (T) array[index];
            if (current.equals(searchedValue)) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}
