import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(1);
        mylist.add(3);
        mylist.add(5);
        mylist.add(7);
        System.out.println(mylist.get(1));
        System.out.println(mylist.get(0));
        System.out.println(mylist.size());
        System.out.println(mylist);
        int[] a ={1,2,3,4};
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
    }
}
