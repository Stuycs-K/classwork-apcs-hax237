public class words{
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if(remainingLetters > 0){
      for (int i = 0; i < alphabet.length(); i++){
        result = result+ makeWords(remainingLetters-1, result, alphabet);
      }
    }
    else{
      System.out.println(result);
    }
  }
  public static void main(String[] args) {
    makeWords(Integer.parseInt(args[0]), args[1], args[2]);
  }
}
