package hw1.child;

import hw1.parent.Animal;

public class Herring extends Animal {
    public Herring(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void hunt() {
        super.hunt();
    }

    @Override
    public void toSwim() {
        super.toSwim();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void toFly() {
        System.out.printf("%s: sorry i cant flying \n", this.getType());
        toSwim();
    }

    @Override
    public void toGo() {
        System.out.printf("%s: sorry i cant walking \n ", this.getType());
        toSwim();
    }
}
