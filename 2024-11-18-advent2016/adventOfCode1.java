import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
      int[] head = coord[2];
      System.out.println(Arrays.toString(head));
      ArrayList<int[]> passed = new ArrayList<>();
      passed.add(new int[]{0, 0});
      int[] loc = passed.get(passed.size() - 1);
      //System.out.println(loc);
      //System.out.println(Arrays.toString(loc[0]));
      
      int x = 0, y = 0;

      while(input.hasNext()){
        String[] text = input.next().split(",");
        System.out.println(Arrays.toString(text));
        String dir = text[0].substring(0, 1);
        int blocks = Integer.valueOf(text[0].substring(1));

        if((head.equals(coord[1]) && dir.equals("R")) || (head.equals(coord[0]) && dir.equals("L"))){
          y -= blocks;
          head = coord[3];
          System.out.println("y: "+y);
          
          for(int i = 1; i <= blocks; i++){
            loc = new int[]{loc[0], loc[1] - 1};
            System.out.println(Arrays.toString(loc));
            if (present(loc, passed) == false){
              passed.add(loc);
            }
            else{
              System.out.println("This is the distance from EASTER Bunny HQ: ");
              return Math.abs(loc[0]) + Math.abs(loc[1]);
            }
          }
          System.out.println(passed);
        }
        else if((head.equals(coord[1]) && dir.equals("L")) || (head.equals(coord[0]) && dir.equals("R"))){
          y += blocks;
          head = coord[2];
          System.out.println("y: "+y);

          for(int i = 1; i <= blocks; i++){
            loc = new int[]{loc[0], loc[1] + 1};
            System.out.println(Arrays.toString(loc));
            if (present(loc, passed) == false){
              passed.add(loc);
            }
            else{
              System.out.println("This is the distance from EASTER Bunny HQ: ");
              return Math.abs(loc[0]) + Math.abs(loc[1]);
            }
          }
          System.out.println(passed);
        }
        else if((head.equals(coord[3]) && dir.equals("L")) || (head.equals(coord[2]) && dir.equals("R"))){
          x += blocks;
          head = coord[1];
          System.out.println("x: "+x);

          for(int i = 1; i <= blocks; i++){
            loc = new int[]{loc[0] + 1, loc[1]};
            System.out.println(Arrays.toString(loc));
            if (present(loc, passed) == false){
              passed.add(loc);
            }
            else{
              System.out.println("This is the distance from EASTER Bunny HQ: ");
              return Math.abs(loc[0]) + Math.abs(loc[1]);
            }
          }
          System.out.println(passed);
        }
        else if((head.equals(coord[2]) && dir.equals("L")) || (head.equals(coord[3]) && dir.equals("R"))){
          x -= blocks;
          head = coord[0];
          System.out.println("x: "+x);

          for(int i = 1; i <= blocks; i++){
            loc = new int[]{loc[0] - 1, loc[1]};
            System.out.println(Arrays.toString(loc));
            if (present(loc, passed) == false){
              passed.add(loc);
            }
            else{
              System.out.println("This is the distance from EASTER Bunny HQ: ");
              return Math.abs(loc[0]) + Math.abs(loc[1]);
            }
          }
          System.out.println(passed);
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

  public static boolean present(int[] num, ArrayList<int[]> nums){
    for (int arr = 0; arr < nums.size(); arr++){
      if((nums.get(arr))[0] == (num[0]) && (nums.get(arr))[1] == (num[1])){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args){
    //System.out.println(blocksAway("input.txt"));
    System.out.println(blocksAway("input.txt"));

  }

}
