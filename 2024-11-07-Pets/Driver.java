public class Driver{
  public static void main(String[] args){
    Animal water = new Animal("splash", 12, "Water");
    water.speak();

    Bird parrot = new Bird("squawk", 12, "Parrot", 1.5, "red");
    parrot.speak();
  }
}
