import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DayOne{
  public static void main(String[] args){
	System.out.println(map("DayOneInput.txt"));
  }
  public static int map(String filename){
	try{
		File file = new File(filename);
		Scanner directions = new Scanner(file);
		int x = 0;
		int y = 0;
		int i = 0;
		String prevDirection = "L";
		String curDirection = "";
		int steps = 0;
		while(directions.hasNext()){
			curDirection = directions.next();
			steps = Integer.parseInt(curDirection.substring(1, 2));
			curDirection = curDirection.substring(0,1);
			if(prevDirection.equals("R") && i % 2 == 0){
				if(curDirection.equals("R")){
					x -= steps;
				}
				else{
					x += steps;
				}
			}
			else if(prevDirection.equals("R") && i % 2 != 0){
				if(curDirection.equals("R")){
					y -= steps;
				}
				else{
					y += steps;
				}
			}
			else if(prevDirection.equals("L") && i % 2 == 0){
				if(curDirection.equals("R")){
					x += steps;
				}
				else{
					x -= steps;
				}
			}
			else{
				if(curDirection.equals("R")){
					y += steps;
				}
				else{
					y -= steps;
				}
			}
			i++;
			prevDirection = curDirection;
		}
		directions.close();
		return Math.abs(x)+Math.abs(y);
	}
	catch(FileNotFoundException e){
		System.out.println("File not found");
		return 0;
	}
  }
}
