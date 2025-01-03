import java.util.Scanner;

public class Game{
  public static String currentStats(Adventurer input){
		String stats = input.getName() +", ";
		stats += "HP: " + input.getHP() + "/" + input.getmaxHP() + ", ";
		stats += input.getSpecialName() + ": " + input.getSpecial() + "/" + input.getSpecialMax();
		return stats;
	}

  public static String action(String input, Adventurer player, Adventurer enemy){
	String happened;
    if(input.equals("attack") || input.equals("a")){
		happened = player.attack(enemy);
    }
    else if(input.equals("special") || input.equals("sp")){
		happened = player.specialAttack(enemy);
    }
    else if(input.equals("support") || input.equals("su")){
		happened = player.support();
    }
    else if(input.equals("quit")){
      System.out.println("Goodbye!");
      System.exit(1);
      return "";
    }
    else{
      return "invalid";
    }
	System.out.println(player.getName() + " " + happened);
	return happened;
  }
  public static void main(String args[]){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username: ");
    String userName = userInput.nextLine();
    Adventurer player = new Mage(userName, 50);
    System.out.println("Enter enemy name: ");
    userName = userInput.nextLine();
    Adventurer enemy = new CodeWarrior(userName, 50);

    while(player.getHP() > 0 && enemy.getHP() > 0){
      System.out.println(currentStats(player));
      System.out.println(currentStats(enemy));
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String input = userInput.nextLine();
      while(action(input, player, enemy).equals("invalid")){
        System.out.println("Please enter a valid input. Type: (a)ttack / (sp)ecial / (su)pport / quit");
		input = userInput.nextLine();
      }
      if(enemy.getHP() > 0){
        int randomAction = (int)(Math.random() * 3);
		if(randomAction == 0){
			System.out.println(enemy.attack(player));
		}	
		else if(randomAction == 1){
			System.out.println(enemy.specialAttack(player));
		}
		else{
			System.out.println(enemy.support());
		}
      }
    }
	if(player.getHP() <= 0){
		System.out.println(enemy.getName() + " WON");
	}
	else{
		System.out.println(player.getName() + " WON");
	}
	//System.out.println("Goodbye!");
  }
}
