public class ArrayMethods{
  //1. Write both your names + emails at the top of the document as a comment.
  // Galen Jack galenj@nycstudents.net, Naomi Hsieh naomih44@nycstudents.net
  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrayToString(int[]ary){
    String arrayS = "[";
    for(int i = 0; i < nums.length-1; i++){
      arrayS += nums[i] + ", ";
    }
    if(nums.length > 0){
      arrayS += nums[nums.length-1];
    }
    return arrayS + "]";
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
    return "";
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }
  public static void main(String[] args){
      int[][] ary1 = new int[][]{{1, 2}, {3, 4}};
      String testString = "[[1, 2], [3, 4]]";
      System.out.println("testString: " + testString + "Result: " + arrToString(ary1) + "Equals? " + testString.equals(arrToString(ary1)));
      ary1 = new int[][]{{}, {4,4,4,4,4},{-5}};
      testString = "[[], [4, 4, 4, 4, 4], [-5]]";
      System.out.println("testString: " + testString + "Result: " + arrToString(ary1) + "Equals? " + testString.equals(arrToString(ary1)));
      ary1 = new int[][]{{}, {}, {}};
      testString = "[[], [], []]";
      System.out.println("testString: " + testString + "Result: " + arrToString(ary1) + "Equals? " + testString.equals(arrToString(ary1)));
      ary1 = new int[0][0];
      testString = "[]";
      System.out.println("testString: " + testString + "Result: " + arrToString(ary1) + "Equals? " + testString.equals(arrToString(ary1)));
	  ary1 = new int[][]{{6}, {4,4,4,4,4},{-5}};
      testString = "[[], [4, 4, 4, 4, 4], [-5]]";
      System.out.println("testString: " + testString + "Result: " + arrToString(ary1) + "Equals? " + testString.equals(arrToString(ary1)));
	  ary1 = new int[][]{{7}, {8},{-5}};
      testString = "[[], [4, 4, 4, 4, 4], [-5]]";
      System.out.println("testString: " + testString + "Result: " + arrToString(ary1) + "Equals? " + testString.equals(arrToString(ary1)));

      ary1 = new int[][]{{1, 2}, {3, 4}};
      int sum = 10;
      System.out.println("Expected sum: " + sum + "Result: " + arr2DSum(ary1) + "Equals? " + arr2DSum == sum);
      ary1 = new int[0][0];
      sum = 0;
      System.out.println("Expected sum: " + sum + "Result: " + arr2DSum(ary1) + "Equals? " + arr2DSum == sum);
      ary1 = new int[][]{{1, 2}, {3, 4}, {1, 3, 3}};
      sum = 17;
      System.out.println("Expected sum: " + sum + "Result: " + arr2DSum(ary1) + "Equals? " + arr2DSum == sum);
      ary1 = new int[][]{{}, {4,4,4,4,4},{-5}};
      sum = 15;
      System.out.println("Expected sum: " + sum + "Result: " + arr2DSum(ary1) + "Equals? " + arr2DSum == sum);
	  ary1 = new int[2][0];
      sum = 0;
      System.out.println("Expected sum: " + sum + "Result: " + arr2DSum(ary1) + "Equals? " + arr2DSum == sum);
	  ary1 = new int[][]{{7}, {8},{-5}};
	  sum = 10;
	  System.out.println("Expected sum: " + sum + "Result: " + arr2DSum(ary1) + "Equals? " + arr2DSum == sum);
	  
	  ary1 = new int[][]{{1,2,3},{4,5,6}};
	  testString = "[[1,4], [2, 5], [3, 6]]";
	  System.out.println("Expected array: " + testString + "Result: " + arrToString(swapRC(ary1)) + "Equals? " + testString.equals(arrToString(ary1)));
	  ary1 = new int[][]{{1,2},{4,5}};
	  testString = "[[1, 4], [2, 5]]";
	  System.out.println("Expected array: " + testString + "Result: " + arrToString(swapRC(ary1)) + "Equals? " + testString.equals(arrToString(ary1)));
	  ary1 = new int[][]{{1, 2, 5, 6}, {4, 5, 7, 8}, {0, -1, -2147483648, 2147483647}};
	  testString = "[[1, 4, 0], [2, 5, -1], [5, 7, -2147483648], [6, 8, 2147483647]]";
	  System.out.println("Expected array: " + testString + "Result: " + arrToString(swapRC(ary1)) + "Equals? " + testString.equals(arrToString(ary1)));

    }
}
