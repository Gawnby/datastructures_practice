package datastructures;


public class MyLinkedList<T> implements MyList<T> {

    private Node first = null;
    private int size = 0;

    public MyLinkedList() {}

    public boolean isEmpty() {
        return first == null;
    }


    public void add(T element) {
        Node<T> nodeToAdd = new Node(element, null);
        Node<T> current = first;
        if (first == null) {
            first = nodeToAdd;
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(nodeToAdd);
        }
        size++;
    }

    @Override
    public String toString() {
        Node<T> current = first;
        if (current == null) {
            return "there no elements in this list";
        }
        String out = "";
        if (current != null) {
            while (current.getNext() != null) {
                out += String.valueOf(current.toString()) + ",";
                current = current.getNext();
            }
            out += String.valueOf(current.toString());
        }
        return out;
    }

    public int size() {
        return size;
    }


    public T get(int index) {
        Node<T> current = first;
        int currentIndex = 0;

        if (index > size-1 || index < 0) {
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }

        if (current == null) {
            System.out.println("The list is empty");
        } else {
            while (current.getNext() != null) {
                if (index == currentIndex) {
                    break;
                }
                currentIndex++;
                current = current.getNext();
            }
        }
        return current.getValue();
    }


    public void remove(int index) {
        Node<T> current = first;
        int currentIndex = 0;
        Node nextNode;

        if (current == null || !contains(get(index))) {
            System.out.println("there no element to delete");
        } else {
            while (current.getNext() != null) {
                if (index -1 == currentIndex) {
                    nextNode = current.getNext().getNext();
                    current.setNext(nextNode);
                    size--;
                    break;
                }
                currentIndex++;
                current = current.getNext();
            }
        }
    }


    public void set(int index, T newValue) {
        Node<T> current = first;
        int currentIndex = 0;

        if (current == null) {
            System.out.println("there element in this list");
        } else {
            while (current.getNext() != null) {
                if (index == currentIndex) {
                    current.setValue(newValue);
                    break;
                }
                currentIndex++;
                current = current.getNext();
            }
        }
    }


    public void clear() {
        first = null;
    }


    public int indexOf(T searchedValue) {
        Node<T> current = first;
        int currentIndex = 0;

        if (current != null && contains(searchedValue)) {
            while (current.hasNext()) {
                if (current.getValue().equals(searchedValue)) {
                    break;
                }
                currentIndex++;
                current = current.getNext();
            }
        }
        else {
            currentIndex = -1;
        }

        return currentIndex;
    }

    public boolean contains(T searchNodeValue) {
        Node<T> current = first;
        boolean isContains = false;

        if (current != null) {
            while (current.hasNext()) {
                if (current.getValue().equals(searchNodeValue)) {
                    isContains = true;
                    break;
                }
                current = current.getNext();
            }
            if(current.getNext()== null){
                if(current.getValue().equals(searchNodeValue)){
                isContains  = true;}
            }
        }
        return isContains;
    }

}
