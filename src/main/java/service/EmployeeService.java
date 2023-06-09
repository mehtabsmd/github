package service;

import daorepository.EmployeeDAO;
import entitymodelpojo.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
public static void main(String[] args)
{
    System.out.println(evaluateTaxUsers("non tax"));
}

    private static List<Employee> evaluateTaxUsers(String input) {
    if(input.equalsIgnoreCase("non tax")) {
        return EmployeeDAO.getEmployees().stream().filter(employee -> employee.getSalary() > 50000).collect(Collectors.toList());
    }
    else{
        return EmployeeDAO.getEmployees().stream().filter(employee -> employee.getSalary() < 50000).collect(Collectors.toList());

    }

    }
}
