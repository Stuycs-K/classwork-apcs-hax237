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
                System.out.println(Arrays.toString(data));
                System.out.println("");
                String sectorCheck = data[data.length - 1];
                int sectorID = Integer.valueOf(sectorCheck.substring(0, 3));
                String checksum = sectorCheck.substring(4, 9);
                //System.out.println(sectorID);
                //System.out.println(checksum);

                ArrayList<String> Letters = new ArrayList<String>();
                ArrayList<Integer> count = new ArrayList<Integer>();

                //fillinh in arraylists
                for(int str = 0; str < data.length - 1; str++){
                    String text = data[str];
                    for(int i = 0; i < text.length(); i++){
                        String letter = text.substring(i, i + 1);
                        int index = Letters.indexOf(letter);
                        if (index == -1){
                            Letters.add(letter);
                            count.add(1);
                        }
                        else{
                            //add one to existing
                            count.set(index, count.get(index) + 1);
                        }
                    }
                }
                sort(Letters, count);
            }

            input.close();
            return sum;
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            return -100;
        }
    }

    public static ArrayList<String> sort(ArrayList<String> letters, ArrayList<Integer> count){
        //System.out.println(count);
        //System.out.println(letters);

        //ORGANIZE FROM MAX TO MIN
        for (int iter = count.size() - 1; iter >= 0; iter--){
            int greatest = 1;
            int grIndex = 0;
            for (int i = 0; i < iter; i++){
                if (greatest < count.get(i)){
                    greatest = count.get(i);
                    grIndex = i;
                }
            }
            //System.out.println("the greatest number: "+ greatest);
            //System.out.println("index of the greatest number: "+grIndex);
            count.add(greatest);
            letters.add(letters.get(grIndex));
            count.remove(grIndex);
            letters.remove(grIndex);

        //System.out.println(count);
        //System.out.println(letters);
        }

        //REORGANIZES ACCORDING TO ASCII VALUES
        //SMALLER VALS (earlier in alph) come first
        for(int iter = 0; iter <= letters.size(); iter++){
            for (int i = 0; i < letters.size() -1; i++){
                if (count.get(i) == count.get(i + 1)){
                    if (letters.get(i).compareTo(letters.get(i+1)) > 0){
                        //System.out.println(letters.get(i + 1) + " comes before " + letters.get(i));
                        String original = letters.set(i, letters.get(i+1));
                        letters.set(i + 1, original);
                        //System.out.println(letters);
                    }
                }
            }
        }
        //System.out.println(count);
        //System.out.println(letters);
        return letters;
    }

    public static void main(String[] args) {
        System.out.println("Hi".compareTo("He"));
        sumSector("encrypt.txt");
    }
}