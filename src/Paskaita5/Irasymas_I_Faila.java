package Paskaita5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by acmenukas on 2017-04-10.
 */
public class Irasymas_I_Faila {
    public static void main(String[] args) {
        try {
            //true FileWrite'i nurodo, kad failas bus papildomas irasomu tekstu, jei nera true, tai viska istrins ir irasines per nauja
            //BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Persons.txt"), true));
            //failo rasymas viska istrynus ir irasant is naujo
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Persons.txt")));
            bw.newLine();
            bw.write("Benas");
            bw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
