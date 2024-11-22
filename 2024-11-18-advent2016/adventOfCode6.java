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

            ArrayList<Integer> col1 = new ArrayList<Integer>(26);
            ArrayList<Integer> col2 = new ArrayList<Integer>(26);
            ArrayList<Integer> col3 = new ArrayList<Integer>(26);
            ArrayList<Integer> col4 = new ArrayList<Integer>(26);
            ArrayList<Integer> col5 = new ArrayList<Integer>(26);
            ArrayList<Integer> col6 = new ArrayList<Integer>(26);
            ArrayList<Integer> col7 = new ArrayList<Integer>(26);
            ArrayList<Integer> col8 = new ArrayList<Integer>(26);
            String decodedMessage = "";

            //arrlis for each column and add stuff to each
            while (input.hasNext()){
                String text = input.hasNext();
                for (int i = 0; i < text.length(); i++){
                    Int ascii = (int)input.charAt(i);
                    if (i = 0){
                        //97-ascii
                    }
                }
                
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            return null;
        }
        return "";
    }
    public static void main(String[] args) {
        decodeMessage(message.txt);
    }
}