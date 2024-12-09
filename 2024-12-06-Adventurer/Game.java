import java.util.Scanner;

public class Game{
  public static String currentStats(Adventurer input){
		String stats = input.getName() +", ";
		stats += "HP: " + input.getHP() + "/" + input.getmaxHP() + ", ";
		stats += input.getSpecialName() + ": " + input.getSpecial() + "/" + input.getSpecialMax();
		return stats;
	}

  public static String action(String input){
    if(input.equals("attack") || input.equals("a")){
      return player.attack(enemy);
    }
    else if(input.equals("special") || input.equals("sp")){
      return player.specialAttack(enemy);
    }
    else if(input.equals("support") || input.equals("su")){
      return player.support();
    }
    else if(input.equals("quit")){
      System.out.println("Goodbye!");
      System.exit(1);
      return "";
    }
    else{
      return "invalid";
    }
  }
  public static void main(String args[]){
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter username: ");
    String userName = userInput.nextLine();
    Adventurer player = new Mage(userName, 50);
    System.out.print("Enter enemy name: ");
    userName = userInput.nextLine();
    Adventurer enemy = new CodeWarrior(userName, 50);

    while(player.getHP() > 0 && enemy.getHP() > 0){
      System.out.println(currentStats(player));
      System.out.println(currentStats(enemy));
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String input = userInput.nextLine();
      while(action(input) == "invalid"){
        System.out.println("Please enter a valid input. Type: (a)ttack / (sp)ecial / (su)pport / quit");
      }
      if(enemy.getHP() > 0){
        int randomAction =
      }
    }
  }
}
