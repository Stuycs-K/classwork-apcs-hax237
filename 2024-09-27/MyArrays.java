public class MyArrays{
  public static String arrayToString(int[] nums){
    String ans = "[";
    for (int i = 0; i < nums.length; i++){
      ans = ans + nums[i];
      if (i != nums.length - 1){
        ans += ", ";
      }
    }
    return ans + "]";
  }

  public static int[] returnCopy(int[] ary){
    int[] newArr = new int[ary.length];
    for (int i =0; i < ary.length; i++){
      newArr[i] = ary[i];
    }
    //check if same array
    return newArr;
  }
}
