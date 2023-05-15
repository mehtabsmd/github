package comparator;

public class OtherMain {
    public static void main(String[] args) {
        int a = 2;
        if (a == 2)
            System.out.println("a is 2");
        else
            System.out.println("a is not 2");
        System.out.println(oddOrEven(3));
    }

    private static String oddOrEven(int n) {
        if (n % 2 == 0) {
            return "even";
        }
        return "odd";

    }
}