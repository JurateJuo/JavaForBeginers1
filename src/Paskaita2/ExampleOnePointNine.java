package Paskaita2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by acmenukas on 2017-04-05.
 */
public class ExampleOnePointNine {
    public static void main(String[] args) { //void naudojamas kai nereikia grazinti rezultato
        System.out.println("Vidutines kuro sanaudos: " +getAverage());
    }

    public static double getAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite km");
        double km = sc.nextDouble();
        System.out.println("iveskite l");
        double l = sc.nextDouble();
        return average(km, l);
    }

    public static double average(double km, double l) {
        return (l * 100) / km;
    }
}
