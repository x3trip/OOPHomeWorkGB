package hw1.child;

import hw1.parent.Animal;

public class Duck extends Animal {
    public Duck(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s hr-hr-hr!\n", getType());
    }

    @Override
    public void toSwim() {
        super.toSwim();
    }

    @Override
    public void toFly() {
        System.out.printf("%s: sorry I can't fly only: \n", this.getType());
        toSwim();
    }

    @Override
    public void toGo() {
        super.toGo();
    }
}
