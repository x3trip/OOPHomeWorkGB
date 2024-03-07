package hw2;

import hw2.impl.oldclasses.*;
import hw2.impl.newclasses.*;
import hw2.inteefacesandabstracts.Animal;
import hw2.veterinary.VetClinic;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      VetClinic vetClinic = new VetClinic();
      vetClinic
              .addAnimal(new Cat("Rubik"))
              .addAnimal(new Duck("Ducker"))
              .addAnimal(new Eagle("Letuchka"))
              .addAnimal(new Doctor("Mihail Vladimirovich", "Romanv", 50000, 2))
              .addAnimal(new Bum("Sergey", "Prohorov"))
              .addAnimal(new Swam("Ugly Duck")).
              addAnimal(new FlyingFish("Kudryashka"));

      List<Animal> vetClinicWithSpeak = vetClinic.speakableAnimals();
      System.out.println("Who can speak: " + vetClinicWithSpeak);
      System.out.println();

      List<Animal> vetClinicWithRunnable = vetClinic.runnableAnimals();
      System.out.println("Who can run: " + vetClinicWithRunnable);
      System.out.println();

      List<Animal> vetClinicWithFlyable = vetClinic.flyableAnimals();
      System.out.println("Who can fly: " + vetClinicWithFlyable);
      System.out.println();

      List<Animal> vetClinicWithSwimable = vetClinic.swimableAnimals();
      System.out.println("Who can swim: " + vetClinicWithSwimable);
   }
}
