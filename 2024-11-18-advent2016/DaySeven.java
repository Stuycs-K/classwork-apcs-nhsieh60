import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DaySeven{
	public static void main(String[] args){
		System.out.println(partOne("DaySevenInput.txt"));
	}

	public static String partOne(String filename){
	  try{
		File file = new File(filename);
		Scanner ips = new Scanner(file);
    String curIP = "";
    int count = 0;
    while(ips.hasNextLine()){
      curIP = ips.nextLine();
      for(int i = 0; i < curIP.length()-3; i++){
        if(curIP.charAt(i) == curIP.charAt(i+3) && curIP.charAt(i+1) == curIP.charAt(i+2)){
          count++;
        }
      }
      int iBracket = curIP.indexOf("[")
      if(curIP.charAt(iBracket+1) == curIP.charAt(iBracket+4) && curIP.charAt(iBracket+2) == curIP.charAt(iBracket+3)){
        count--;
      }
    }
    ips.close();
    return count;

	}
	catch(FileNotFoundException e){
		System.out.println("File not found");
		return "";
	}
  }
