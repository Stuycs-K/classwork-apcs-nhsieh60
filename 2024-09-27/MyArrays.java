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
	
	
	System.out.println("Array 1: " + arrayToString(ary) + " | Array 2: " + arrayToString(ary3) + "Added Together: " + arrayToString(concatArray(ary, ary3)));
	System.out.println("Are the concatenated array strings equal? " ((arrayToString(ary) + arrayToString(ary3)).equals(arrayToString(concatArray(ary, ary3)))));
	
	System.out.println("Array 1: " + arrayToString(ary2) + " | Array 2: " + arrayToString(ary3) + "Added Together: " + arrayToString(concatArray(ary2, ary3)));
	System.out.println("Are the concatenated array strings equal? " ((arrayToString(ary2) + arrayToString(ary3)) == arrayToString(concatArray(ary2, ary3))));
	
	int ary4 = {-9, -8, 31829231, 90, 0};
	int ary5 = {9, 4, 3, 2, 1, 0, 9, 9, 9};
	System.out.println("Array 1: " + arrayToString(ary4) + " | Array 2: " + arrayToString(ary5) + "Added Together: " + arrayToString(concatArray(ary4, ary5)));
	System.out.println("Are the concatenated array strings equal? " ((arrayToString(ary4) + arrayToString(ary5)) == arrayToString(concatArray(ary4, ary5))));
  }
	
  }
  }
}
