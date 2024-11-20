import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class adventOfCode2{
  public static void parse(){
    try{
      File file = new File("brCodeDirs.txt");
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

  public static String bathroomCode(String filename){
    try{
      File file = new File("brCodeDirs.txt");
      Scanner input = new Scanner(file);
      int[][] keypad = new int[][] {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };

      String code = "";
      int row = 1;
      int column = 1;
      int num = keypad[row][column];

      while(input.hasNextLine()){
        //each line
        String line = input.nextLine();
        System.out.println(line);
        System.out.println("number from last line " + num);
        System.out.println("row: "+ row);
        System.out.println("column " + column);

        //each letter in the line
        for(int i = 0; i < line.length(); i++){
          String dir = line.substring(i, i+1);
          System.out.println(dir);
          try{
            if (dir.equals("U")){
              num = keypad[row - 1][column];
               row -=1;
            }
            if(dir.equals("L")){
              num = keypad[row][column - 1];
              column -= 1;
            }
            if(dir.equals("R")){
              num = keypad[row][column + 1];
              column += 1;
            }
            if(dir.equals("D")){
              num = keypad[row + 1][column];
              row += 1;
            }
            System.out.println(num);
          }catch(IndexOutOfBoundsException e){
            System.out.println(num);
          }
        }
        code += num;
        System.out.println(code);
      }

      input.close();
      return code;
      }catch(FileNotFoundException e){
        System.out.println("File not found");
        return null;
      }
  }

    public static void main (String[] args){
        //parse();
        bathroomCode("brCodeDirs.txt");
    }
}
