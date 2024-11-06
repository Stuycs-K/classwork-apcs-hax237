import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static int countTrianglesA(String filename){
    int count = 0;
    try{
      File file = new File ("filename");
      Scanner lengths = new Scanner(file);

      while(lengths.hasNextLine()){
        while(lengths.hasNextInt()){
          int a = lengths.nextInt();
          int b = lengths.nextInt();
          int c = lengths.nextInt();

          if ((a + b > c) && (a + c > b) && (b + c > a)){
            count++;
          }
        }
      }

      lengths.close();
      return count;
    }catch(FileNotFoundException ex){
      System.out.println("File not found");
      return -1; 
    }
  }

  public static void main(String[] args){
    countTrianglesA("inputTri.txt");    
  }
  
}
