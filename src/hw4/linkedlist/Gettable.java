package hw4.linkedlist;

public interface Gettable<N> {
    N getLast();
    N getFirst();
    N getOnIndex(int index);
}
