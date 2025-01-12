package dsa.cvsc;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student that) {
        // TODO Auto-generated method stub
        if (this.age < that.age)
            return -1;
        else
            return 1;
    }

    public static void main(String[] args) {
        List<Student> students = new Vector<>();
        
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 10));
        students.add(new Student("Charlie", 42));
        students.add(new Student("David", 23));

        Comparator<Student> custom = (o1, o2) -> (o1.getAge() < o2.getAge() ? -1 : 1);

        Collections.sort(students, custom);
        // Collections.sort(students); both will result the same as we implemented comparable :)

        System.out.println(students);
    }
}
