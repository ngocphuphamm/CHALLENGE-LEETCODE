public class App {
    public static int giaiThua(int n )
    {
        // bai toan co so
        if(n==0)
            return 1;
        
            // cong thuc quy nap
          return  n = n * giaiThua(n-1);
    }
    public static int fibonacci(int n )
    {
        // bai toan co so
        if(n <= 2)
            return 1;
        // cong thuc quy nap
        return n = fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) throws Exception {
        System.out.println(giaiThua(4));
        System.out.println(fibonacci(4));
    }
}
