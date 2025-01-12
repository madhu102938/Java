package dsa.map;

import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer>mp = new TreeMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);
        mp.put("d", 4);

        System.out.println(mp);

        System.out.println(mp.get("a"));

        System.out.println(mp.containsKey("b"));

        System.out.println(mp.containsValue(5));

        mp.remove("c");

        System.out.println(mp.containsKey("c"));

        System.out.println(mp);

        System.out.println(mp.keySet());

        for (String key : mp.keySet()) {
            System.out.println(key + " " + mp.get(key));
        }
    }
}
