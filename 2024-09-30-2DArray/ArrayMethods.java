// Galen Jack galenj@nycstudents.net, Naomi Hsieh naomih44@nycstudents.net
public class ArrayMethods{
  //1. Write both your names + emails at the top of the document as a comment.
  // Galen Jack galenj@nycstudents.net, Naomi Hsieh naomih44@nycstudents.net
  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[]ary){
    String arrayS = "[";
    for(int i = 0; i < ary.length-1; i++){
      arrayS += ary[i] + ", ";
    }
    if(ary.length > 0){
      arrayS += ary[ary.length-1];
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
	String arrayS = "[";
	for(int i = 0; i < ary.length-1; i++){
		arrayS += arrToString(ary[i]);
		arrayS += ", ";
	}
	if(ary.length>0){
		arrayS += arrToString(ary[ary.length-1]);
	}
    return arrayS + "]";
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
	int sum = 0;
	for(int i = 0; i < nums.length; i++){
		for(int j = 0; j < nums[i].length; j++){
			sum += nums[i][j];
		}
	}
	return sum;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
	int[][] rotated = new int[nums[0].length][nums.length];
	for(int i = 0; i < nums.length; i++){
		for(int j = 0; j < nums[i].length; j++){
			rotated[j][i] = nums[i][j];
		}
	}

    return rotated;
  }
    //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){ 
	for(int i = 0; i < vals.length; i++){
		for(int j = 0; j < vals[i].length; j++){
			if(vals[i][j] < 0){
				if(i == j){
					vals[i][j] = 1;
				}
				else{
					vals[i][j] = 0;
				}
			}
		}
	}
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    return null;//placeholder so it compiles
  }


  public static void main(String[] args){
    //arrToString test cases
    int[][] ary1 = new int[][]{{1, 2}, {3, 4}};
    String testString = "[[1, 2], [3, 4]]";
    System.out.println("testString: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
    ary1 = new int[][]{{}, {4,4,4,4,4},{-5}};
    testString = "[[], [4, 4, 4, 4, 4], [-5]]";
    System.out.println("testString: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
    ary1 = new int[][]{{}, {}, {}};
    testString = "[[], [], []]";
    System.out.println("testString: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
    ary1 = new int[0][0];
    testString = "[]";
    System.out.println("testString: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
	ary1 = new int[][]{{6}, {4,4,4,4,4},{-5}};
    testString = "[[6], [4, 4, 4, 4, 4], [-5]]";
    System.out.println("testString: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
	ary1 = new int[][]{{7}, {8},{-5}};
    testString = "[[7], [8], [-5]]";
    System.out.println("testString: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
    //arr2DSum test cases
    ary1 = new int[][]{{1, 2}, {3, 4}};
    int sum = 10;
    System.out.println("Expected sum: " + sum + " | Result: " + arr2DSum(ary1) + " | Equals? " + (arr2DSum(ary1) == sum));
    ary1 = new int[0][0];
    sum = 0;
    System.out.println("Expected sum: " + sum + " | Result: " + arr2DSum(ary1) + " | Equals? " + (arr2DSum(ary1) == sum));
    ary1 = new int[][]{{1, 2}, {3, 4}, {1, 3, 3}};
    sum = 17;
    System.out.println("Expected sum: " + sum + " | Result: " + arr2DSum(ary1) + " | Equals? " + (arr2DSum(ary1) == sum));
    ary1 = new int[][]{{}, {4,4,4,4,4},{-5}};
    sum = 15;
    System.out.println("Expected sum: " + sum + " | Result: " + arr2DSum(ary1) + " | Equals? " + (arr2DSum(ary1) == sum));
	ary1 = new int[2][0];
    sum = 0;
    System.out.println("Expected sum: " + sum + " | Result: " + arr2DSum(ary1) + " | Equals? " + (arr2DSum(ary1) == sum));
	ary1 = new int[][]{{7}, {8},{-5}};
	sum = 10;
	System.out.println("Expected sum: " + sum + " | Result: " + arr2DSum(ary1) + " | Equals? " + (arr2DSum(ary1) == sum));
    //swapRC test cases
	ary1 = new int[][]{{1,2,3},{4,5,6}};
	testString = "[[1, 4], [2, 5], [3, 6]]";
	System.out.println("Expected array: " + testString + " | Result: " + arrToString(swapRC(ary1)) + " | Equals? " + testString.equals(arrToString(swapRC(ary1))));
	ary1 = new int[][]{{1,2},{4,5}};
	testString = "[[1, 4], [2, 5]]";
	System.out.println("Expected array: " + testString + " | Result: " + arrToString(swapRC(ary1)) + " | Equals? " + testString.equals(arrToString(swapRC(ary1))));
	ary1 = new int[][]{{1, 2, 5, 6}, {4, 5, 7, 8}, {0, -1, -2147483648, 2147483647}};
	testString = "[[1, 4, 0], [2, 5, -1], [5, 7, -2147483648], [6, 8, 2147483647]]";
	System.out.println("Expected array: " + testString + " | Result: " + arrToString(swapRC(ary1)) + " | Equals? " + testString.equals(arrToString(swapRC(ary1))));
	ary1 = new int[][]{{1}, {4}, {0}};
	testString = "[[1, 4, 0]]";
	System.out.println("Expected array: " + testString + " | Result: " + arrToString(swapRC(ary1)) + " | Equals? " + testString.equals(arrToString(swapRC(ary1))));
	ary1 = new int[][]{{1, 2, 3, 4}};
	testString = "[[1], [2], [3], [4]]";
	System.out.println("Expected array: " + testString + " | Result: " + arrToString(swapRC(ary1)) + " | Equals? " + testString.equals(arrToString(swapRC(ary1))));
    //replaceNegative test cases
    ary1 = new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
    testString = "[[1, 0, 0], [0, 1, 0], [0, 0, 1]]";
    replaceNegative(ary1);
    System.out.println("Expected array: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
    ary1 = new int[][]{{1, 1}, {1, 1, 1}, {1}};
    testString = "[[1, 1], [1, 1, 1], [1]]";
    replaceNegative(ary1);
    System.out.println("Expected array: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
    ary1 = new int[0][0];
    testString = "[]";
    replaceNegative(ary1);
    System.out.println("Expected array: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
	ary1 = new int[][]{{1989, -2147483648}, {22, 2147483647}, {0, -3219381}};
    testString = "[[1989, 0], [22, 2147483647], [0, 0]]";
    replaceNegative(ary1);
    System.out.println("Expected array: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
	ary1 = new int[][]{{-1, -2}, {-3, -3, -4, -5}, {-1, 3, 4}};
    testString = "[[1, 0], [0, 1, 0, 0], [0, 3, 4]]";
    replaceNegative(ary1);
    System.out.println("Expected array: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
	ary1 = new int[][]{{-2, 3}, {5, -1}};
    testString = "[[1, 3], [5, 1]]";
    replaceNegative(ary1);
    System.out.println("Expected array: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
	ary1 = new int[][]{{}, {}, {}};
    testString = "[[], [], []]";
    replaceNegative(ary1);
    System.out.println("Expected array: " + testString + " | Result: " + arrToString(ary1) + " | Equals? " + testString.equals(arrToString(ary1)));
	//copy test cases
	ary1 = new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
	ary2 = copy(ary1);
	System.out.println("Original array: " + arrToString(ary1) + " | Copy: " + arrToString(ary2) + " | Equals? " + arrToString(ary1).equals(arrToString(ary2)));
	System.out.println("Addresses: " + ary1 + ", " + ary2 + "| Not equal? " + (ary1 == ary2));
	ary1[0][0] = 123;
	System.out.println("Changed original array: " + arrToString(ary1) + " | Unchanged copy: " + arrToString(ary2) + " | Not equal? " + (ary1 == ary2));
	ary1 = new int[][]{{1, 1}, {1, 1, 1}, {1}};
	ary2 = copy(ary1);
	System.out.println("Original array: " + arrToString(ary1) + " | Copy: " + arrToString(ary2) + " | Equals? " + arrToString(ary1).equals(arrToString(ary2)));
	System.out.println("Addresses: " + ary1 + ", " + ary2 + "| Not equal? " + (ary1 == ary2));
	ary1[1][2] = -2147483648;
	System.out.println("Changed original array: " + arrToString(ary1) + " | Unchanged copy: " + arrToString(ary2) + " | Not equal? " + (ary1 == ary2));
	ary1 = new int[][]{{1989, -2147483648}, {22, 2147483647}, {0, -3219381}};
	ary2 = copy(ary1);
	System.out.println("Original array: " + arrToString(ary1) + " | Copy: " + arrToString(ary2) + " | Equals? " + arrToString(ary1).equals(arrToString(ary2)));
	System.out.println("Addresses: " + ary1 + ", " + ary2 + "| Not equal? " + (ary1 == ary2));
	ary1[1][0] = 2147483647;
	System.out.println("Changed original array: " + arrToString(ary1) + " | Unchanged copy: " + arrToString(ary2) + " | Not equal? " + (ary1 == ary2));
	ary1 = new int[][]{{-1, -2}, {-3, -3, -4, -5}, {-1, 3, 4}};
	ary2 = copy(ary1);
	System.out.println("Original array: " + arrToString(ary1) + " | Copy: " + arrToString(ary2) + " | Equals? " + arrToString(ary1).equals(arrToString(ary2)));
	System.out.println("Addresses: " + ary1 + ", " + ary2 + "| Not equal? " + (ary1 == ary2));
	ary1[2][1] = 0;
	System.out.println("Changed original array: " + arrToString(ary1) + " | Unchanged copy: " + arrToString(ary2) + " | Not equal? " + (ary1 == ary2));
	ary1 = new int[][]{{-2, 3}, {5, -1}};
	ary2 = copy(ary1);
	System.out.println("Original array: " + arrToString(ary1) + " | Copy: " + arrToString(ary2) + " | Equals? " + arrToString(ary1).equals(arrToString(ary2)));
	System.out.println("Addresses: " + ary1 + ", " + ary2 + "| Not equal? " + (ary1 == ary2));
	ary1[1] = {-9, -2, 3};
	System.out.println("Changed original array: " + arrToString(ary1) + " | Unchanged copy: " + arrToString(ary2) + " | Not equal? " + (ary1 == ary2));
    }
}
