public class RecursionDemo {
    public static void main(String[] args) {
        int i = f(10);
        System.out.println(i);
    }

    public static int f(int n)
    {
        if(n == 1 || n == 0)
            return 1;
        else
            return n * f(n - 1);
    }
}
