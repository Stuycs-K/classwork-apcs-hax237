public class StuyStudent extends Adventurer{
  private int caffeine;
  private int caffeineMax;

  public StuyStudent(String name){
    super(name, hp);
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
    //check if exceeds getSpecialMax????
    this.caffeine = n;
    this.caffeineMax = n;
  }

  public int getSpecialMax(){
    return caffeineMax;
  }

  public String attack(Adventurer other){
    int dmgDone = other.applyDamage(21*Math.random());
    return "*intense studying noises*\n-" + dmgDone + " hp from " + other.getName();
  }

  public String support(Adventurer other){
    int healed = other.setHP(other.getHP() + 16*Math.random());
    return "You just tutored an ally! " + "+" + healed + "hp for " + other.getName();
  }

  public String support(){
    int healed = other.setHP(other.getHP() + 16*Math.random());
  }

}
