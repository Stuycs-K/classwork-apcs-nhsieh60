import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    //printing out one word per line
    Scanner sc1 = new Scanner("This is a bunch of words");
    while(sc1.hasNext()){
        System.out.println(sc1.next());
    }
    //2 Opening a file requires a try/catch
  /*  try {
      File file = new File("PUT_FILENAME_HERE");//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }*/
  }
}
