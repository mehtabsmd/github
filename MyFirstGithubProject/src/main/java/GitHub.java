public class GitHub {
    public static void main(String[] args)
    {

       // System.out.println(canFly(true));
       // System.out.println(canFly(false));
        isEven(3);
    }
    public static int getProduct(int a,int b)
    {
        return a * b ;
    }
    public static boolean canFly(boolean hasWings) {
        if (hasWings == true) {
            return true;
        } else {
            return false;
        }
    }
        public static void isEven(int n)
        {
            if(n%2 == 1)
            {
                System.out.println("true");
            }
            else
                System.out.println("false");
                   // System.out.println("false");

        }
    }


