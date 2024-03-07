package hw1.parent;

public class Animal {
    private String name;
    private final String color;
    private int legsCount;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        this.legsCount = 4;
    }

    public Animal(String color, int legsCount) {
        this(null, color);
        this.legsCount = legsCount;
    }

    public Animal() {
        this(null, null);
    }


    public void wakeUp() {
        System.out.println(getType() + ": new day!!!");
    }

    public void findFood() {
        String out = String.format("%s: nice noise...\n", getType());
        System.out.println(out);
    }

    public void eat() {
        System.out.printf("%s: eating...\n", getType());
    }

    public void toPlay() {
        System.out.printf("%s: playing\n", getType());
    }

    public void goToSleep() {
        System.out.printf("%s: wonderful dream...\n", getType());
    }

    public void speak() {
        System.out.printf("%s: ...\n", getType());
    }

    public void hunt() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void toFly() {
        System.out.printf("%s is flying!!!\n", this.getType());
    }

    public void toGo() {
        System.out.printf("%s is walking \n", this.getType());
    }

    public void toSwim() {
        System.out.printf("%s is swimming \n", this.getType());
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
