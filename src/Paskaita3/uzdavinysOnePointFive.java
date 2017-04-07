package Paskaita3;

import java.util.Scanner;

/**
 * Created by acmenukas on 2017-04-07.
 */

//  Parašyti programą, kuri paprašytų įvesti 5 skaičius. Baigus skaičių įvedimą,
// turi būti atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai.

public class uzdavinysOnePointFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] mas = new int[5];
        int suma = 0;

        for (int i=1; i <= mas.length; i++){
            System.out.println("Iveskite "+ i +" skaiciu");
            int skaicius = sc.nextInt();
            mas[i-1]= skaicius;
            suma = suma + skaicius;


        }System.out.println("Ivestu skaiciu suma yra " + suma);
        for (int i=0; i < mas.length; i++){
            System.out.print(mas[i]+" ");
        }



    }
}
