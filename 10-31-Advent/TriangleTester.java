import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TriangleTester{
  public static int countTrianglesA(String filename){
    int count = 0;
    try{
      File file = new File (filename);
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

  public static int countTrianglesB(String filename){
    int count = 0;
    try {
      File file = new File(filename);
      Scanner lengths = new Scanner(file);

      ArrayList<Integer> col1 = new ArrayList<>();
      ArrayList<Integer> col2 = new ArrayList<>();
      ArrayList<Integer> col3 = new ArrayList<>();

      // Only one while loop needed to read each set of three values into respective columns
      while (lengths.hasNextInt()) {
        col1.add(lengths.nextInt());
        col2.add(lengths.nextInt());
        col3.add(lengths.nextInt());
      }

      // Check triangles in column 1
      for (int i = 0; i < col1.size() - 2; i += 3) {
        int a = col1.get(i);
        int b = col1.get(i + 1);
        int c = col1.get(i + 2);
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
          count++;
        }
      }

      // Check triangles in column 2
      for (int i = 0; i < col2.size() - 2; i += 3) {
        int a = col2.get(i);
        int b = col2.get(i + 1);
        int c = col2.get(i + 2);
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
          count++;
        }
      }

      // Check triangles in column 3
      for (int i = 0; i < col3.size() - 2; i += 3) {
        int a = col3.get(i);
        int b = col3.get(i + 1);
        int c = col3.get(i + 2);
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
          count++;
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
    //System.out.println(countTrianglesA("inputTri.txt"));  
    System.out.println(countTrianglesB("inputTri.txt"));      
  }
  
}
