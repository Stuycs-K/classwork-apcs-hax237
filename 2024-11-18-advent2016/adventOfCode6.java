import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class adventOfCode6{
    public static String decodeMessage(String filename){
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int[][] counts = new int[8][26];
            String decodedMessage = "";

            while (input.hasNextLine()){
                String text = input.nextLine();
                for (int i = 0; i < text.length(); i++){
                    int ascii = (int)text.charAt(i);
                    counts[i][ascii - 97] += 1;
                }
                
            }

            for (int row =0; row < counts.length; row++){
                int least = counts[row][0];
                int indexleast = 0;
                for (int i = 0; i < 26; i++){
                    if (counts[row][i] < least){
                        least = counts[row][i];
                        indexleast = i;
                    }
                }
            String letter = Character.toString((char) (indexleast + 97));
            decodedMessage += letter;
            }
            input.close();
            return decodedMessage;
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println(decodeMessage("message.txt"));
        String hi = "hello";
        int ascii = (int)hi.charAt(1);
        //System.out.println(ascii);
    }
}