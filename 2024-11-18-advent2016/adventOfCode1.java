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
      int[][] coord = new int[][] {
        {-1, 0},
        {1, 0},
        {0, 1},
        {0, -1}
      };
      int[] loc = coord[2];
      System.out.println(Arrays.toString(loc));
      
      int x = 0, y = 0;

      while(input.hasNext()){
        String[] text = input.next().split(",");
        System.out.println(Arrays.toString(text));
        String dir = text[0].substring(0, 1);
        int blocks = Integer.valueOf(text[0].substring(1));

        if((loc.equals(coord[1]) && dir.equals("R")) || (loc.equals(coord[0]) && dir.equals("L"))){
          y -= blocks;
          loc = coord[3];
          System.out.println("y: "+y);
        }
        else if((loc.equals(coord[1]) && dir.equals("L")) || (loc.equals(coord[0]) && dir.equals("R"))){
          y += blocks;
          loc = coord[2];
          System.out.println("y: "+y);
        }
        else if((loc.equals(coord[3]) && dir.equals("L")) || (loc.equals(coord[2]) && dir.equals("R"))){
          x += blocks;
          loc = coord[1];
          System.out.println("x: "+x);
        }
        else if((loc.equals(coord[2]) && dir.equals("L")) || (loc.equals(coord[3]) && dir.equals("R"))){
          x -= blocks;
          loc = coord[0];
          System.out.println("x: "+x);
        }

      }
      input.close();
      System.out.println(x);
      System.out.println(y);
      return Math.abs(x) + Math.abs(y);

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
