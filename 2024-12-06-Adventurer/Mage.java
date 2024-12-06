public class Mage extends Adventurer{

  private int mana, maxMana;

  public Mage(String name){
    super(name);
	this.mana = 10;
    this.maxMana = 10;
  }

  public Mage(String name, int hp){
    super(name, hp);
    this.mana = 10;
    this.maxMana = 10;
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
  
  public String support(){
	if(this.mana <= 0){
		return "tried to cast heal on self but failed due to lack of " + this.getSpecialName() + "...";
	}
    if(super.getHP() + this.mana < super.getmaxHP()){
      super.setHP(super.getHP()+this.mana);
      this.setSpecial(this.mana-1);
      return "cast heal on self! It healed " + (mana+1) + " health!";
    }
    else{
		int healed = super.getmaxHP() - super.getHP();
      super.setHP(super.getmaxHP());
      this.setSpecial(this.mana-1);
      return "cast heal on self! It healed " + healed + " health!";
    }

	
  }
  public String specialAttack(Adventurer other){
		if(this.mana > 0){
			other.applyDamage(this.mana);
			this.setSpecial(this.mana-1);
			return "cast attack spell on enemy " + other + "! It did " + (this.mana+1) + " damage!";
		}
		else{
			return "tried to cast attack spell on enemy " + other + " but failed due to lack of " + this.getSpecialName() + "...";
		}
	}

}
