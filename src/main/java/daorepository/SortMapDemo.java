package daorepository;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortMapDemo {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("eight",8);
        map.put("four",4);
        map.put("ten",10);
        map.put("two",2);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("***********");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

       // Collections.sort(map);
    }
}
