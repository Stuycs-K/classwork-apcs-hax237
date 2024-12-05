public class Driver{
  public static void main(String[] args) {
    /*
    On the line below your random numbers, draw a horizontal separator (you can match your border's color, but use a differnet character.
    After you draw everything (including the next set of instructions), move your cursor to line 31 before your program exits, otherwise your terminal will draw over your screen.
*/  
    for (int row = 1; row < 31; row++){
      if (row == 1 || row == 30){
        for (int c = 1; c < 81; c++){
          Text.go(row, c);
          if (c % 2 == 0){
            Text.color(32);
          }
          else{
            Text.color(31);
          }
          System.out.print("*");
        }
      }
      if (row == 3){
        for (int c = 1; c < 81; c++){
          Text.go(row, c);
          Text.color(Text.BLUE);
          System.out.print("!");
        }
      }
      else{
        Text.go(row, 1);
        if (row % 2 == 0){
          Text.color(31);
        }
        else{
          Text.color(32);
        }
        System.out.print("*");
        Text.go(row, 80);
        if (row % 2 == 0){
          Text.color(32);
        }
        else{
          Text.color(31);
        }
        System.out.print("*");
      }
    }

    int[] arr = randArr();
    int filled = 0;
    for (int n: randArr()){
      if (n < 10){
        filled++;
      }
      else{
        filled +=2;
      }
    }
    filled = (80-filled)/4;

    for (int i = 0; i < arr.length; i++){
      Text.go(2, filled*(i+1) + 2);
      if(arr[i] < 25){
        Text.color(Text.RED + 60);
      }
      else if(arr[i] > 75){
        Text.color(Text.GREEN + 60);
      }
      else{
        Text.color(Text.WHITE);
      }
      System.out.print(arr[i]);
    }

    Text.go(31, 81);
    System.out.print(Text.RESET);
    //System.out.print(Text.CLEAR_SCREEN);
    
  }

  public static int[] randArr(){
    int[] random = new int[3];
    for (int i = 0; i < 3; i++){
      int num = (int) (100 * Math.random());
      random[i] = num;
    }
    return random;
  }

}
