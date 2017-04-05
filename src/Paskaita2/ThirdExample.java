package Paskaita2;

import java.util.Scanner;

/**
 * Created by acmenukas on 2017-04-05.
 */
public class ThirdExample {
    public static void main(String[] args) { //susikuriam
        Scanner sc = new Scanner(System.in);       // sukuriame skaneri

        System.out.println("Please insert your kg"); //paprasom ivesti svori

        double kg = sc.nextDouble();   //nuskanuoja ir isveda ivesta svori

        System.out.println("Please insert yout height cm"); //paprasom ivesti ugi

        double m = sc.nextDouble();

        double kmi = kg/(m*m);

        System.out.println("KMI yra >>" + kmi);

    }
}
