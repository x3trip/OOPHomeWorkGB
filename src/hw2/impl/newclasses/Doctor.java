package hw2.impl.newclasses;

import hw2.inteefacesandabstracts.Human;
import lombok.Data;

@Data
public class Doctor extends Human {
   private String name;
   private String surName;
   private int salary;
   private int amountChildren;

   public Doctor(String name, String surName, int salary, int childs) {
      super(name, surName, salary, childs);
      this.name = name;
      this.surName = surName;
      this.salary = salary;
      this.amountChildren = childs;
   }

   public int getRunSpeed() {
      return 8;
   }

   public void someSpeak() {
      System.out.println("I'm Doctor!");
   }

   public double getSwimSpeed() {
      return 2.5D;
   }

   public void somethingSpeak() {
   }
}
