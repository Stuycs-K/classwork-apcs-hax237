import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class adventOfCode1{

  
  public static void parse(){
    try{
      File file = new File("input.txt");
      Scanner input = new Scanner(file);

      while(input.hasNextLine()){
        String longg = input.nextLine();
        System.out.println(longg);
      }

      input.close();
    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }
  }
    

  public static int blocksAway(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int i = 0, x = 0, y = 0;

      while(input.hasNextLine()){
        String[] text = input.nextLine().split(",");
        System.out.println(Arrays.toString(text));
        String dir = text[i];
        System.out.println(dir);
        int blocks = Integer.valueOf(dir.substring(1));
        if (i % 2 == 0 && dir.equals("R")){
          System.out.println("This adds " + blocks + " to x");
          x += blocks;
        }
        if (i % 2 == 0 && dir.equals("L")){
          System.out.println("This subtracts " + blocks + " from x");
          x -= blocks;
        }
        if (i % 2 == 1 && dir.equals("R")){
          System.out.println("This subtracts " + blocks + " from y");
          y -= blocks;
        }
        if (i % 2 == 1 && dir.equals("L")){
          System.out.println("This adds " + blocks + " to y");
          y += blocks;
        }
        i++;
      }
      
      input.close();
      System.out.println(file);
      return x + y;

    }catch(FileNotFoundException e){
      System.out.println("File not found");
      return -100;
    }
  }

  public static void main(String[] args){
    //System.out.println(blocksAway("input.txt"));
    System.out.println(blocksAway("input.txt"));

  }

}
