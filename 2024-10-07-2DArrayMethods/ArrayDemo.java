import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    //arrToString test cases
	//NOTE: For 2D Arrays I used Arrays.deepToString() as you said that would work for 2D Arrays in class and we could use it 
	//when answering a classmate's question; putting this here for clarification
	System.out.println("arrToString: ");
    int[][] ary1 = new int[][]{{1, 2}, {3, 4}};
    System.out.println("Expected: " + Arrays.deepToString(ary1) + " | Result: " + arrToString(ary1) + " | Equals? " + Arrays.deepToString(ary1).equals(arrToString(ary1)));
    int[] ary = new int[]{1, 2, 3};
    System.out.println("Expected: " + Arrays.toString(ary) + " | Result: " + arrToString(ary) + " | Equals? " + Arrays.toString(ary).equals(arrToString(ary)));
    ary = new int[0];
    System.out.println("Expected: " + Arrays.toString(ary) + " | Result: " + arrToString(ary) + " | Equals? " + Arrays.toString(ary).equals(arrToString(ary)));
    ary = new int[]{-1, 0, -2147483648, 2147483647};
    System.out.println("Expected: " + Arrays.toString(ary) + " | Result: " + arrToString(ary) + " | Equals? " + Arrays.toString(ary).equals(arrToString(ary)));
    ary1 = new int[][]{{}, {4,4,4,4,4},{-5}};
    System.out.println("Expected: " + Arrays.deepToString(ary1) + " | Result: " + arrToString(ary1) + " | Equals? " + Arrays.deepToString(ary1).equals(arrToString(ary1)));
    ary1 = new int[][]{{}, {}, {}};
    System.out.println("Expected: " + Arrays.deepToString(ary1) + " | Result: " + arrToString(ary1) + " | Equals? " + Arrays.deepToString(ary1).equals(arrToString(ary1)));
    ary1 = new int[0][0];
    System.out.println("Expected: " + Arrays.deepToString(ary1) + " | Result: " + arrToString(ary1) + " | Equals? " + Arrays.deepToString(ary1).equals(arrToString(ary1)));
    ary1 = new int[][]{{6}, {4,4,4,4,4},{-5}};
    System.out.println("Expected: " + Arrays.deepToString(ary1) + " | Result: " + arrToString(ary1) + " | Equals? " + Arrays.deepToString(ary1).equals(arrToString(ary1)));
    ary1 = new int[][]{{7}, {8},{-5}};
    System.out.println("Expected: " + Arrays.deepToString(ary1) + " | Result: " + arrToString(ary1) + " | Equals? " + Arrays.deepToString(ary1).equals(arrToString(ary1)));


    //countZeros2D test cases
	System.out.println("countZeros2D: ");
    ary1 = new int[][]{{0, 0}, {0, 1, 2}, {}};
	int expected = 3;
	System.out.println("Expected: " + expected + " | Result: " + countZeros2D(ary1) + " | Equals? " + (expected == countZeros2D(ary1)));
	ary1 = new int[][]{{0, 0, -2147483648, 2147483647}, {0, 1, 2}, {0}};
	expected = 4;
	System.out.println("Expected: " + expected + " | Result: " + countZeros2D(ary1) + " | Equals? " + (expected == countZeros2D(ary1)));
	ary1 = new int[][]{{1, 0, -2147483648, 2147483647}, {0, 1, 2, 5}, {0, 2, -1, 31829}};
	expected = 3;
	System.out.println("Expected: " + expected + " | Result: " + countZeros2D(ary1) + " | Equals? " + (expected == countZeros2D(ary1)));
	ary1 = new int[][]{{0, 0}, {1, 2}};
	expected = 2;
	System.out.println("Expected: " + expected + " | Result: " + countZeros2D(ary1) + " | Equals? " + (expected == countZeros2D(ary1)));
	ary1 = new int[][]{{0, 1}, {1, 0}};
	expected = 2;
	System.out.println("Expected: " + expected + " | Result: " + countZeros2D(ary1) + " | Equals? " + (expected == countZeros2D(ary1)));
	ary1 = new int[][]{{}, {}};
	expected = 0;
	System.out.println("Expected: " + expected + " | Result: " + countZeros2D(ary1) + " | Equals? " + (expected == countZeros2D(ary1)));
	ary1 = new int[0][0];
	expected = 0;
	System.out.println("Expected: " + expected + " | Result: " + countZeros2D(ary1) + " | Equals? " + (expected == countZeros2D(ary1)));
	ary1 = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}};
	expected = 0;
	System.out.println("Expected: " + expected + " | Result: " + countZeros2D(ary1) + " | Equals? " + (expected == countZeros2D(ary1)));
	ary1 = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {10, 9, 8, 7, 6, 5, 4, 3}};
	expected = 0;
	System.out.println("Expected: " + expected + " | Result: " + countZeros2D(ary1) + " | Equals? " + (expected == countZeros2D(ary1)));
	
	//htmlTable test cases
	System.out.println("htmlTable: ");
	ary1 = new int[][]{{1, 2}, {3}};
	String testString = "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>";
	System.out.println("Expected: " + testString + " | Result: " + htmlTable(ary1) + " | Equals? " + (testString.equals(htmlTable(ary1))));
	ary1 = new int[][]{{1, 2}, {3, 4}};
	testString = "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td><td>4</td></tr></table>";
	System.out.println("Expected: " + testString + " | Result: " + htmlTable(ary1) + " | Equals? " + (testString.equals(htmlTable(ary1))));
	ary1 = new int[][]{{-2147483648, 2147483647}, {0, -1}, {}};
	testString = "<table><tr><td>-2147483648</td><td>2147483647</td></tr><tr><td>0</td><td>-1</td></tr><tr></tr></table>";
	System.out.println("Expected: " + testString + " | Result: " + htmlTable(ary1) + " | Equals? " + (testString.equals(htmlTable(ary1))));
	ary1 = new int[][]{{1, 2, 3, 4}, {-3, -4, 0, 10}};
	testString = "<table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr><tr><td>-3</td><td>-4</td><td>0</td><td>10</td></tr></table>";
	System.out.println("Expected: " + testString + " | Result: " + htmlTable(ary1) + " | Equals? " + (testString.equals(htmlTable(ary1))));
	ary1 = new int[][]{{}, {}, {}, {}, {}};
	testString = "<table><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr></table>";
	System.out.println("Expected: " + testString + " | Result: " + htmlTable(ary1) + " | Equals? " + (testString.equals(htmlTable(ary1))));
	ary1 = new int[][]{};
	testString = "<table></table>";
	System.out.println("Expected: " + testString + " | Result: " + htmlTable(ary1) + " | Equals? " + (testString.equals(htmlTable(ary1))));
    }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
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

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
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

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
	int count = 0;
	for(int i = 0; i < nums.length; i++){
		for(int j = 0; j < nums[i].length; j++){
			if(nums[i][j] == 0){
				count++;
			}
		}
	}
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
  	for(int i = 0; i < nums.length; i++){
  		for(int j = 0; j < nums[i].length; j++){
  			sum += nums[i][j];
  		}
  	}
  	return sum;
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
  public static int[] copy1D(int[] ary){
    int[] ary2 = new int[ary.length];
    for(int i = 0; i < ary.length; i++){
      ary2[i] = ary[i];
    }
    return ary2;
  }
  public static int[][] copy(int[][] nums){
    int[][] copied = new int[nums.length][];
  	for(int i = 0; i < nums.length; i++){
  		copied[i] = copy1D(nums[i]);
  	}
    return copied;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] rotated = new int[nums[0].length][nums.length];
  	for(int i = 0; i < nums.length; i++){
  		for(int j = 0; j < nums[i].length; j++){
  			rotated[j][i] = nums[i][j];
  		}
	   }
	   
	return rotated;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlRow(int[] nums){
	String row = "<tr>";
	for(int i = 0; i < nums.length; i++){
		row += "<td>" + nums[i] + "</td>";
	}
	return row + "</tr>";
  }
  
  public static String htmlTable(int[][]nums){
	String table = "<table>";
	for(int i = 0; i < nums.length; i++){
		table += htmlRow(nums[i]);
	}
    return table += "</table>";
  }
}
