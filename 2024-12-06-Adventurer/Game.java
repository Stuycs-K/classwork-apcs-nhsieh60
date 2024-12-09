import java.util.Scanner;

public class Game{
  public static String currentStats(Adventurer input){
		String stats = input.getName() +", ";
		stats += "HP: " + input.getHP() + "/" + input.getmaxHP() + ", ";
		stats += input.getSpecialName() + ": " + input.getSpecial() + "/" + input.getSpecialMax();
		return stats;
	}

  public static void main(String args[]){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    Adventurer player = new Mage(userName, 50);
    System.out.println("Enter enemy name");
    userName = userInput.nextLine();
    Adventurer enemy = new Mage(userName, 50);

    
  }
}
