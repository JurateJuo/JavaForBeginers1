package Paskaita3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by acmenukas on 2017-04-06.
 */

// Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0.
// Pabaigoje turi būti atvaizduojama įvestų skaičių suma.

// Papildykite 1.3. programą kuri neleistu įvesti ne skaičius, jei vartotojas
// įveda ne skaičių programa prašo pakartoti tol kol bus įvestas skaičius.


public class uzdavinysOnePointFree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;


        while (true){
            try {

                System.out.println("Iveskite skaiciu");
                int skaicius = sc.nextInt();
                if (skaicius != 0){
                    suma = suma + skaicius;
                }else {
                    System.out.println("ivestu skaiciu suma =" + suma);
                }

            }catch (InputMismatchException e){
                System.out.println("Juk prasiau ivesti skaiciu");
                sc.nextLine();
            }
            }



    }
}
