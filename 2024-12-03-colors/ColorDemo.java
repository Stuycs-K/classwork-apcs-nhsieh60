public class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
public static void sleep(int milli){
      try{
              Thread.sleep(milli);
      }catch(Exception e){
      }
}
  public static void makeBubble(int n){
	int whitespace = n-4;
	int counter = 4;
	for(int i = 4; i < n; i++){
		for(int j = 0; j < whitespace; j++){
			System.out.print("\u001b[107m ");
		}
		for(int j = 0; j < counter; j++){
			System.out.print("\u001b[106m ");
		}
		for(int j = 0; j < whitespace; j++){
			System.out.print("\u001b[107m ");
		}
		System.out.println();
		whitespace--;
		counter += 2;
	}
	whitespace = 0;
	counter -= 2;
	for(int i = n; i > 4; i--){
		for(int j = 0; j <= whitespace; j++){
			System.out.print("\u001b[107m ");
		}
		for(int j = 0; j < counter; j++){
			System.out.print("\u001b[106m ");
		}
		for(int j = 0; j <= whitespace; j++){
			System.out.print("\u001b[107m ");
		}
		System.out.println();
		whitespace++;
		counter -= 2;
	}
  }

  public static void main(String[] args){
    for(int b = 0; b < 256; b+=32){
      for(int r = 0; r <= 256; r+=32){
        for(int g = 0; g <= 256; g+=32){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m ");
        }
        System.out.println();
      }
      System.out.println();
    }
      System.out.println(" \u001b[0m I have reset the colors.");
      System.out.println("\u001b[1;4;38;2;200;10;255m lots of settings here");
	  makeBubble(7);
	  System.out.println();
	  makeBubble(10);
	  System.out.println();
	  for(int i = 0; i < 10; i++){
		  makeBubble((int)(Math.random() * 11) + 6);
		  System.out.println("\u001b[0m");
		  sleep(500);
		  System.out.println(CLEAR_SCREEN);
	  }
	  
	//System.out.println("\u001b[0m");
  }
}
