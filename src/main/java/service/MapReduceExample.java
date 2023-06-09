package service;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(3,4,5,6,7);
        List<String> words = Arrays.asList("corejava","restapi","spring");
        int sum = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
        Integer reducesum = numbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println(reducesum);
       String longestString =  words.stream().reduce((word1,word2)-> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestString);
    }
}
