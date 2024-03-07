package hw4;

import java.time.LocalDate;

import hw4.node.Node;
import hw4.linkedlist.impl.LinkedList;

public class Program {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList();

        myLinkedList.insertAtHead(new Node("Егорка", LocalDate.of(1992, 8, 31)));
        myLinkedList.insertAtHead(new Node("Сашка", LocalDate.of(1900, 12, 3)));
        myLinkedList.insertAtHead(new Node("Маринка", LocalDate.of(1881, 1, 7)));

//        myLinkedList.updateName(3);

        System.out.println();
        myLinkedList.insertAtTail(new Node("Петька", LocalDate.of(1945, 3, 15)));
        myLinkedList.insertAtTail(new Node("Володька", LocalDate.of(1571, 11, 1)));

//        myLinkedList.showAllList();

        myLinkedList.insertAfterIndex(1, new Node("Федька"
                , LocalDate.of(1993, 12, 31)));


        myLinkedList.showAllList();

//        System.out.println("First element: " + myLinkedList.getFirst());
//        System.out.println("Last element: " + myLinkedList.getLast());

        System.out.println();
        System.out.println("Deleted " + myLinkedList.remove(4));
        System.out.println("Deleted " + myLinkedList.remove(2));
        System.out.println();

        myLinkedList.showAllList();

        System.out.println();

        System.out.println("Get Element: " + myLinkedList.getOnIndex(5));
//        System.out.println(LinkedList.sizeOfList);*/
    }
}