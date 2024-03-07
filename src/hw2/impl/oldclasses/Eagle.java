package hw2.impl.oldclasses;

import hw2.inteefacesandabstracts.Animal;
import hw2.inteefacesandabstracts.Flyable;
import hw2.inteefacesandabstracts.Illable;

public class Eagle extends Animal implements Illable, Flyable {
   public Eagle(String name) {
      super(name);
   }

   public int getFlySpeed() {
      return 120;
   }

   public void getIll() {
   }
}
