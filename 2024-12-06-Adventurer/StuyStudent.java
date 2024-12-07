public class StuyStudent extends Adventurer{
  private int caffeine;
  private int caffeineMax;

  public StuyStudent(String name){
    super(name, 10);
  }

  public StuyStudent(String name, int hp){
    super(name, hp);
  }

  public String getSpecialName(){
    return "caffeine";
  }

  public int getSpecial(){
    return caffeine;
  }

  public void setSpecial(int n){
    this.caffeine = n;
    this.caffeineMax = n;
  }

  public int getSpecialMax(){
    return caffeineMax;
  }

  public String attack(Adventurer other){
    other.applyDamage(10);
    return "You've just distracted an adventurer from studying for their APCS exam!\n-10hp from " + other.getName();
  }

  public String support(Adventurer other){
    other.setHP(other.getHP() + 7);
    return "You just tutored an ally!\n+7hp for " + other.getName();
  }

  public String support(){
    this.setHP(this.getHP() + 10);
    return "*intense studying noises*\nYou've just healed for +10hp!";
  }

  public String specialAttack(Adventurer other){
    other.applyDamage(30);
    this.setSpecial(this.getSpecial() - 60);
    return "You just chugged a celcius/coffee/monster energy! You ran circles around your opponent and sang baby shark off-key.\n-30hp from "+ other.getName() + "!";
  }

}
