package Paskaita6;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by acmenukas on 2017-04-11.
 */
public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Jonas");
        names.add("Andrius");
        names.add("Jonas");
      printSet(names);
    }

    private static void printSet(Set<String> names){
       for (String name : names){
           System.out.println(name);
       }
    }
}
