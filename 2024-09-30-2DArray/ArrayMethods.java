//1. Write both your names + emails at the top of the document as a comment.
//Han Xiao, hanx3@nycstudents.net + Jerry Wang jerryw28@nycstudents.net
//2. Copy your arrToString method from before.

/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
public class ArrayMethods{
  public static void main(String[] args) {
    int[] arr1D = new int[] {3,6,9,10};
    System.out.println(arrToString(arr1D));
    //ragged array
    int[][] arr2D = new int[][] {{3,5,6,7},{3,3,2},{5,4},{4}};  
    System.out.println(arrToString(arr2D));
    System.out.println(arr2DSum(arr2D));

    //rectangular array
    arr2D = new int[][]{{1,2,3},{4,5,6}};
    System.out.println(arrToString(swapRC(arr2D))); // should return {{1,4},{2,5},{3,6}}
    System.out.println(arrToString(arr2D));
    System.out.println(arr2DSum(arr2D));
    
    //square array
    arr2D = new int[][] {{3,5,6,7},{3,3,2,9},{5,2,1,4},{4, 10, 4, 7}};
    System.out.println(arrToString(swapRC(arr2D)));
    System.out.println(arrToString(arr2D));
    System.out.println(arr2DSum(arr2D));

    //empty array
    arr2D = new int[][] {{}, {}};
    //System.out.println(arrToString(swapRC(arr2D)));
    System.out.println(arrToString(arr2D));
    System.out.println(arr2DSum(arr2D));

  }

  public static String arrToString(int[] nums){
    String ans = "[";
    for (int i = 0; i < nums.length; i++){
      ans = ans + nums[i];
      if (i != nums.length - 1){
        ans += ", ";
      }
    }
    return ans + "]";
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
    public static String arrToString(int[][]ary){
      //this should use arrToString(int[])
      String newArray = "[";
      for (int i = 0; i < ary.length; i++){
        newArray += arrToString(ary[i]);
        if (i < ary.length - 1){
          newArray += ", ";
        }
      }
      return newArray + "]";
    }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    int sum = 0;
    for (int i = 0 ; i < nums.length; i++){
      for (int x = 0; x < nums[i].length; x++){
        sum += nums[i][x];
      }
    }
    return sum;//place holder return value so it compiles.
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
    public static int[][] swapRC(int[][]nums){
      int[][] arr = new int[nums[0].length][nums.length];
      for (int i = 0; i < nums.length; i++){
        for (int x = 0; x < nums[0].length; x++){
          arr[x][i] = nums[i][x];
        }
      }
      return arr;
    }
}
