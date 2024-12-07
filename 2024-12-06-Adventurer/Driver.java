public class Driver{
  public static void main(String[] args) {
    Adventurer Michael = new StuyStudent("Michael", 100, 100);
    Adventurer Chester = new StuyStudent("Chester", 100,100);
    Adventurer Cassy = new StuyStudent("Cassy", 100,100);

    System.out.println("\n--------Should All Be Caffeine--------\n");
    System.out.println(Michael.getSpecialName());
    System.out.println(Chester.getSpecialName());
    System.out.println(Cassy.getSpecialName());

    System.out.print("\n-------------Names--------------\n");
    System.out.println(Michael.getName()+ " has " + Michael.getSpecial() + "mgs of caffeine available along with " + Michael.getHP() + "hp.");
    System.out.println(Chester.getName() + " has " + Chester.getSpecial() + "mgs of caffeine available along with " + Chester.getHP() + "hp.");
    System.out.println(Cassy.getName() + " has " + Cassy.getSpecial() + "mgs of caffeine available along with " + Cassy.getHP() + "hp.");

    System.out.print("\n-------------FIGHT!--------------\n");
    System.out.println(Michael.attack(Cassy));
    System.out.println("Cassy now has "+Cassy.getHP() + "hp");
    System.out.println(Cassy.specialAttack(Michael));
    System.out.println("Michael now has "+Michael.getHP() + "hp");
    System.out.println("Cassy now has "+Cassy.getSpecial() + "mgs of caffeine left");
    System.out.println(Michael.specialAttack(Cassy));
    System.out.println("Cassy now has "+Cassy.getHP() + "hp");
    System.out.println(Chester.support(Cassy));
    System.out.println("Cassy now has "+Cassy.getHP() + "hp");
    System.out.println(Michael.support());
    System.out.println(Chester.attack(Michael));
    System.out.println("Michael now has "+Michael.getHP() + "hp");
    System.out.println(Cassy.restoreSpecial(90));
    System.out.println("Cassy now has "+Cassy.getSpecial() + "mgs of caffeine.");
    System.out.println(Michael.support());
    System.out.println(Michael.support());
  }
}
