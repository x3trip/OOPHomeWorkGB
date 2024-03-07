package hw2.impl.oldclasses;

import hw2.inteefacesandabstracts.Animal;
import hw2.inteefacesandabstracts.Flyable;

public class Duck extends Animal implements Flyable {
   public Duck(String name) {
      super(name);
   }

   public int getFlySpeed() {
      return 0;
   }
}
