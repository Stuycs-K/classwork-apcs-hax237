import java.util.Scanner;

public class Driver{
  public static void main(String[] args) {
    Adventurer player = new StuyStudent("Bob");
    Adventurer enemy = new CodeWarrior("Michael");
    //do this once
    Scanner userInput = new Scanner(System.in);
    
    //issues? if not enough special for sp, not given another turn
    //enemy always generating 0 for choice

    while (true){
        int choice = (int) Math.random()*3;
        System.out.println("\nBob, " + player.getHP() +"/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + "mg caffeine");
        System.out.println("Michael, " + enemy.getHP() +"/" + enemy.getmaxHP() + " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + "mg caffeine\n");
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit ");
        String input = userInput.nextLine();
        if (input.equals("a") || input.equals("attack") || input.equals("sp") || input.equals("special") || input.equals("su") || input.equals("support")){
          if (input.equals("a") || input.equals("attack")){
            System.out.println(player.attack(enemy));
          }
          else if (input.equals("sp") || input.equals("special")){
            System.out.println(player.specialAttack(enemy));
          }
          else if (input.equals("su") || input.equals("support")){
            System.out.println(player.support());
          }
          if(enemy.getHP() > 0){
            //int choice = (int) Math.random()*3;
            System.out.println(choice);
            if (choice == 0){
              System.out.println(enemy.attack(player));
            }
            else if (choice == 1){
              System.out.println(enemy.specialAttack(player));
            }
            else if (choice == 2){
              System.out.println(enemy.support());
            }
            if (player.getHP() <= 0){
              System.out.println("\n"+ enemy +" wins");
              userInput.close();
              break;
            }
          }
          else{
            System.out.println("\n!!!Winner winner chicken dinner!!! \nYou've defeated the great "+enemy + " after using your gigabrain. \nTime for some more celebratory coffee!");
            userInput.close();
            break;
          }
        }
        else if (input.equals("quit")){
          userInput.close();
          break;
        }
        else{
          System.out.println("\n****INVALID RESPONSE****. Please try again.");
        }
    }

    /*
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
  */
  }
}
