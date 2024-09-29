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
    for (int i = 0; i < ary.length; i++){
      newArr[i] = ary[i];
    }
    return newArr;
  }

  public static int[] concatArray(int[]ary1, int[]ary2){
    int[] combinedArr = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length + ary2.length; i++){
      if (i < ary1.length){
        combinedArr[i] = ary1[i];
      }
      if (i >= ary1.length){
        combinedArr[i] = ary2[i - ary1.length];
      }
    }
    return combinedArr;
  }
}
