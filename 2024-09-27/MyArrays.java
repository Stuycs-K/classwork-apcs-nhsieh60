public class MyArrays{
  public static String arrayToString(int[] nums){
    String arrayS = "[";
    for(int i = 0; i < nums.length-1; i++){
      arrayS += nums[i] + ", ";
    }
    if(nums.length() > 0){
      arrayS += nums[nums.length()-1];
    }
    return arrayS + "]";
  }
}
