public class StuyStudent extends Adventurer{
  private int caffeine;
  private int caffeineMax;
  private String bestSubject;
  

  public StuyStudent(String name, int hp, String sub){
    super(name, hp);
    caffeine = 100;
    caffeineMax = 100;
    bestSubject = sub;
  }

  public StuyStudent(String name, int hp){
    this(name, hp, "CS");
  }
  
  public StuyStudent(String name){
    this(name, 100);
  }

  public StuyStudent(){
    this("Jimmy");
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

  public String getSubject(){
    return bestSubject;
  }

  public String attack(Adventurer other){
    other.applyDamage(10);
    return this+" just distracted " + other +" from studying for their "+ other.getSubject()+" exam!\n-10hp from " + other;
  }

  public String support(Adventurer other){
    other.setHP(other.getHP() + 7);
    return this+" just tutored an ally!\n+7hp for " + other.getName();
  }

  public String support(){
    this.setHP(this.getHP() + 10);
    return "*intense studying noises*\n" + this + " healed themselves for +10hp!";
  }

  public String specialAttack(Adventurer other){
    if (this.getSpecial() > 60){
      other.applyDamage(30);
      this.setSpecial(this.getSpecial() - 60);
      return this + " just chugged a Mr. Beast energy/celcius/coffee/monster energy and ran circles around " + other + " while singing baby shark off-key.\n-30hp from "+ other + "!";
    }
    else{
      return this + " needs another red bull/coffee/celcius/rockstar/5-hour-energy drink!\nNot enough caffeine: " + this.getSpecial() + "mgs left :(";
    }
  }

}
