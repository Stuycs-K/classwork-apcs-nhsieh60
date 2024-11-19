import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DayOne{
  public static void main(String[] args){
	System.out.println(partOne("DayOneInput.txt"));
	System.out.println(partTwo("DayOneInput.txt"));
  }
  public static int partOne(String filename){
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
  
   public static int partTwo(String filename){
	try{
		File file = new File(filename);
		Scanner directions = new Scanner(file);
		int x = 0;
		int y = 0;
		String prevDirection = "N";
		String curDirection = "";
		int steps = 0;
		ArrayList<Integer> coordinates = new ArrayList<Integer>();
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
					for(int j = 0; j < steps; j++){
						x -= 1;
						for(int i = 0; i < coordinates.size(); i+=2){
							if(coordinates.get(i) == x && coordinates.get(i+1) == y){
								return Math.abs(x) + Math.abs(y);
							}
						}
						coordinates.add(x); 
						coordinates.add(y);
					}
					prevDirection = "W";
				}
				else{
					for(int j = 0; j < steps; j++){
						x += 1;
						for(int i = 0; i < coordinates.size(); i+=2){
							if(coordinates.get(i) == x && coordinates.get(i+1) == y){
								return Math.abs(x) + Math.abs(y);
							}
						}
						coordinates.add(x); 
						coordinates.add(y);
					}
					prevDirection = "E";
				}
			}
			else if(prevDirection.equals("W")){
				if(curDirection.equals("R")){
					for(int j = 0; j < steps; j++){
						y += 1;
						for(int i = 0; i < coordinates.size(); i+=2){
							if(coordinates.get(i) == x && coordinates.get(i+1) == y){
								return Math.abs(x) + Math.abs(y);
							}
						}
						coordinates.add(x); 
						coordinates.add(y);
					}
					prevDirection = "N";
				}
				else{
					for(int j = 0; j < steps; j++){
						y -= 1;
						for(int i = 0; i < coordinates.size(); i+=2){
							if(coordinates.get(i) == x && coordinates.get(i+1) == y){
								return Math.abs(x) + Math.abs(y);
							}
						}
						coordinates.add(x); 
						coordinates.add(y);
					}
					prevDirection = "S";
					
				}
			}
			else if(prevDirection.equals("N")){
				if(curDirection.equals("R")){
					for(int j = 0; j < steps; j++){
						x += 1;
						for(int i = 0; i < coordinates.size(); i+=2){
							if(coordinates.get(i) == x && coordinates.get(i+1) == y){
								return Math.abs(x) + Math.abs(y);
							}
						}
						coordinates.add(x); 
						coordinates.add(y);
					}
					prevDirection = "E";
				}
				else{
					for(int j = 0; j < steps; j++){
						x -= 1;
						for(int i = 0; i < coordinates.size(); i+=2){
							if(coordinates.get(i) == x && coordinates.get(i+1) == y){
								return Math.abs(x) + Math.abs(y);
							}
						}
						coordinates.add(x); 
						coordinates.add(y);
					}
					prevDirection = "W";
				}
			}
			else{
				if(curDirection.equals("R")){
					for(int j = 0; j < steps; j++){
						y -= 1;
						for(int i = 0; i < coordinates.size(); i+=2){
							if(coordinates.get(i) == x && coordinates.get(i+1) == y){
								return Math.abs(x) + Math.abs(y);
							}
						}
						coordinates.add(x); 
						coordinates.add(y);
					}
					prevDirection = "S";
				}
				else{
					for(int j = 0; j < steps; j++){
						y += 1;
						for(int i = 0; i < coordinates.size(); i+=2){
							if(coordinates.get(i) == x && coordinates.get(i+1) == y){
								return Math.abs(x) + Math.abs(y);
							}
						}
						coordinates.add(x); 
						coordinates.add(y);
					}
					prevDirection = "N";
				}
			}
			//System.out.println("Given directions: " + curDirection + steps);
			/*System.out.println("Current coordinates: (" + x + ", " + y + ")\n");
			for(int i = 0; i < coordinates.size(); i+=2){
				if(coordinates.get(i) == x && coordinates.get(i+1) == y){
					return x + y;
				}
			}
			coordinates.add(x);
			coordinates.add(y);*/
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
