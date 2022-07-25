public class MergeSortedArray {
    private int m ;
    private int n;
    private int[] array1 = new int [m+n];
    private int [] array2 = new int [n];
    MergeSortedArray(int[] array1, int m, int[] array2, int n)
    {
        this.m = m ;
        this.n = n ;
        this.array1 = array1 ;
        this.array2 = array2 ;
    }
    void methodExcute()
    {
        // xet mang array 2 de merge
       for(int i = 0 ; i < array2.length ; i++)
       {
            // trien khai merge array
            insertElementArray(array2[i],array1,m);
            // sau khai merge tang kich thuoc m 
            m++;
        }
       for(int i = 0; i < array1.length; i++)
       {
            System.out.println(array1[i]);
       }
    }
    void insertElementArray(int el,int arr [],int m)
    {
        // xet phan tu trong array 1
        // phan tu nao lon dau tien thi chen truoc no  
        boolean flagFindPosition = false;
        for(int i = 0; i < m; i++)
        {
            if(arr[i] > el)
            {
                flagFindPosition= true;
                // lui mang
                for(int j = m-1 ; j >= i;j--)
                {
                    arr[j+1] = arr[j];
                }
                arr[i]=el;
                break;
            }

            if(flagFindPosition == false)
            {
                arr[m] = el;
            }
        }        
    }

    // ky thuat su dung 2 con tro 
    void mergeSortArray(int [] n1 , int m , int [] n2 , int n )
    {
        int sumArray = m + n ;
        int k = sumArray -1 ;
        int i =  m-1;
        int j = n-1;
        // k dang o cuoi phan tu trong tong mang 
        //   i la phan tu cuoi  mang n1
        // j la phan tu cuoi trong mang n2
        while(k >=0 )
        {
            if(j < 0)
            {
                n1[k] = n1[i];
                i--;
            }
            else
            if(i < 0)
            {
                n1[k] = n2[j];
                j--;
            }
            else if(n1[i] > n2[j])
            {
                n1[k]= n1[i];
                i--;
            }
            else` if(n1[i] <= n2[j]){
                n1[k] = n2[j];
                j--;
            }
            k++;
        }

    }
}

