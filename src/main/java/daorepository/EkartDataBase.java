package daorepository;

import entitymodelpojo.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101,"john","john@gmail.com", Arrays.asList("123456","78965")),
                new Customer(102,"smith","smith@gmail.com", Arrays.asList("223456","88965")),
                new Customer(103,"peter","peter@gmail.com", Arrays.asList("323456","98965")),
                new Customer(104,"kely","kely@gmail.com", Arrays.asList("423456","108965"))).collect(Collectors.toList());

    }
}
