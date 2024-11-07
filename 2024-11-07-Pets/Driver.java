//Step 8 answer
//calling getName from a bird object uses the overridden method of getName method. 
//However, calling getName from a Animal object uses the original getName method. 

public class Driver{
  public static void main(String[] args){
      Animal a = new Animal("buzz",5,"bee");
      a.speak();
  
      Bird b = new Bird("tweet", 2, "bob", 12.0, "brown");
      b.speak();
      System.out.println(b.getName() + " (should return something with Mighty)");
      System.out.println(a.getName() + " (should NOT return something with Mighty)");

      Animal snake = new Animal("hissss", 7, "Slytherin");
      System.out.println("");
      snake.speak();

      Bird chicken = new Bird("cluck", 4, "Butter", 15.0, "yellow");
      System.out.println("");
      chicken.speak();

      //Driver.java:23: error: incompatible types: Animal cannot be converted to Bird
      /*
      Bird swan = new Animal("a confused quack", 3, "Zeus");
      System.out.println("");
      swan.speak();
      */

      Animal owl = new Bird ("hoot hoot", 5, "Harry", 28.0, "white");
      System.out.println();
      owl.speak();
  }
}