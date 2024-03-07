package hw2.impl.newclasses;

import hw2.inteefacesandabstracts.Animal;
import hw2.inteefacesandabstracts.Flyable;
import hw2.inteefacesandabstracts.Swimable;

public class Swam extends Animal implements Flyable, Swimable {
   public Swam(String name) {
      super(name);
   }

   public int getFlySpeed() {
      return 15;
   }

   public double getSwimSpeed() {
      return 3.6D;
   }
}
