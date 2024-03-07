package hw2.impl.newclasses;

import hw2.inteefacesandabstracts.Human;
import lombok.Data;

@Data
public class Bum extends Human {
    private String name;
    private String surName;

    public Bum(final String name, final String surName) {
        super(name, surName);
        this.surName = surName;
        this.name = name;
    }

    public int getRunSpeed() {
        return 1;
    }

    public void someSpeak() {
        System.out.println("I'm bum");
    }

    public double getSwimSpeed() {
        return 0.75;
    }

    @Override
    public void somethingSpeak() {

    }
}
