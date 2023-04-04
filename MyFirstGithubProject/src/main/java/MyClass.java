public class MyClass {
   public static void main(String[] args)
    {
        printHelloWorld();

    }
    public static void printHelloWorld() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("hello World");
        }
        int[] a = {1, 2, 3, 4};
        //int arrlength = a.length;
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1)
                System.out.println(a[i]);
        }
        String str = "Hyderabad Bangalore";
        String str1 = str.substring(3, 10);
        System.out.println(str.substring(3, 13));
        System.out.println(str.charAt(3));
        int[] d = {3, 4, 3, 0};
        String[] strArr = {"this", "is", "mehtab"};
        char[] charArr = {'a', 'v'};
        String someStr = "Kanpur";
        String s = someStr.substring(0,3);
        System.out.println(s + s + s);
        for(int k =0;k<=3;k++)
        {
            System.out.println(s);
        }
        String otherString = "kanpur";
        System.out.println(someStr.equalsIgnoreCase(otherString));

    }
}
