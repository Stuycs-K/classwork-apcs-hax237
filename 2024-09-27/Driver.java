public class Driver{
  public static void main(String[] args){
    int [] arr1 = new int[] {1, 2, 2, 4, 1};
    int [] arr2 = new int[] {2, 4, 8, 16};

    //arrayToString tests
    System.out.println("Expected: [1, 2, 2, 4, 1] Actual: " + MyArrays.arrayToString(arr1));
    arr1 = new int[] {};
    System.out.println("Expected: [] Actual: " + MyArrays.arrayToString(arr1));
    arr1 = new int[] {0, 3, 10, 100};
    System.out.println("Expected: [0, 0, 10, 100] Actual: " + MyArrays.arrayToString(arr1));
    arr1 = new int[] {0};
    System.out.println("Expected: [0] Actual: " + MyArrays.arrayToString(arr1));


    //returnCopy tests
    arr1 = new int[] {1, 2, 3, 4, 5, 6, 7};
    System.out.println("Same Address (expect false): " + (arr1 == MyArrays.returnCopy(arr1)));

    arr1 = new int[] {7, 7, 7, 7, 7, 7, 4};
    System.out.println("Same Address (expect false): " + (arr1 == MyArrays.returnCopy(arr1)));

    arr1 = new int[] {2, 9, 7, 8, 5, 1};
    System.out.println("Same Address (expect false): " + (arr1 == MyArrays.returnCopy(arr1)));

    arr1 = new int[] {};
    System.out.println("Same Address (expect false): " + (arr1 == MyArrays.returnCopy(arr1)));

    arr1 = new int[] {0};
    System.out.println("Same Address (expect false): " + (arr1 == MyArrays.returnCopy(arr1)));


    //concatArray tests
    arr1 = new int[] {72, 5, 193, 6, 81, 9};
    System.out.println("Expected: " + (MyArrays.arrayToString(arr1).substring(0, MyArrays.arrayToString(arr1).length() - 1)) + ", " + (MyArrays.arrayToString(arr2).substring(1)));
    System.out.println("Actual: " + MyArrays.arrayToString(MyArrays.concatArray(arr1, arr2)));

    arr1 = new int[] {};
    arr2 = new int[] {0};
    System.out.println("Expected: " + (MyArrays.arrayToString(arr1).substring(0, MyArrays.arrayToString(arr1).length() - 1)) + (MyArrays.arrayToString(arr2).substring(1)));
    System.out.println("Actual: " + MyArrays.arrayToString(MyArrays.concatArray(arr1, arr2)));

    arr1 = new int[] {1, 2};
    arr2 = new int[] {3};
    System.out.println("Expected: " + (MyArrays.arrayToString(arr1).substring(0, MyArrays.arrayToString(arr1).length() - 1)) + ", " + (MyArrays.arrayToString(arr2).substring(1)));
    System.out.println("Actual: " + MyArrays.arrayToString(MyArrays.concatArray(arr1, arr2)));

    arr1 = new int[] {};
    arr2 = new int[] {};
    System.out.println("Expected: " + (MyArrays.arrayToString(arr1).substring(0, MyArrays.arrayToString(arr1).length() - 1)) + (MyArrays.arrayToString(arr2).substring(1)));
    System.out.println("Actual: " + MyArrays.arrayToString(MyArrays.concatArray(arr1, arr2)));
    arr1 = new int[] {21982, 21, 4397, 2384, 29, 324};
    arr2 = new int[] {1, 2, 35, 6, 7, 3, 1, 28};
    System.out.println("Expected: " + (MyArrays.arrayToString(arr1).substring(0, MyArrays.arrayToString(arr1).length() - 1)) + ", " + (MyArrays.arrayToString(arr2).substring(1)));
    System.out.println("Actual: " + MyArrays.arrayToString(MyArrays.concatArray(arr1, arr2)));

    arr1 = new int[] {5, 9, 13};
    arr2 = new int[] {19, 24, 29};
    System.out.println("Expected: " + (MyArrays.arrayToString(arr1).substring(0, MyArrays.arrayToString(arr1).length() - 1)) + ", " + (MyArrays.arrayToString(arr2).substring(1)));
    System.out.println("Actual: " + MyArrays.arrayToString(MyArrays.concatArray(arr1, arr2)));
    }
}
