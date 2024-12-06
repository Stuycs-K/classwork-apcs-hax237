public class Necromancer extends Adventurer{
  private String specialName;
  private int Souls;
  private int soulsMax;

  public Necromancer(String name){
    super(name, hp);
    this.specialName = "Souls";
    this.Souls = 50;
    this.soulsMax = 100;
  }

  public Necromancer(String name, int hp){
    super(name, hp);
  }

  public String getSpecialName(){
    return specialName;
  }

  public int getSpecial(){
    return special;
  }

  public void setSpecial(int n){
    //check if exceeds getSpecialMax????
    this.Souls = n;
  }

  public int getSpecialMax(){
    return SpecialMax;
  }

  public String attack(Adventurer other){
    int dmgDone = other.applyDamage(21*Math.random());
    return "*skeleton and teeth chattering sounds*\n-" + dmgDone;
  }

}
