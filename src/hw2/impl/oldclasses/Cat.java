package hw2.impl.oldclasses;

import hw2.inteefacesandabstracts.Animal;
import hw2.inteefacesandabstracts.Illable;
import hw2.inteefacesandabstracts.Speakable;

public class Cat extends Animal implements Illable, Speakable {
   public Cat(String name, String color) {
      super(name, color, 0);
   }

   public Cat(String name) {
      super(name);
   }

   public void eat() {
      System.out.println("Cat is eating");
   }

   public void getIll() {
      System.out.println("I'm illing...");
   }

   public void someSpeak() {
      System.out.println("I can meow - meow");
   }

   public void somethingSpeak() {
   }
}
