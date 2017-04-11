package Paskaita6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acmenukas on 2017-04-11.
 */

//Sukurti naują ArrayList kolekciją, pridėti 5 vartotojų vardus ir juos atspausdinti,
// jei vardo ilgis ilgesnis nei 6 simboliai. Rezultatus spausdinti ekrane naudojant for ciklą.

//  Naudojant sukurtą kolekciją parašyti du metodus. Pirmas grąžina pirmą list`o elementą,
// o antras metodas paskutinį. Rezultatus spausdinti ekrane.

public class Uzdavinys1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Andrius");
        names.add("Onute");
        names.add("Jonas");
        names.add("Petriukas");
        names.add("Maryte");

        System.out.println("Pirmas elementas " + pirmas(names));
        System.out.println("Antras elementas " + paskutinis(names));

        for (String name : names){
            if (name.length()>6) {
                System.out.println(name);
            }
        }
    }
    private static String pirmas (List<String> petras){
        return petras.get(0);
    }
    private static String paskutinis (List<String> jonas){
        return jonas.get(jonas.size()-1);
    }
}
