import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class adventOfCode1{

  public static String[] parse(){
    return null;
  }

  public static int blocksAway(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int i = 0, x = 0, y = 0;

      /*
      while(input.hasNext()){

      }
      System.out.println(xAxis);
      System.out.println(yAxis);

      */
      System.out.println(file);
      return 0;


    }catch(FileNotFoundException e){
      System.out.println("File not found");
      return -100;
    }
  }

  public static void main(String[] args){
    System.out.println(blocksAway("input.txt"));
  }

}
