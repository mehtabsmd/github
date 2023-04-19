package polymorphismpkg;

public class ExceptionExample {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        try{
            System.out.println(arr[10]);
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println(e);
        }
        System.out.println("hello world");
    }
}
