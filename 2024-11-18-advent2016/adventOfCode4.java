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
                System.out.println(Letters);
                System.out.println(count);

                System.out.println(sort(Letters, count));

                String correctChecksum = "";

                //get correct checksum
                for (int i = 0; i < 5; i ++){
                    correctChecksum += Letters.get(i);
                }
                System.out.println("after sorting by alphabet");
                System.out.println(Letters);
                System.out.println(count);
                System.out.println(correctChecksum);
                System.out.println(checksum);

                if(checksum.equals(correctChecksum)){
                    System.out.println("REAL ROOM!" + "\n");
                    sum+= sectorID;
                }
                
            }

            input.close();
            System.out.println(sum);
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
        for (int iter = count.size(); iter > 0; iter--){
            int greatest = count.get(0);
            int grIndex = 0;
            for (int i = 1; i < iter; i++){
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
            System.out.println(count);
            System.out.println(letters);
        }
        System.out.println("after sorting by count");
        System.out.println(count);
        System.out.println(letters);

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
        /*
[shoewudys, rkddo, qdqboiyi, 530[doiqs]]
[s, h, o, e, w, u, d, y, r, k, q, b, i]
[2, 1, 3, 1, 1, 1, 4, 2, 1, 1, 2, 1, 2]
after sorting by count
[4, 3, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1]
[d, o, s, y, q, h, e, w, u, r, k, b, i]
[d, o, q, s, y, b, e, h, i, k, r, u, w]
after sorting by alphabet
[d, o, q, s, y, b, e, h, i, k, r, u, w]
[4, 3, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1]
doqsy
doiqs

         */
        System.out.println("Hi".compareTo("He"));
        sumSector("encrypt.txt");
    }
}