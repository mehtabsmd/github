 package daorepository;

import entitymodelpojo.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);
        List< Employee> employees = EmployeeDAO.getEmployees();
       // Collections.sort(employees,(o1,o2) -> (int)(o1.getSalary() - o2.getSalary()));
        employees.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).forEach(System.out::println);



     /*   Collections.sort(list);//ascending
        Collections.reverse(list);//descending
        System.out.println(list);
        list.stream().sorted().forEach(s->System.out.println(s));//ascending
        list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));//descending */

    }

}
