package Paskaita6;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by acmenukas on 2017-04-11.
 */
public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        //idejimas i map'a
        map.put(1, "Jonas");
        map.put(123, "Andrius");
        map.put(2, "Jonas");
        map.put(123, "Kazys");

        for (Integer m : map.keySet()){
            System.out.println(map.get(m));
        }

    }
}
