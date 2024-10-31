public class TriangleTester{
	
	public static boolean triangleTest(int a, int b, int c){
		return a + b >= c && a + c >= b && b + c >= a; 
	}
	
	public static int countTrianglesA(String filename){
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
		return count;
	}
}
