package Paskaita6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acmenukas on 2017-04-11.
 */
public class ListExample {
    public static void main(String[] args) {
        //sukursime list kolekcija
        List<String> names = new ArrayList<>();

        //idejimas i list

        names.add("Petras");
        names.add("Jonas");

        System.out.println(names.get(0));
        //tas zemiau nuo 8 javos
        //names.stream().forEach(System.out::println);

        for (String name : names){
            System.out.println(name);
        }
    }

}
