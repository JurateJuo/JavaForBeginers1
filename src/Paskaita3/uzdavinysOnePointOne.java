package Paskaita3;

import java.util.Scanner;

/**
 * Created by acmenukas on 2017-04-06.
 */


//Parašyti programą, kuri leistų vartotojui įvesti norimą skaičių ir po to parašytų ar
// šis skaičius yra lyginis, ar nelyginis. Užuomina panaudokite % operatoriu.



public class uzdavinysOnePointOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int skaicius = sc.nextInt();
        if (skaicius % 2 == 0) {
            System.out.println(skaicius + " lyginis");
        } else {
            System.out.println(skaicius + " nelyginis");
        }
    }
}
