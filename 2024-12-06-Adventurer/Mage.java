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
    return "Mana";
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

  public String attack(Adventurer other){
	int damage = (int)(Math.random()*6);
    other.applyDamage(damage);
    return "punched enemy " +  other + "! It did " + damage + " damage!";
  }

  public String support(Adventurer other){
	  other.restoreSpecial(1);
      return "cast recover on ally " + other + "! It recovered 1 special stat!";
    }
  }
  
  public String support(){
    if(this.HP + this.mana < this.maxHP){
      super.setHP(this.HP+this.mana);
      this.setSpecial(this.mana-1);
      return "cast heal on self! It healed " + mana+1 + " health!";
    }
    else{
      super.setHP(this.maxHP);
      this.setSpecial(this.mana-1);
      return "cast heal on self! It healed " + mana+1 + " health!";
    }

	public String specialAttack(Adventurer other){
		other.applyDamage(this.mana);
		this.setSpecial(this.mana-1);
		return "cast attack spell on + " + other + "! It did " + this.mana+1 + " damage!";
	}
  }

}
