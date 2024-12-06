public class Mage extends Adventurer{

  private int mana, maxMana;
  private String name;
  private int HP, maxHP;

  public Mage(String name){
    super(name);
  }

  public Mage(String name, int hp){
    super(name, hp);
    int mana = 10;
    int maxMana = 10;
  }

  public String getSpecialName(){
    return "mana";
  }

  public int getSpecial(){
    return mana;
  }

  public int getSpecialMax(){
    return maxMana;
  }
  
  public void setSpecial(int n){
    this.mana = n;
  }

}
