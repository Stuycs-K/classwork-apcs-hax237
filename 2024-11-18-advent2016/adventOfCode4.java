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
                String sectorCheck = data[data.length - 1];
                int sectorID = Integer.valueOf(sectorCheck.substring(0, 3));
                String checksum = sectorCheck.substring(4, 9);

                ArrayList<String> Letters = new ArrayList<String>();
                ArrayList<Integer> count = new ArrayList<Integer>();
                ArrayList<String> dataList = new ArrayList<>();

                for (int i = 0; i < data.length-1; i++){
                    for (int x = 0; x < data[i].length(); x++){
                        dataList.add(data[i].substring(x, x + 1));
                    }
                }
                System.out.println(dataList);

                //System.out.println(Arrays.toString(data));
                //filling in arraylists
                for(int str = 0; str < data.length - 1; str++){
                    String text = data[str];
                    for(int i = 0; i < text.length(); i++){
                        String letter = text.substring(i, i + 1); //MOD LETTER
                        //System.out.println(letter);
                        //letter = decrypt(letter, sectorID);
                        //System.out.println(letter);
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
                

                //decrypt(Letters, sectorID);
                String correctChecksum = "";
                //get correct checksum
                for (int i = 0; i < 5; i ++){
                    correctChecksum += Letters.get(i);
                }
                System.out.println(correctChecksum);
                if(checksum.equals(correctChecksum)){
                    System.out.println(Arrays.toString(data));
                    System.out.println("B4 DECRYPT: "+Letters);
                    System.out.println("REAL ROOM!" + "\n");
                    sum+= sectorID;
                    //decrypt(dataList, sectorID);
                    System.out.println("\npost: "+decrypt(dataList, sectorID));
                }  
            }
            input.close();
            
            return sum;
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            return -100;
        }
    }

    public static ArrayList<String> sort(ArrayList<String> letters, ArrayList<Integer> count){
        //ORGANIZE FROM MAX TO MIN
        for (int iter = count.size(); iter > 0; iter--){
            int greatest = count.get(0);
            int grIndex = 0;
            for (int i = 1; i < iter; i++){
                if (greatest < count.get(i)){
                    greatest = count.get(i);
                    grIndex = i;
                }
            }
            count.add(greatest);
            letters.add(letters.get(grIndex));
            count.remove(grIndex);
            letters.remove(grIndex);

        }

        //REORGANIZES ACCORDING TO ASCII VALUES
        for(int iter = 0; iter <= letters.size(); iter++){
            for (int i = 0; i < letters.size() -1; i++){
                if (count.get(i) == count.get(i + 1)){
                    if (letters.get(i).compareTo(letters.get(i+1)) > 0){
                        String original = letters.set(i, letters.get(i+1));
                        letters.set(i + 1, original);
                    }
                }
            }
        }
        return letters;
    }

    public static ArrayList<String> decrypt(ArrayList<String> Letters, int sectorID){

        for (int i = 0; i < Letters.size(); i++){
            int copySector = sectorID;
            String letter = Letters.get(i);
            //System.out.println("current letter: "+ letter);
            char newChar = letter.charAt(0);
            //System.out.println("current char: " + newChar);
            while (copySector > 0){
                if (newChar == 122){
                    //System.out.println("this letter has been reset to a: " + letter);
                    letter = "a";
                    newChar = letter.charAt(0);
                }
                else{
                    newChar++;
                    //System.out.println("shift forward 1, newChar = "+newChar);
                    letter = Character.toString(newChar);
                    //System.out.println(letter);
                }
                copySector--;
            }
            Letters.set(i, letter);
        }
        //System.out.println(Letters);
        return Letters;
    }

    public static void main(String[] args) {
        System.out.println(sumSector("encrypt.txt"));
    }
}