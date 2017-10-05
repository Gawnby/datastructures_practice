package datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {


    MyList<String> testList = new MyLinkedList();



    @Test
    void add() {
        testList.add("word");
        Assertions.assertEquals(false,testList.isEmpty());
    }

    @Test
    void get() {
        testList.add("sonka");
        testList.add("pacal");
        Assertions.assertEquals("sonka",testList.get(0));
        Assertions.assertEquals("pacal",testList.get(1));
    }

    @Test
    void remove() {
        testList.add("sonka");
        testList.add("pacal");
        testList.remove(1);
        Assertions.assertEquals(false,testList.contains("pacal"));

    }

    @Test
    void set() {
        testList.add("sonka");
        testList.add("pacal");
        testList.set(0,"ujsonka");
        Assertions.assertEquals("ujsonka",testList.get(0));
    }

    @Test
    void clear() {
        testList.add("sonka");
        testList.add("pacal");
        testList.clear();
        Assertions.assertEquals(true,testList.isEmpty());

    }

    @Test
    void indexOfFirst() {
        testList.add("sonka");
        testList.add("valami");
        Assertions.assertEquals(0,testList.indexOf("sonka"));

    }

    @Test
    void indexOfLast() {
        testList.add("sonka");
        testList.add("valami");
        testList.add("tarja");

        Assertions.assertEquals(2,testList.indexOf("tarja"));

    }

    @Test
    void indexOfMiddle() {
        testList.add("sonka");
        testList.add("valami");
        testList.add("tarja");
        Assertions.assertEquals(0,testList.indexOf("sonka"));

    }

    @Test
    void indexOfMoreThanTenElement() {
        testList.add("sonka"); testList.add("word"); testList.add("karo");
        testList.add("labda"); testList.add("kapa"); testList.add("foci");
        testList.add("kosar"); testList.add("asztal"); testList.add("ajto");
        testList.add("auto"); testList.add("index"); testList.add("proba");
        Assertions.assertEquals(11,testList.indexOf("proba"));

    }
    @Test
    void indexOfEmptyList() {
        testList.add("sonka");
        testList.add("valami");
        Assertions.assertEquals(-1,testList.indexOf("barmi"));

    }

    @Test
    void contains(){
        testList.add("sonka");
        testList.add("tarja");
        testList.add("csotany");
        Assertions.assertEquals(true,testList.contains("tarja"));
    }

}