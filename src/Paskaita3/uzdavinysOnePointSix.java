package Paskaita3;

import java.util.Scanner;

/**
 * Created by acmenukas on 2017-04-07.
 */

// Parašyti programą kuri paprašytų vartotojo įvesti  5 žodžius.
// Po to kai bus įvesti visi žodžiai, jie turi būti atvaizduojami.

public class uzdavinysOnePointSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[]mas = new String[5];

        for (int i = 1; i <= mas.length; i++){
            System.out.println("Iveskite " + i + " zodi");
            String zodis = sc.nextLine();
            mas [i-1] = zodis;

        }for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }
}
