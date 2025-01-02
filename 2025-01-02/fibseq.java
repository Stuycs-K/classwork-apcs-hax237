public class fibseq{
  public static int fib(int n){
    if (n < 2){
      return n;
    }
    else{
      return fib(n -1) + fib(n - 2);
    }
  }
  public static void main(String[] args){
    System.out.println(fib(Integer.parseInt(args[0])));
  }
  //46 finishes in under 10 secs
}
