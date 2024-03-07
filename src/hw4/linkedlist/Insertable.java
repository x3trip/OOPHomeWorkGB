package hw4.linkedlist;

public interface Insertable<N> {
    boolean insertAtHead(N node);
    boolean insertAtTail(N node);
    boolean insertAfterIndex(int index, N node);
}
