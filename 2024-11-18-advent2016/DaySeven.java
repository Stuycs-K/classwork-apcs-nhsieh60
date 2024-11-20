import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DaySeven{
	public static void main(String[] args){
		System.out.println(partOne("DaySevenInput.txt"));
	}

	public static int partOne(String filename){
	  try{
		File file = new File(filename);
		Scanner ips = new Scanner(file);
    String curIP = "";
    int count = 0;
    boolean contains = false;
    while(ips.hasNextLine()){
      curIP = ips.nextLine();
      System.out.println(curIP);
      for(int i = 0; i < curIP.length()-3; i++){
        if(curIP.charAt(i) == curIP.charAt(i+3) && curIP.charAt(i+1) == curIP.charAt(i+2) && curIP.charAt(i+1) != curIP.charAt(i)){
          contains = true;
          System.out.println(curIP.substring(i, i+4));
        }
      }
      int iBracket = curIP.indexOf("[");
      System.out.println(count);
      if(!(curIP.charAt(iBracket+1) == curIP.charAt(iBracket+4) && curIP.charAt(iBracket+2) == curIP.charAt(iBracket+3) && curIP.charAt(iBracket+1) != curIP.charAt(iBracket+2)) && contains){
        count++;
        System.out.println(curIP.substring(iBracket, iBracket+6));
      }
      System.out.println(count);
      contains = false;
    }
    ips.close();
    return count;

	}
	catch(FileNotFoundException e){
		System.out.println("File not found");
		return 0;
	}
  }
}
