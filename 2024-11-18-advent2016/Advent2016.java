import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Advent2016{
  public static void main(String[] args){
	System.out.println(dayOne("DayOneInput.txt"));
	System.out.println(dayTwo("DayTwoInput.txt"));
  }
  public static int dayOne(String filename){
	try{
		File file = new File(filename);
		Scanner directions = new Scanner(file);
		int x = 0;
		int y = 0;
		String prevDirection = "N";
		String curDirection = "";
		int steps = 0;
		while(directions.hasNext()){
			//System.out.println("Previous Direction: " + prevDirection);
			//System.out.println("Previous coordinates: (" + x + ", " + y + ")");
			curDirection = directions.next();
			if(curDirection.charAt(curDirection.length()-1) == ','){
				curDirection = curDirection.substring(0, curDirection.length()-1);
			}
			steps = Integer.parseInt(curDirection.substring(1));
			curDirection = curDirection.substring(0,1);
			if(prevDirection.equals("S")){
				if(curDirection.equals("R")){
					x -= steps;
					prevDirection = "W";
				}
				else{
					x += steps;
					prevDirection = "E";
				}
			}
			else if(prevDirection.equals("W")){
				if(curDirection.equals("R")){
					y += steps;
					prevDirection = "N";
				}
				else{
					y -= steps;
					prevDirection = "S";
					
				}
			}
			else if(prevDirection.equals("N")){
				if(curDirection.equals("R")){
					x += steps;
					prevDirection = "E";
				}
				else{
					x -= steps;
					prevDirection = "W";
				}
			}
			else{
				if(curDirection.equals("R")){
					y -= steps;
					prevDirection = "S";
				}
				else{
					y += steps;
					prevDirection = "N";
				}
			}
			//System.out.println("Given directions: " + curDirection + steps);
			//System.out.println("Current coordinates: (" + x + ", " + y + ")\n");
		}
		directions.close();
		return Math.abs(x)+Math.abs(y);
	}
	catch(FileNotFoundException e){
		System.out.println("File not found");
		return 0;
	}
  }
  public static String dayTwo(String filename){
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
}
