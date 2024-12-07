public class StuyStudent extends Adventurer{
  private int caffeine;
  private int caffeineMax;

  public StuyStudent(String name){
    super(name, 10);
    caffeine = 100;
    caffeineMax = 100;
  }

  public StuyStudent(String name, int hp, int mg){
    super(name, hp);
    caffeine = mg;
    caffeineMax = mg;
  }

  public String getSpecialName(){
    return "caffeine";
  }

  public int getSpecial(){
    return caffeine;
  }

  public void setSpecial(int n){
    this.caffeine = n;
  }

  public int getSpecialMax(){
    return caffeineMax;
  }

  public String attack(Adventurer other){
    other.applyDamage(10);
    return this.getName()+" just distracted " + other.getName()+" from studying for their APCS exam!\n-10hp from " + other.getName();
  }

  public String support(Adventurer other){
    other.setHP(other.getHP() + 7);
    return this.getName()+" just tutored an ally!\n+7hp for " + other.getName();
  }

  public String support(){
    this.setHP(this.getHP() + 10);
    return "*intense studying noises*\n" + this.getName() + " healed themselves for +10hp!";
  }

  public String specialAttack(Adventurer other){
    other.applyDamage(30);
    this.setSpecial(this.getSpecial() - 60);
    return this.getName() + " just chugged a celcius/coffee/monster energy and ran circles around " + other.getName() + " while singing baby shark off-key.\n-30hp from "+ other.getName() + "!";
  }

}
