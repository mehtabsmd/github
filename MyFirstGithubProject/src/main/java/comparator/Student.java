package comparator;

import java.util.Comparator;

public class Student{

        private int rollNo;
        private String name;

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}
class SortByRollNo implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollNo()- o2.getRollNo();
    }
}
class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
