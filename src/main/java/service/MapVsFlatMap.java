package service;

import daorepository.EkartDataBase;
import entitymodelpojo.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args){
        List<Customer> customers = EkartDataBase.getAll();
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);
        List<String> phoneNumbers = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbers);
    }
}
