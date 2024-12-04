public class ColorDemo {
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static int BLACK = 30;
  public static int RED = 31;

  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void go(int r,int c){
    System.out.print("\u001b[" + r + ";" + c + "f");
  }

  public static void color(int foreground, int background, int modifier){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
  }
  public static void main(String[] args) {
    System.out.print("\u001b[31m");
    System.out.println("Hello World");
    System.out.print("\u001b[0m");

    //System.out.println('\n');

    System.out.print("\u001b[31mRed");
    System.out.print(" fish ");
    System.out.print("\u001b[34mBlue");
    System.out.print(" fish ");
    System.out.print(" also blue because no reset... also your terminal is blue now too...");

    System.out.print("\u001b[31mRed fish");
    System.out.print(" \u001b[0mfish ");
    System.out.print("\u001b[34mBlue");
    System.out.print(" \u001b[0mfish ");

    //System.out.print("\u001b[1;4;31;103m");
    //System.out.print("bold underlined inverted");
    //System.out.print(" \u001b[0m");


    System.out.println('\n');
    for(int r = 0; r < 256; r+=32){
      for(int g = 0; g <= 256; g+=32){
        for(int b = 0; b <= 256; b+=32){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
        System.out.println();
    }

    System.out.print(HIDE_CURSOR);
    color(RED, BLACK);
    System.out.print("spider");
    go(20, 8);
    System.out.print("NOOOOOOO");

    /*
    for (int i = 0; i <= 100; i++) {
      go(38, 15);
      System.out.print("Progress: " + i + "%");
      try {
          Thread.sleep(50); 
      } catch (InterruptedException e) {
          System.err.println("Thread was interrupted: " + e.getMessage());
      }
    }
      */

    System.out.println(CLEAR_SCREEN);

    int centerX = 40; // Center row
    int centerY = 40; // Center column
    int radius = 20;  // Radius of the circle

    for (double theta = 0; theta < 2 * Math.PI; theta += 0.1) {
        int row = (int) Math.round(centerX + radius * Math.sin(theta));
        int column = (int) Math.round(centerY + radius * Math.cos(theta));

        go(row, column);
        System.out.print("\u001b[38;2;" + 150 + ";" + 0 + ";" + 70 + "m."); 

        try {
            Thread.sleep(50); 
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted: " + e.getMessage());
        }
    }

    // Reset the cursor color to default
    System.out.print("\u001b[0m");
    //return to default
    //System.out.print(" \u001b[0m ");
  }
}
