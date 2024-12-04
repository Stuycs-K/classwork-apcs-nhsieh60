public class Driver{
	public static void border(int color){
		Text.go(1, 1);
		for(int i = 1; i <= 80; i++){
			Text.color(37, Text.background(color));
			System.out.print("*");
		}
		for(int i = 2; i < 30; i++){
			Text.go(i, 1);
			Text.color(37, Text.background(color));
			System.out.print("*"+Text.RESET);
			Text.go(i, 80);
			Text.color(37, Text.background(color));
			System.out.print("*"+Text.RESET);
		}
		Text.go(30, 1);
		for(int i = 1; i <= 80; i++){
			Text.color(37, Text.background(color));
			System.out.print("*");
		}
	}
	public static void numbers(){
		int[] arr = new int[3];
		int increment = 1;
		for(int i = 0; i < 3; i++){
			arr[i] = (int)(Math.random()*100);
			increment += 19;
			Text.go(2, increment);
			if(arr[i] < 25){
				Text.color(91);
				System.out.println(arr[i] + Text.RESET);
			}
			else if(arr[i] > 75){
				Text.color(92);
				System.out.println(arr[i] + Text.RESET);
			}
			else{
				Text.color(37);
				System.out.println(arr[i] + Text.RESET);
			}
		}
	}
	public static void separator(int color){
		Text.go(3, 1);
		for(int i = 1; i <= 80; i++){
			Text.color(37, Text.background(color));
			System.out.print("-");
		}
	}
	public static void drawSomething(int color){
		Text.go(18, 38);
		Text.color(30, Text.background(color));
		System.out.print("o7" + Text.RESET);
		
	}
	public static void main(String[] args){
		//System.out.println(Text.CLEAR_SCREEN);
		int borderColor = (int)(Math.random()*6)+31;
		border(borderColor);
		numbers();
		separator(borderColor);
		drawSomething(borderColor);
		Text.go(31, 1);
		System.out.println(Text.RESET);
	}
}