package service;

import entitymodelpojo.Customer;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args){
        Customer customer = new Customer(101,"john",null, Arrays.asList("123456","7890"));
     //   Optional<Object> emptyOptional = Optional.empty();
       // System.out.println(emptyOptional);
    //  Optional<String> ofOptional = Optional.of(customer.getEmail());
      //  System.out.println(ofOptional);
       Optional<String> ofNullableOptional = Optional.ofNullable(customer.getEmail());
    if(ofNullableOptional.isPresent())
    {
        System.out.println(ofNullableOptional.get());
    }
        //System.out.println(ofNullableOptional.orElseThrow(()->new IllegalArgumentException("email is not present")));
    }

}
