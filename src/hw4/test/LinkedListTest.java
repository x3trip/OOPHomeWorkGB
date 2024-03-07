package hw4.test;

import hw4.linkedlist.impl.LinkedList;
import hw4.node.Node;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    static LinkedList testList;

    @BeforeAll
    @Test
    static void creatingMyList() {
        testList = new LinkedList();
        testList.insertAtHead(new Node("Саша", LocalDate.of(1900, 10, 5)));
        testList.insertAtHead(new Node("Маша", LocalDate.of(1998, 6, 13)));
        testList.insertAtHead(new Node("Петька", LocalDate.of(1998, 6, 13)));
    }

    @Test
    void testInsertingElementAtHead() {
        testList.insertAtHead(new Node("Маша", LocalDate.of(1998, 6, 13)));
        assertEquals("Маша", testList.getFirst().getName());
    }

    @Test
    void insertAtTail() {
        testList.insertAtTail(new Node("Маша", LocalDate.of(1998, 6, 13)));
        assertEquals(new Node("Маша", LocalDate.of(1998, 6, 13)), testList.getLast());

    }

    @Test
    void testInsertOnIndex() {
        assertTrue(testList.insertAfterIndex(1
                , new Node("Мария", LocalDate.of(350, 2, 4))));

    }

    @Test
    void testUpdateName() {
        // Can't find approach to test this, computer become freeze, because we ought to enter the name...
    }

    @Test
    void remove() {
        testList.remove(2);
        assertEquals(new Node("Саша", LocalDate.of(1900, 10, 5)), testList.getLast());
    }

    @Test
    void testMethodGetOnIndex() {
        assertEquals( "Мария", testList.getOnIndex(2).getName());
    }

    @Test
    void testSizeOfMyList() {
        assertEquals(6, testList.size());
    }

    @Test
    void testMethodShowAllList() {
        // Can't find approach to test this
    }

    @Test
    void testGetFirstElement() {
        testList.insertAtHead(new Node("Марципана", LocalDate.of(1430, 3, 13)));
        assertEquals("Марципана", testList.getFirst().getName());
    }

    @Test
    void testGetLastElement() {
        assertEquals("Саша", testList.getLast().getName());
    }
}