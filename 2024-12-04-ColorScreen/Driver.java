public class Driver{
	public static void border(int color){
		Text.go(1, 1);
		for(int i = 1; i <= 80; i++){
			Text.color(Text.background(color));
			System.out.print(" ");
		}
		for(int i = 2; i < 30; i++){
			Text.go(i, 1);
			Text.color(Text.background(color));
			System.out.print(" "+Text.RESET);
			Text.go(i, 80);
			Text.color(Text.background(color));
			System.out.print(" "+Text.RESET);
		}
		Text.go(30, 1);
		for(int i = 1; i <= 80; i++){
			Text.color(Text.background(color));
			System.out.print(" ");
		}
	}
	public static void main(String[] args){
		border((int)(Math.random()*7)+31);
		System.out.println(Text.RESET);
	}
}