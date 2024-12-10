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
    this(name, 20);
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
    other.applyDamage(1);
    return this+" just distracted " + other +" from studying for their APCS exam!\n-1hp from " + other;
  }

  public String support(Adventurer other){
    other.setHP(other.getHP() + 2);
    other.setSpecial(other.getSpecial() + 5);
    return this+" just tutored an ally and offered "+ other + " a sip of coffee!\n+2hp and +5mg caffeine for " + other;
  }

  public String support(){
    this.setHP(this.getHP() + 3);
    this.setSpecial(this.getSpecial()+9);
    return "*intense studying and chugging noises*\n" + this + " healed themselves for +3hp and regained 9mg caffeine!";
  }

  public String specialAttack(Adventurer other){
    if (this.getSpecial() > 60){
      other.applyDamage(10);
      this.setSpecial(this.getSpecial() - 60);
      return this + " just chugged a Mr. Beast energy/celcius/coffee/monster energy and ran circles around " + other + " while singing baby shark off-key.\n-10hp from "+ other + "!";
    }
    else{
      return this + " needs another red bull/coffee/celcius/rockstar/5-hour-energy drink!\nNot enough caffeine: " + this.getSpecial() + "mgs left :(";
    }
  }

}
