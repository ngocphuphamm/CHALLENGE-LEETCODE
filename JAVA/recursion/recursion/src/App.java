public class App {
    // phan loai de quy
    /* 
     * de quy  thuc hien cong viec truoc 
     * de quy thuc hien cong viec sau 
     */
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

    // toi uu de quyA
    // de quy co nho 
    static int [] F = new int [1000];
    public static int fibo2(int n)
    {
      if(F[n] != 0 )
      {
        return F[n];
      }
      if(n <= 2 )
      { 
        F[1] = 1;
        F[2] = 1; 
        return 1;
       }
       return F[n] =fibo2(n-1) + fibo2(n-2);
    }

    public static void printElement(int [] arr , int index)
    {
        // bai toan co so 
        if(index < 0 || index >= arr.length)
            return ;
        // cong thuc quy nap

        // sau khi de quy moi in ra 
        // thi no se tu  phai sang trai
        // tha stack ra 
       // printElement(arr, index+1);
        // System.out.println(arr[index]);


        // truoc khi de quy in ra 
        // tu trai sang phai 
        System.out.println(arr[index]);
        printElement(arr, index+1);
    }

    
    public static void main(String[] args) throws Exception {
        System.out.println(giaiThua(4));
        System.out.println(fibonacci(4));

        int arr [] = {1,2};
         printElement(arr,0);
    }
}
