package hw3.lesson3.drugs;

import java.util.Collection;
import java.util.Iterator;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    private Collection<Component> components;
    private int index;

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            public boolean hasNext() {
                return index < components.size();
            }
            public Component next() {
                return components.stream().toList().get(index++);
            }
        };
    }

    public Drug(Collection<Component> component) {
        this.components = component;
        this.index = 0;
    }

    @Override
    public int compareTo(Drug drug) {
        int power = getDrugPower();
        if(power  == drug.getDrugPower()) {
            int numberOfName = getSumNumbersOfUnicode();
            return Integer.compare(numberOfName, drug.getSumNumbersOfUnicode());
        }
        return Integer.compare(power, drug.getDrugPower());
    }

    public int getDrugPower() {
        int power = 0;
        for (Component component: components) {
            power += component.getPower();
        }
        return power;
    }

    public int getSumNumbersOfUnicode() {
        int sumOfCharInInt = 0;
        for(Component name : components) {
            for(int i = 0; i < name.getName().length(); i++) {
                sumOfCharInInt += name.getName().charAt(i);
            }
        }
        return sumOfCharInInt;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s, countOfUnicods : %s}%n", this.getClass().getSimpleName()
                , components, getDrugPower(), getSumNumbersOfUnicode()
        );
    }
}