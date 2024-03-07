package hw2.inteefacesandabstracts;

public abstract class Animal {
   private String name;
   private String color;
   private int pawsCount;
   private static int animalsCount = 0;

   public Animal(String name, String color, int pawsCount) {
      this.name = name;
      this.color = color;
      this.pawsCount = pawsCount;
      ++animalsCount;
   }

   public Animal(String name) {
      this(name, (String)null, 0);
   }

   public Animal() {
      this((String)null);
   }

   public String toString() {
      return String.format("Животное %s, Имя: %s, Цвет: %s", this.getType(), this.name, this.color);
   }

   public String getType() {
      return this.getClass().getSimpleName();
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getColor() {
      return this.color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getPawsCount() {
      return this.pawsCount;
   }

   public void setPawsCount(int pawsCount) {
      this.pawsCount = pawsCount;
   }

   public static int getAnimalsCount() {
      return animalsCount;
   }
}
