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
  public static void main(String[] args){
    int[] ary = {1, 2, 3};
    System.out.println("Original: " + arrayToString(ary) + " | Copy: " + arrayToString(returnCopy(ary))
      + " | Equals? " + arrayToString(ary).equals(arrayToString(returnCopy(ary))));
	System.out.println("Addresses: " + ary + ", " + returnCopy(ary) + " | Original array address = Copy array address? " + (returnCopy(ary) == ary));
	
    int[] ary2 = new int[0];
	System.out.println("Original: " + arrayToString(ary2) + " | Copy: " + arrayToString(returnCopy(ary2))
      + " | Equals? " + arrayToString(ary2).equals(arrayToString(returnCopy(ary2))));
	System.out.println("Addresses: " + ary2 + ", " + returnCopy(ary2) + " | Original array address = Copy array address? " + (returnCopy(ary2) == ary2));
	
	int[] ary3 = {0, 1, -2, 3, 4, -2147483648, 2147483647};
	System.out.println("Original: " + arrayToString(ary3) + " | Copy: " + arrayToString(returnCopy(ary3))
      + " | Equals? " + arrayToString(ary3).equals(arrayToString(returnCopy(ary3))));
	System.out.println("Addresses: " + ary3 + ", " + returnCopy(ary3) + " | Original array address = Copy array address? " + (returnCopy(ary3) == ary3));
	
  }
}
