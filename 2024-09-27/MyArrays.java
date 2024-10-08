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
  public static int[] concatArray(int[] ary1, int[] ary2){
	  int[] added = new int[ary1.length + ary2.length];
	  for(int i = 0; i < ary1.length; i++){
		  added[i] = ary1[i];
	  }
	  int counter = 0;
	  for(int i = ary1.length; i < ary2.length + ary1.length; i++){
		  added[i] = ary2[counter];
		  counter++;
	  }
	  return added;
  }
  public static void main(String[] args){
    int[] ary = new int[]{1, 2, 3};
    System.out.println("Original: " + arrayToString(ary) + " | Copy: " + arrayToString(returnCopy(ary))
      + " | Equals? " + arrayToString(ary).equals(arrayToString(returnCopy(ary))));
	System.out.println("Addresses: " + ary + ", " + returnCopy(ary) + " | Original array address = Copy array address? " + (returnCopy(ary) == ary));
	
    int[] ary2 = new int[0];
	System.out.println("Original: " + arrayToString(ary2) + " | Copy: " + arrayToString(returnCopy(ary2))
      + " | Equals? " + arrayToString(ary2).equals(arrayToString(returnCopy(ary2))));
	System.out.println("Addresses: " + ary2 + ", " + returnCopy(ary2) + " | Original array address = Copy array address? " + (returnCopy(ary2) == ary2));
	
	int[] ary3 = new int[]{0, 1, -2, 3, 4, -2147483648, 2147483647};
	System.out.println("Original: " + arrayToString(ary3) + " | Copy: " + arrayToString(returnCopy(ary3))
      + " | Equals? " + arrayToString(ary3).equals(arrayToString(returnCopy(ary3))));
	System.out.println("Addresses: " + ary3 + ", " + returnCopy(ary3) + " | Original array address = Copy array address? " + (returnCopy(ary3) == ary3));
	
	System.out.println("Array 1: " + arrayToString(ary) + " | Array 2: " + arrayToString(ary3) + "\nAdded Together: " + arrayToString(concatArray(ary, ary3)));
	
	System.out.println("Array 1: " + arrayToString(ary2) + " | Array 2: " + arrayToString(ary3) + "\nAdded Together: " + arrayToString(concatArray(ary2, ary3)));
	
	ary3 = new int[]{-9, -8, 31829231, 90, 0};
	ary = new int[]{9, 4, 3, 2, 1, 0, 9, 9, 9};
	System.out.println("Array 1: " + arrayToString(ary3) + " | Array 2: " + arrayToString(ary) + "\nAdded Together: " + arrayToString(concatArray(ary3, ary)));
	
	ary = new int[]{};
	System.out.println("Array 1: " + arrayToString(ary2) + " | Array 2: " + arrayToString(ary) + "\nAdded Together: " + arrayToString(concatArray(ary2, ary)));
	
	ary = new int[]{-2147483648, 2147483647};
	ary2 = new int[]{2147483647, -2147483648};
	System.out.println("Array 1: " + arrayToString(ary2) + " | Array 2: " + arrayToString(ary) + "\nAdded Together: " + arrayToString(concatArray(ary2, ary)));
	
  }
}
