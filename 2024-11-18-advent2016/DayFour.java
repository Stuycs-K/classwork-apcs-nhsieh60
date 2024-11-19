public class DayFour{
  public static void main(String[] args){
    System.out.println(partOne("DayFourInput.txt"));
  }
  public static int partOne(String filename){
    try{
      Scanner input = new Scanner(new File(filename));
      String[] room = "";
      int[] alphabetCount = new int[26];
      while(input.hasNextLine()){
        room = input.nextLine.split("-");
        for(int i = 0; i < room.length-1; i++){
          if(room[i])
        }
      }
    }
    catch(FileNotFoundException e){
      System.out.println("FILE NOT FOUND");
      return 0;
    }
  }
}
