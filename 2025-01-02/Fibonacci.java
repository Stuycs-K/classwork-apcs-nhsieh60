public class Fibonacci{
  public static int fib(int n){
    if(n>1){
      return fib(n-1) + fib(n-2);
    }
    else{
      return n;
    }
  }

  public static void main(String[] args){
  /*  for(int i = 0; i < 10; i++){
      System.out.println(i + " " + fib(i));
    } */
    fib(Integer.parseInt(args[0])); //46
  }
}
