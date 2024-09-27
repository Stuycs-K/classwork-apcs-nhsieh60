public class MyArrays{
  public static String arrayToString(int[] nums){
    String arrayS = "[";
    for(int i = 0; i < nums.length-1; i++){
      arrayS += nums[i] + ", ";
    }
    if(nums.length > 0){
      arrayS += nums[nums.length-1];
    }
    return arrayS + "]";
  }
  public static int[] returnCopy(int[] ary){
    int[] ary2 = new int[ary.length];
    for(int i = 0; i < ary.length; i++){
      ary2[i] = ary[i];
    }
    return ary2;
  }
  public static void main(){
    int[] ary = {1, 2, 3};
    System.out.println("Original:" + arrayToString(ary) + " Copy: " + arrayToString(returnCopy(ary))
      + "Equals? " + arrayToString(ary).equals(arrayToString(returnCopy(ary))));
    System.out.println("Original array address = Copy array address?" + returnCopy(ary) == ary);
    int[] ary2 = {};
    System.out.println("Original:" + arrayToString(ary2) + " Copy: " + arrayToString(returnCopy(ary2))
      + "Equals? " + arrayToString(ary2).equals(arrayToString(returnCopy(ary2))));
    System.out.println("Original array address = Copy array address?" + returnCopy(ary2) == ary2);
  }
}
