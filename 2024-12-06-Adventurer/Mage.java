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

  public String attack(Adventurer other){
    other.applyDamage(mana);
    this.setSpecial(this.mana-1);
    return "Cast attack spell on enemy! It did " + mana + "damage!";
  }

  public String support(Adventurer other){
    if(this.HP + this.mana < this.maxHP){
      other.setHP(other.getHP+this.mana);
      this.setSpecial(this.mana-1);
      return "Cast recover on ally! It healed " + mana + "health!";
    }
    else{
      other.setHP(other.getmaxHP);
      this.setSpecial(this.mana-1);
      return "Cast heal on ally! It healed " + mana + "health!";
    }
  }

  public String support(){
    if(this.HP + this.mana < this.maxHP){
      super.setHP(this.HP+this.mana);
      this.setSpecial(this.mana-1);
      return "Cast heal on self! It healed " + mana + "health!";
    }
    else{
      super.setHP(this.maxHP);
      this.setSpecial(this.mana-1);
      return "Cast heal on self! It healed " + mana + "health!";
    }


  }

}
