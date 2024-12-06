public class Driver{
	public static String currentStats(Adventurer input){
		String stats = "Name: " + input.getName(); 
		stats += "HP: " + input.getHP() + "/" + input.getMaxHP() + "\n";
		stats += input.getSpecialName() + ": " + input.getSpecial() + "/" + input.getSpecialMax();
		return stats;
	}
  public static void main(String[] args){
	  Adventurer p1 = new Mage("Delphox", 75);
	  Adventurer p2 = new Mage("Mismagius", 60);
	  Adventurer p3 = new Mage("Gardevoir", 68);
	  System.out.println("Special stat names: " + p1.getSpecialName() + " " + p2.getSpecialName() + " " + p3.getSpecialName());
	  System.out.println("Special stats: " + p1.getSpecial() + " " + p2.getSpecial() + " " + p3.getSpecial());
	  System.out.println("Special stats (max): " + p1.getSpecialMax() + " " + p2.getSpecialMax() + " " + p3.getSpecialMax());
	  System.out.println(p3.getName() + " " + p3.attack(p2));
	  System.out.println(currentStats(p3));
	  System.out.println(currentStats(p2));
	  System.out.println(p1.getName() + " " + p1.support(p3));
	  System.out.println(currentStats(p1));
	  System.out.println(currentStats(p3));
	   System.out.println(p2.getName() + " " + p2.support());
	  System.out.println(currentStats(p2));
	  System.out.println(currentStats(p2));
  }
}
