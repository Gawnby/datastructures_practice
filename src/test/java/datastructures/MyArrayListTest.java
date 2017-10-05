package datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyArrayListTest {

    MyList<Integer> testList = new MyArrayList<>();

    @Test
    void add() {
        testList.add(80);
        testList.add(90);
        System.out.println(testList.toString());
        Assertions.assertEquals(false,testList.isEmpty());
    }

    @Test
    void get() {
     testList.add(23);
     Assertions.assertEquals(23,testList.get(0).intValue());
    }

    @Test
    void remove() {
        testList.add(33);
        testList.add(44);
        testList.remove(0);
        Assertions.assertEquals(44,testList.get(0).intValue());
    }

    @Test
    void set() {
        testList.add(11);
        testList.set(0,13);
        Assertions.assertEquals(13, testList.get(0).intValue());
    }

    @Test
    void clear() {
        testList.add(11);
        testList.add(13);
        testList.clear();
        Assertions.assertEquals(true,testList.isEmpty());
    }

    @Test
    void indexOf() {
    testList.add(22);
    Assertions.assertEquals(0,testList.indexOf(22));

    }

    @Test
    void contains() {
        testList.add(28);
        Assertions.assertEquals(true,testList.contains(28));
        Assertions.assertEquals(false,testList.contains(11));
    }

}