package hw2.inteefacesandabstracts;

import lombok.Data;

@Data
public abstract class Human extends Animal implements Swimable, Speakable, Illable, Runnable {
   private String name;
   private String surName;
   private int salary;
   private int children;

   public Human() {
   }

   public Human(String name, String surName) {
   }

   public Human(String name, String surName, int salary, int children) {
      this.name = name;
      this.surName = surName;
      this.salary = salary;
      this.children = children;
   }
}
