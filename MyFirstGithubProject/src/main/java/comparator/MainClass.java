package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MainClass {

        public static void main(String[] args) {

            Student s1 = new Student(12, "Sunil");
            Student s2 = new Student(345, "Anil");
            Student s3 = new Student(23, "Kumar");

            List<Student> studentList = new ArrayList<>();

            studentList.add(s1);
            studentList.add(s2);
            studentList.add(s3);

            System.out.println(studentList);

            Collections.sort(studentList, new SortByName());

            System.out.println(studentList);
}
    }

