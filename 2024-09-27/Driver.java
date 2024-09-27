public class Driver{
  public static void main(String[] args){
    int [] arr = new int[] {1, 2, 2, 4, 1};

    System.out.println("Expected: " + arr + "Actual: " + MyArrays.arrayToString(arr));
    
    arr = new int[] {};
    System.out.println("Expected: " + arr + "Actual: " + MyArrays.arrayToString(arr));

  }
}
