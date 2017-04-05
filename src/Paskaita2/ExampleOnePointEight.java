package Paskaita2;

import java.util.Scanner;

/**
 * Created by acmenukas on 2017-04-05.
 */
public class ExampleOnePointEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite nuvaziuotus km");
        int km = sc.nextInt();

        System.out.println("Iveskite kuro sanaudas");
        int san = sc.nextInt();

        int vid = (san*100)/km;

        System.out.println("automobilis sunaudoja " + vid + " litru 100 km");
    }
}
