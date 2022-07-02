public class MergeSortedArray {
    private int m ;
    private int n;
    private int[] array1 = new int [m];
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
       for(int i = 0; i < array2.length; i++)
       {
            insertElementArray(array2[i],array1,m);
            m++;
       }
       for(int i = 0; i < array1.length; i++)
       {
            System.out.println(array1[i]);
       }
    }
    void insertElementArray(int el,int arr [],int m)
    {
        boolean timDuocViTri = false;
        for(int i = 0 ; i < m ; i++)
        {
            if(arr[i]> el)
            {
                timDuocViTri=  true ;
                // lui phan tu
                for(int j = m -1 ;j>=i; j-- )
                {
                    arr[j+1] = arr[j];
                }
                arr[i] = el;
                break;
            }
            
            if(timDuocViTri == false)
            {
                arr[m] = el;
            }
        }
        
    }
}

