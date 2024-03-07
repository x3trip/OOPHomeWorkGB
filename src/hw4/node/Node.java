package hw4.node;

import java.time.LocalDate;
import java.util.Objects;

public class Node {
    public Node next;
    public Node prev;
    private String name;
    private LocalDate birthDay;

    public Node(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(name, node.name) && Objects.equals(birthDay, node.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDay);
    }

    @Override
    public String toString() {
        return "Node: " +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay;
    }
}
