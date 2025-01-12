package dsa.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(5);
        set.add(4);

        for (int i : set) {
            System.out.println(i);
        }

        System.out.println(set.contains(69));

        set.remove(5);
    }

}
