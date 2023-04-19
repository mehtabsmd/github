package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExam {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8 ,9};
        int[] test = printArray(new int[]{1,2,3,4,5,6,7,8,9});
        System.out.println(Arrays.toString(test));

        List<String> mylist = new ArrayList<String>();
        mylist.add("sunil");
        mylist.add("mehtab");
        mylist.add("sanjana");
        printArrayList(mylist);

        printLastTwo("Javaclass");
    }

    public static int[] printArray(int[] nums)
    {
        int[] arr = new int[5];
        int j=0;
        for (int i = 0; i < nums.length; i = i + 2)
        {
            arr[j]=nums[i];
            j++;
        }
        return arr;
    }
    public static void printArrayList(List<String> mylist)
    {
        //System.out.println(Arrays.toString(mylist.toArray()));
        for(int i=0;i<mylist.size();i++)
        {
            System.out.println(mylist.get(i));
        }

    }
    public static void printLastTwo(String str)
    {
        System.out.println(str.substring(str.length()-2));
    }
}
