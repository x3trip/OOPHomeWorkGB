package hw4.linkedlist.impl;

import hw4.linkedlist.Utils;
import hw4.linkedlist.Gettable;
import hw4.linkedlist.Insertable;
import hw4.node.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList implements Gettable<Node>, Insertable<Node>, Utils<Node> {
    public static int sizeOfList = 0;

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    Node head;
    Node tail;

    @Override
    public boolean insertAtHead(Node node) {
        if (head == null) {
            tail = node;
        } else {
            head.prev = node;
        }
        node.next = head;
        head = node;
        sizeOfList++;
        return true;
    }

    @Override
    public boolean insertAtTail(Node node) {
        if (tail == null) {
            tail = node;
        } else {
            tail.next = node;
        }
        node.prev = tail;
        tail = node;
        sizeOfList++;
        return true;
    }

    @Override
    public boolean insertAfterIndex(int index, Node node) {
        Node current = head;
        int currentNodeIndex = 1;
        if (current == null) {
            throw new UnsupportedOperationException("The list is empty");
        }
        while (current != null && currentNodeIndex != index) {
            current = current.next;
            currentNodeIndex++;
        }
        if(current.next == null) {
            current.next = node;
        } else {
            node.next = current.next;
            node.prev = current.next.prev;
            current.next.prev = node;
            current.next = node;
        }
        sizeOfList++;
        return true;
    }

    @Override
    public boolean updateName(int nodeForFind) {
        Node nodeForUpdate = head;
        int currentNodeIndex = 1;
        if (sizeOfList == 0) {
            System.out.println("The list is empty");
            return false;
        }
        while (nodeForUpdate != null && currentNodeIndex != nodeForFind) {
            nodeForUpdate = nodeForUpdate.next;
            currentNodeIndex++;
        }
        System.out.print("Please input name for change: ");
        try {
            String newName = bufferedReader.readLine();
            nodeForUpdate.setName(newName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bufferedReader.markSupported();
    }

    @Override
    public Node remove(int index) {
        Node current = head;
        int currentNodeIndex = 1;
        if (head == null) {
            throw new UnsupportedOperationException("List is empty.");
        }
        while (current != null && currentNodeIndex != index) {
            current = current.next;
            currentNodeIndex++;
        }
        if(current.next == null) {
            current.prev.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        sizeOfList--;
        return current;
    }

    @Override
    public Node getOnIndex(int index) {
        int currentNodeIndex = 1;
        while (head != null && currentNodeIndex != index) {
            head = head.next;
            currentNodeIndex++;
        }
        return head;
    }

    @Override
    public int size() {
        return sizeOfList;
    }

    public void showAllList() {
        Node current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    @Override
    public Node getFirst() {
        return head;
    }

    @Override
    public Node getLast() {
        return tail;
    }
}
