import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args)
    {
        Map<Integer,String> myMap = new HashMap<Integer,String>();
        myMap.put(1,"mehtab");
        myMap.put(2,"sultana");
        System.out.println(myMap.get(1));
        Map<String,String> myStringMap = new HashMap<String,String>();
        myStringMap.put("telugu","dasara");
        myStringMap.put("hindi","patan");
        System.out.println(myStringMap);
        System.out.println(myStringMap.get("hindi"));
        System.out.println(myStringMap.get("telugu"));
        Set<String> mySet = new HashSet<String>();
        mySet.add("lion");
        mySet.add("tiger");
        mySet.add("dove");

        System.out.println(mySet);






    }
}
