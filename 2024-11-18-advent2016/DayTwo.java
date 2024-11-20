import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DayTwo{
	public static void main(String[] args){
		System.out.println(partOne("DayTwoInput.txt"));
		System.out.println(partTwo("DayTwoInput.txt"));
	}
	
	public static String partOne(String filename){
	  try{
		File file = new File(filename);
		Scanner directions = new Scanner(file);
		int[][] keypad = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		String code = "";
		String curDirections = "";
		int x = 1;
		int y = 1;
		while(directions.hasNextLine()){
			curDirections = directions.nextLine();
			//System.out.println(curDirections);
			//System.out.println(keypad[x][y]);
			for(int i = 0; i < curDirections.length(); i++){
				if(curDirections.charAt(i) == 'U' && y > 0){
					y -= 1;
				}
				if(curDirections.charAt(i) == 'D' && y < 2){
					y += 1;
				}
				if(curDirections.charAt(i) == 'L' && x > 0){
					x -= 1;
				}
				if(curDirections.charAt(i) == 'R' && x < 2){
					x += 1;
				}
				//System.out.println(keypad[y][x]);
			}
			code += keypad[y][x];
		}
		return code;
	}
	catch(FileNotFoundException e){
		System.out.println("File not found");
		return "";
	}
  }
  
  public static String partTwo(String filename){
	  try{
		File file = new File(filename);
		Scanner directions = new Scanner(file);
		String[][] keypad = new String[][]{{"", "", "1", "", ""}, {"", "2", "3", "4", ""}, {"5", "6", "7", "8", "9"}, {"", "A", "B", "C", ""}, {"", "", "D", "", ""}};
		String code = "";
		String curDirections = "";
		int x = 0;
		int y = 2;
		while(directions.hasNextLine()){
			curDirections = directions.nextLine();
			//System.out.println(curDirections);
			//System.out.println(keypad[x][y]);
			for(int i = 0; i < curDirections.length(); i++){
				if(curDirections.charAt(i) == 'U' && y > 0 && keypad[y-1][x] != ""){
					y -= 1;
				}
				if(curDirections.charAt(i) == 'D' && y < 4 && keypad[y+1][x] != ""){
					y += 1;
				}
				if(curDirections.charAt(i) == 'L' && x > 0 && keypad[y][x-1] != ""){
					x -= 1;
				}
				if(curDirections.charAt(i) == 'R' && x < 4 && keypad[y][x+1] != ""){
					x += 1;
				}
				//System.out.println(keypad[y][x]);
			}
			//System.out.println("Final: " + keypad[y][x]);
			code += keypad[y][x];
		}
		return code;
	}
	catch(FileNotFoundException e){
		System.out.println("File not found");
		return "";
	}
  }
  
}