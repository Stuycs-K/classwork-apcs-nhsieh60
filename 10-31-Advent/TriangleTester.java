import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
	
	public static boolean triangleTest(int a, int b, int c){
		return a + b > c && a + c > b && b + c > a; 
	}
	
	public static int countTrianglesA(String filename){
		try{
			File file = new File(filename);
			Scanner triangles = new Scanner(file);
			int a = 0;
			int b = 0;
			int c = 0;
			int count = 0;
			while(triangles.hasNextLine()){
				a = triangles.nextInt();
				b = triangles.nextInt();
				c = triangles.nextInt();
				if(triangleTest(a,b,c)){
					count++;
				}
			}
			triangles.close();
			return count;
		}
		catch (FileNotFoundException ex) {
			System.out.println("File not found");
			return 0;
		}
	}
}
