package Paskaita5;

import java.io.*;

/**
 * Created by acmenukas on 2017-04-10.
 */

// Faile surašyti žmonių vardai. Parašyti programą kuri juos nuskaitytų ir atvaizduotų ekrane.


public class uzdavinys1_18 {
    public static void main (String[] args) {
        //galima viska parasyti vienoje eiluteje
        // BufferedReader bf = new BufferedReader(new FileReader(new File("Persons.txt"))));

        try{
            //sukuriamas failas
            File file = new File("Persons.txt");
            //sukuriamas faile reader objektas
            FileReader fileReader = new FileReader(file);
            //sukuriamas buffered reader
            BufferedReader bf = new BufferedReader(fileReader);
            String line = null;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
        System.out.println("Failas nerastas");
        }catch (IOException e){
        System.out.println("Nenuskaite failo");
    }
}
}
