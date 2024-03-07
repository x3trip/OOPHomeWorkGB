package hw1.child;


import hw1.parent.Animal;

public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s speaking: Meow\n", getType());
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nlegs: %s;\n}", getType(), getName(), getColor(), getLegsCount()
        );
    }

    public void wakeUp() {
        System.out.println(getType() + ": cat's wake up");
    }

    public void findFood() {
        String out = String.format("%s: where is my fish???\n", getType());
        System.out.println(out);
    }

    public void eat() {
        System.out.printf("%s: hrm-hrm \n", getType());
    }

    public void toPlay() {
        System.out.printf("%s: kitty-kitty\n", getType());
    }

    public void goToSleep() {
        System.out.printf("%s: time to bed \n", getType());
    }

    @Override
    public void toFly() {
        System.out.printf("%s: Sorry i don't like flying only sometimes \n", this.getType());
        toGo();
    }

    @Override
    public void toGo() {
        super.toGo();
    }

    @Override
    public void toSwim() {
        System.out.println("Cat's don't like water!!!!");
        System.err.println("Sorry ERROR");
        System.exit(400);
    }
}
