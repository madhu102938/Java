package dsa.vector;

import java.util.Comparator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<Vector<Integer>> vec = new Vector<Vector<Integer>>();
        for (int i = 0; i < 11; i+=2) {
            Vector<Integer> temp = new Vector<Integer>();
            temp.add(i);
            temp.add(i+1);
            vec.add(temp);
        }
 
        Comparator<Vector<Integer>> custom = new Comparator<Vector<Integer>>(){
            @Override
            public int compare(Vector<Integer> o1, Vector<Integer> o2) {
                return o2.get(1) - o1.get(1);
            }
        };

        System.out.println(vec);

        vec.sort(custom);

        System.out.println(vec);
    }
}
