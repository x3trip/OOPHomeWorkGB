package hw2.veterinary;

import hw2.inteefacesandabstracts.Animal;
import hw2.inteefacesandabstracts.Flyable;
import hw2.inteefacesandabstracts.Runnable;
import hw2.inteefacesandabstracts.Speakable;
import hw2.inteefacesandabstracts.Swimable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VetClinic {
   private final List<Animal> animalList = new ArrayList();

   public List<Animal> getList() {
      return this.animalList;
   }

   public VetClinic addAnimal(Animal animal) {
      this.animalList.add(animal);
      return this;
   }

   public List<Animal> speakableAnimals() {
      return this.animalList.stream().filter((s) -> {
         return s instanceof Speakable;
      }).collect(Collectors.toList());
   }

   public List<Animal> swimableAnimals() {
      return this.animalList.stream().filter((s) -> {
         return s instanceof Swimable;
      }).collect(Collectors.toList());
   }

   public List<Animal> runnableAnimals() {
      return this.animalList.stream().filter((s) -> {
         return s instanceof Runnable;
      }).collect(Collectors.toList());
   }

   public List<Animal> flyableAnimals() {
      return this.animalList.stream().filter((s) -> {
         return s instanceof Flyable;
      }).collect(Collectors.toList());
   }
}
