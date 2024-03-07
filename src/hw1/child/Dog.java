package hw1.child;


import hw1.parent.Animal;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s Wuaf - wuaf!!\n", getType());
    }

    @Override
    public void toFly() {
        System.out.print("Sorry I can't fly only: \n");
        toGo();
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
