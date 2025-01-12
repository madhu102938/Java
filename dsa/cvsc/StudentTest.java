package dsa.cvsc;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new Vector<>();
        
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 10));
        students.add(new Student("Charlie", 42));
        students.add(new Student("David", 23));

        Comparator<Student> custom = (o1, o2) -> (o1.getAge() < o2.getAge() ? -1 : 1);

        Collections.sort(students, custom);

        System.out.println(students);
    }
}
