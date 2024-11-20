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

    public static String bathroomCode(filename){
        try{
            File file = new File("brCodeDirs.txt");
            Scanner input = new Scanner(file);
            int[][] keypad = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            String code = "";

            while(input.hasNextLine()){
                int num;
                int row = 1;
                int column = 1;

                //up = row - 1
                //down = row + 1
                //left = column - 1
                //right = column + 1
              //String longg = input.nextLine();
                System.out.println(longg);
                code += num; 
            }
      
            input.close();
            return code;
          }catch(FileNotFoundException e){
            System.out.println("File not found");
          }
    }

    public static void main (String[] args){
        parse();
    }
}