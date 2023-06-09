package daorepository;

import entitymodelpojo.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(60, "mehtab", "ECE", 90000));
        list.add(new Employee(61, "sanjana", "ECE", 50000));
        list.add(new Employee(62, "sarwath", "IT", 80000));
        list.add(new Employee(63, "shruthi", "EEE", 70000));
        list.add(new Employee(64, "sarath", "CSE", 60000));
        return list;
    }


}
