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
	String hypernet = "";
	String original = "";
    while(ips.hasNextLine()){
      curIP = ips.nextLine();
      original = curIP;
      for(int i = 0; i < curIP.length()-3; i++){
        if(curIP.charAt(i) == curIP.charAt(i+3) && curIP.charAt(i+1) == curIP.charAt(i+2) && curIP.charAt(i+1) != curIP.charAt(i)){
          contains = true;
          System.out.println(curIP.substring(i, i+4));
        }
      }
      int iBracket = curIP.indexOf("[");
      //System.out.println(count);
	  while(iBracket != -1){
		  while(curIP.charAt(iBracket) != ']'){
			if(curIP.charAt(iBracket+1) == curIP.charAt(iBracket+4) && curIP.charAt(iBracket+2) == curIP.charAt(iBracket+3) && curIP.charAt(iBracket+1) != curIP.	charAt(iBracket+2)){
				contains = false;
			}
			hypernet += curIP.charAt(iBracket);
			iBracket++;
		}
		curIP = curIP.substring(iBracket);
		iBracket = curIP.indexOf("[");
		hypernet += "\n";
	  }
	  
	//  System.out.print("\n");
      if(contains){
		  count++;
		  System.out.println(original);
		  System.out.println(hypernet);
		  System.out.println(count);
	  }
     // System.out.println(count+"\n");
      contains = false;
	  hypernet = "";
    }
    ips.close();
    return count;

	}
	catch(FileNotFoundException e){
		System.out.println("File not found");
		return 0;
	}
  }
  
  public static int partTwo(String filename){
	  try{
		File file = new File(filename);
		Scanner ips = new Scanner(file);
		String curIP = "";
		int count = 0;
		boolean contains = false;
		ArrayList<String> potentials = new ArrayList<String>();
		String bab = "";
		while(ips.hasNextLine()){
		  curIP = ips.nextLine();
		  original = curIP;
		  for(int i = 0; i < curIP.length()-2; i++){
			if(curIP.charAt(i) == curIP.charAt(i+2) && curIP.charAt(i+1) != curIP.charAt(i)){
			  potentials.add(curIP.substring(i, i+3);
			}
		  }
		  int iBracket = curIP.indexOf("[");
		  //System.out.println(count);
		  while(iBracket != -1){
			for(int i = 0; i < potentials.size(); i++){
				bab = potentials.get(i).charAt(1) + potentials.get(i).charAt(0) + potentials.get(i).charAt(1);
				while(curIP.charAt(iBracket) != ']' && !contains){
					if(bab.equals(curIP.substring(iBracket, iBracket+3)){
						count++;
						contains = true;
					}
					iBracket++;
				}
				iBracket = curIP.indexOf("[");
			}
			curIP = curIP.substring(iBracket);
			iBracket = curIP.indexOf("[");
		  }
		  
		//  System.out.print("\n")
		 // System.out.println(count+"\n");
		  contains = false;
		  hypernet = "";
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
