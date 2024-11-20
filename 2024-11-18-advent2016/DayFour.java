import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DayFour{
  public static void main(String[] args){
    System.out.println(partOne("DayFourInput.txt"));
	partTwo("DayFourInput.txt");
  }
  public static int partOne(String filename){
    try{
      Scanner input = new Scanner(new File(filename));
      String[] room = new String[1];
      int[] alphabetCount = new int[26];
      int sum = 0;
     // String[] roomCode = new String[]{" 0", " 0", " 0", " 0", " 0"};
	  ArrayList<String> roomCode = new ArrayList<String>(26);
	  roomCode.add("a0");
	  boolean placed = false;
	  int k = 0;
	 // int l = 0;
      while(input.hasNextLine()){
        room = input.nextLine().split("-");
        for(int i = 0; i < room.length-1; i++){
          for(int j = 0; j < room[i].length(); j++){
            alphabetCount[room[i].charAt(j)-97]++;
          }
        }
        for(int i = 0; i < alphabetCount.length; i++){
			while(k < roomCode.size() && alphabetCount[i] <= Integer.parseInt(roomCode.get(k).substring(1))){
			//	System.out.println("run");
				k++;
			}
			roomCode.add(k, "" + ((char)(i+97)) + alphabetCount[i]);
			k = 0;
			/*while(!placed && k < roomCode.length){
				if(alphabetCount[i] > Integer.parseInt(roomCode[k].substring(1))){
					l = k;
					while(!placed && l < roomCode.length){
						if(Integer.parseInt(roomCode[k].substring(1)) > Integer.parseInt(roomCode[l].substring(1))){
							roomCode[l] = roomCode[k];
							placed = true;
						}
						l++;
					}
					roomCode[k] = "" + ((char)(i+97)) + alphabetCount[i];
					placed = true;
					System.out.println(roomCode[k]);
				}
				k++;
			}
			placed = false;
			k = 0;*/
		}
		String lastSegment = room[room.length-1];
		String matchCode = lastSegment.substring(lastSegment.indexOf("[")+1, lastSegment.length()-1);
		String id = lastSegment.substring(0, lastSegment.indexOf("["));
		boolean matching = true;
		for(int i = 0; i < 5; i++){
			if(matchCode.charAt(i) != roomCode.get(i).charAt(0)){
				matching = false;
			}
		//	System.out.print(roomCode.get(i).charAt(0));
		}
		//System.out.println(" " + matchCode);
		//System.out.println(id);
		if(matching){
			sum += Integer.parseInt(id);
		}
		//System.out.println(sum);
		matching = true;
		alphabetCount = new int[26];
		//roomCode = new String[]{" 0", " 0", " 0", " 0", " 0"};
		roomCode = new ArrayList<String>(26);
      }
	  return sum;
    }
    catch(FileNotFoundException e){
      System.out.println("FILE NOT FOUND");
      return 0;
    }
  }
  
  public static void partTwo(String filename){
	  try{
      Scanner input = new Scanner(new File(filename));
      String[] room = new String[1];
      int[] alphabetCount = new int[26];
      ArrayList<String> realRooms = new ArrayList<String>();
     // String[] roomCode = new String[]{" 0", " 0", " 0", " 0", " 0"};
	  ArrayList<String> roomCode = new ArrayList<String>(26);
	  roomCode.add("a0");
	  boolean placed = false;
	  int k = 0;
	 // int l = 0;
	String original = "";
      while(input.hasNextLine()){
		  original = input.nextLine();
        room = original.split("-");
        for(int i = 0; i < room.length-1; i++){
          for(int j = 0; j < room[i].length(); j++){
            alphabetCount[room[i].charAt(j)-97]++;
          }
        }
        for(int i = 0; i < alphabetCount.length; i++){
			while(k < roomCode.size() && alphabetCount[i] <= Integer.parseInt(roomCode.get(k).substring(1))){
			//	System.out.println("run");
				k++;
			}
			roomCode.add(k, "" + ((char)(i+97)) + alphabetCount[i]);
			k = 0;
		}
		String lastSegment = room[room.length-1];
		String matchCode = lastSegment.substring(lastSegment.indexOf("[")+1, lastSegment.length()-1);
		String id = lastSegment.substring(0, lastSegment.indexOf("["));
		boolean matching = true;
		for(int i = 0; i < 5; i++){
			if(matchCode.charAt(i) != roomCode.get(i).charAt(0)){
				matching = false;
			}
		//	System.out.print(roomCode.get(i).charAt(0));
		}
	//	System.out.println(" " + matchCode);
	//	System.out.println(id);
		if(matching){
			realRooms.add(original);
		}
	//	System.out.println(sum);
		matching = true;
		alphabetCount = new int[26];
		//roomCode = new String[]{" 0", " 0", " 0", " 0", " 0"};
		roomCode = new ArrayList<String>(26);
      }
	ArrayList<String> decrypted = new ArrayList<String>();
	String decrypting = "";
	String sectorID = "";
	String[] splitted = new String[1];
	 for(int i = 0; i < realRooms.size(); i++){
		 splitted = realRooms.get(i).split("-");
		sectorID = splitted[splitted.length-1].substring(0, splitted[splitted.length-1].indexOf("["));
		for(int j = 0; j < realRooms.get(i).length()-splitted[splitted.length-1].length(); j++){
			if(realRooms.get(i).charAt(j) == '-'){
				decrypting += " ";
			}
			else{
				decrypting += "" + (char)((realRooms.get(i).charAt(j)-97+Integer.parseInt(sectorID))%26+97);
			}
		}
		if(decrypting.indexOf("north") != -1){
			System.out.println(decrypting + " " + sectorID);
		}
		decrypting = "";
	 }
    }
    catch(FileNotFoundException e){
      System.out.println("FILE NOT FOUND");
      return;
    }
  }
}
