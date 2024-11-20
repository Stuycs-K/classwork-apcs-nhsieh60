import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DaySix{
	public static void main(String[] args){
		System.out.println(partOne("DaySixInput.txt"));
		System.out.println(partTwo("DaySixInput.txt"));
	}
	
	public static String partOne(String filename){
	  try{
		File file = new File(filename);
		Scanner message = new Scanner(file);
		String result = "";
		int[] alphabetCount = new int[26];
		ArrayList<String> columns = new ArrayList<String>();
		String row = message.nextLine();
		for(int i = 0; i < row.length(); i++){
			columns.add(""+row.charAt(i));
		}
		while(message.hasNextLine()){
			row = message.nextLine();
			for(int i = 0; i < row.length(); i++){
				columns.set(i, columns.get(i)+row.charAt(i));
				//System.out.println(columns);
			}
			
		}
		int max = 0;
		char maxi = 'a';
		for(int i = 0; i < columns.size(); i++){
			for(int j = 0; j < columns.get(i).length(); j++){
				alphabetCount[columns.get(i).charAt(j)-97]++;
			}
			for(int j = 0; j < alphabetCount.length; j++){
				if(alphabetCount[j] > max){
					max = alphabetCount[j];
					maxi = (char)(j+97);
				}
			}
			result += maxi;
			max = 0;
			alphabetCount = new int[26];
		}
		return result;
		
	}
	catch(FileNotFoundException e){
		System.out.println("File not found");
		return "";
	}
  }
  
  public static String partTwo(String filename){
	  try{
		File file = new File(filename);
		Scanner message = new Scanner(file);
		String result = "";
		int[] alphabetCount = new int[26];
		ArrayList<String> columns = new ArrayList<String>();
		String row = message.nextLine();
		for(int i = 0; i < row.length(); i++){
			columns.add(""+row.charAt(i));
		}
		while(message.hasNextLine()){
			row = message.nextLine();
			for(int i = 0; i < row.length(); i++){
				columns.set(i, columns.get(i)+row.charAt(i));
				//System.out.println(columns);
			}
			
		}
		int min = 1000000000;
		char mini = 'a';
		for(int i = 0; i < columns.size(); i++){
			for(int j = 0; j < columns.get(i).length(); j++){
				alphabetCount[columns.get(i).charAt(j)-97]++;
			}
			min = alphabetCount[0];
			for(int j = 0; j < alphabetCount.length; j++){
				if(alphabetCount[j] < min && alphabetCount[j] != 0){
					min = alphabetCount[j];
					mini = (char)(j+97);
				}
				//System.out.println(min);
			}
			result += mini;
			alphabetCount = new int[26];
		}
		return result;
		
	}
	catch(FileNotFoundException e){
		System.out.println("File not found");
		return "";
	}
  }
  
}