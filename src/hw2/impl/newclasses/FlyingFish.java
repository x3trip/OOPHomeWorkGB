package hw2.impl.newclasses;

import hw2.inteefacesandabstracts.Animal;
import hw2.inteefacesandabstracts.Flyable;
import hw2.inteefacesandabstracts.Swimable;

public class FlyingFish extends Animal implements Flyable, Swimable {
   public FlyingFish(String name) {
      super(name);
   }

   public int getFlySpeed() {
      return 15;
   }

   public double getSwimSpeed() {
      return 8.0D;
   }
}
