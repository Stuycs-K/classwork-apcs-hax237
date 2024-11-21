import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class adventOfCode4{
    public static int sumSector(String filename){
        //A room is real (not a decoy) if the checksum is the five most common letters 
        //in the encrypted name, in order, with ties broken by alphabetization. 
        try{
            File file = new File (filename);
            Scanner input = new Scanner (file);

            int sum = 0;

            while (input.hasNextLine()){
                String[] data = input.nextLine().split("-");
                //System.out.println(Arrays.toString(data));
                String sectorCheck = data[data.length - 1];
                int sectorID = Integer.valueOf(sectorCheck.substring(0, 3));
                String checksum = sectorCheck.substring(4, 9);
                //System.out.println(sectorID);
                //System.out.println(checksum);

                ArrayList<String> Letter = new ArrayList<String>();
                ArrayList<Integer> count = new ArrayList<Integer>();

                //fillinh in arraylists
                for(int str = 0; str < data.length - 1; str++){
                    String text = data[str];
                    for(int i = 0; i < text.length(); i++){
                        String letter = text.substring(i, i + 1);
                        int index = Letter.indexOf(letter);
                        if (index == -1){
                            Letter.add(letter);
                            count.add(1);
                        }
                        else{
                            //add one to existing
                            count.set(index, count.get(index) + 1);
                        }
                    }
                }
                //compare checksum with values in arraylists
                //for each value in checksum, look through counts to see if its the greatest
                //if it is, remove both letter and count of value from arraylists 
                //continue with next value in checksum
                for (int i = 0; i < 5; i++){
                    int greatestIndex = 0;
                }
                System.out.println(Letter);
                System.out.println(count);
            }

            input.close();
            return sum;
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            return -100;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hi".compareTo("He"));
        sumSector("encrypt.txt");
    }
}