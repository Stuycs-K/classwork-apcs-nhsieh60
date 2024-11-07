/* The difference is that after overriding, when speak is called, it prints out "My name is The Mighty Parrot" instead of just
"My name is Parrot" as speak is calling and using what the overriden getName() returned*/
public class Driver{
  public static void main(String[] args){
    Animal water = new Animal("splash", 12, "Water");
    water.speak();

    Bird parrot = new Bird("squawk", 12, "Parrot", 1.5, "red");
    parrot.speak();
  }
}
