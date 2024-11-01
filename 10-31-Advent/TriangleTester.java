import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
	
	public static boolean triangleTest(int a, int b, int c){
		/*System.out.println("\n" + a + " " + b + " " + c);
		System.out.println((a + b) + ">" + c + " " + (a + b > c));
		System.out.println((a + c) + ">" + b + " " + (a + c > b));
		System.out.println((c + b) + ">" + a + " " + (c + b > a));
		System.out.println(a + b > c && a + c > b && b + c > a);*/
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
				//System.out.println(a+ " "+ b+ " "+ c);
				if(triangleTest(a,b,c)){
					count++;
				}
			//	System.out.println(count);
			}
			triangles.close();
			return count;
		}
		catch (FileNotFoundException ex) {
			System.out.println("File not found");
			return 0;
		}
	}
	
	public static int countTrianglesB(String filename){
		try{
			File file = new File(filename);
			Scanner triangles = new Scanner(file);
			String row1 = "";
			String row2 = "";
			String row3 = "";
			Scanner line1;
			Scanner line2;
			Scanner line3;
			int count = 0;
			while(triangles.hasNextLine()){
				row1 = triangles.nextLine();
				row2 = triangles.nextLine();
				row3 = triangles.nextLine();
				line1 = new Scanner(row1);
				line2 = new Scanner(row2);
				line3 = new Scanner(row3);
				//System.out.println("iteration");
				//System.out.println(row1); System.out.println(row2); System.out.println(row3);
				for(int j = 0; j < 3; j++){
					if(triangleTest(line1.nextInt(), line2.nextInt(), line3.nextInt())){
						count++;
					}
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
