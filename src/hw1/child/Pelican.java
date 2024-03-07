package hw1.child;

import hw1.parent.Animal;

public class Pelican extends Animal {
    public Pelican(String name, String color) {
        super(name, color);
    }

    @Override
    public void findFood() {
        super.findFood();
    }

    @Override
    public void speak() {
        super.speak();
    }

    @Override
    public void hunt() {
        super.hunt();
    }

    @Override
    public void toFly() {
        super.toFly();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void toGo() {
        super.toGo();
    }

    @Override
    public void toSwim() {
        super.toSwim();
    }
}
