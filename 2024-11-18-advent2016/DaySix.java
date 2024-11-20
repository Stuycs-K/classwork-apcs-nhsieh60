import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DayTwo{
	public static void main(String[] args){
		System.out.println(partOne("DayTwoInput.txt"));
	}
	
	public static String partOne(String filename){
	  try{
		File file = new File(filename);
		Scanner message = new Scanner(file);
		String result = "";
		int[] alphabetCount = new int[26];
		ArrayList<String> columns = new ArrayList<String>();
		String row = "";
		while(message.hasNextLine()){
			row = message.nextLine();
			for(int i = 0; i < row.length(); i++){
				columns.set(i, columns.get(i)+=row[i]);
			}
		}
		int max = 0;
		char maxi = '';
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
			alphabetCount =  = new int[26];
		}
		return result;
		
	}
	catch(FileNotFoundException e){
		System.out.println("File not found");
		return "";
	}
  }
  
}