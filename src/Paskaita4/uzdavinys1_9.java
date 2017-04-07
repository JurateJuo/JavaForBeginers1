package Paskaita4;

import java.util.Scanner;

/**
 * Created by acmenukas on 2017-04-07.
 */

//Sukurti supaprastintą skaičiuoklės programą kuri paprašytų įvesti du skaičius
// ir operacijos tarp jų  skaičių (1 – suma, 2 – skirtumas, 3 – sandauga).
// Gautą rezultatą programa pavaizduotų ekrane ir paklaustų ar norėsime kartoti.
// Įvedus skaičių 5, programa turėtų kartoti darbą iš naujo, priešingu atveju programa baigtų darbą.

public class uzdavinys1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double pirmasSkaicius = getCorrectNumber(sc);

        double antrasSkaicius = getCorrectNumber(sc);

        System.out.println("Iveskite komanda, pvz +; -; *; :");
        String komanda = sc.next();

        calculator(pirmasSkaicius, antrasSkaicius, komanda);

    }

    private static double getCorrectNumber (Scanner scanner) {
        while (true) {
            System.out.println("Iveskite skaiciu");
            try {
                double numb = scanner.nextDouble();
                return numb;
            } catch (Exception e) {
                System.out.println("ka tu darai ar mastai?");
                scanner.nextLine();

            }
        }
    }

    private static void calculator(double pirmasSkaicius, double antrasSkaicius, String komanda) {
        switch (komanda) {
            case "+":
                suma(pirmasSkaicius, antrasSkaicius);
                break;
            case "-":
                minus(pirmasSkaicius, antrasSkaicius);
                break;
            case "*":
                daugyba(pirmasSkaicius, antrasSkaicius);
                break;
            case ":":
                dalyba(pirmasSkaicius, antrasSkaicius);
                break;
            default:
                System.out.println("komanda nerasta!");
                break;

        }


    }

    public static void suma(double pirmasSkaicius, double antrasSkaicius) {
        System.out.println("suma yra:" + (pirmasSkaicius + antrasSkaicius));

    }

    public static void minus(double pirmasSkaicius, double antrasSkaicius) {
        System.out.println("skirtumas yra:" + (pirmasSkaicius - antrasSkaicius));

    }

    public static void daugyba(double pirmasSkaicius, double antrasSkaicius) {
        System.out.println("sandauga yra:" + (pirmasSkaicius * antrasSkaicius));

    }

    public static void dalyba(double pirmasSkaicius, double antrasSkaicius) {
        if (antrasSkaicius != 0) {
            System.out.println("dalyba yra:" + (pirmasSkaicius / antrasSkaicius));

        } else {
            System.out.println("Dalyba is nulio negalima!");
        }
    }
}