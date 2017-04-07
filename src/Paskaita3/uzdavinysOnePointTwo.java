package Paskaita3;

import java.util.Scanner;

/**
 * Created by acmenukas on 2017-04-06.
 */

//  Parašyti programą kuri paprašytų vartotojo įvesti žodį ir jį iš karto atvaizduotų,
// tada vėl paprašytų įvesti kitą žodį, jį atvaizduotų, ir procesą kartotų tol, kol nebus įvestas žodis „pabaiga“.

public class uzdavinysOnePointTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Iveskite zodi");
            String zodis = sc.nextLine();
            if (zodis.equals("pabaiga")) {
                break;
            }
                System.out.println(zodis);

        }

    }
}
