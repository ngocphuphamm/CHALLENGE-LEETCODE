public class App {
    // binary su dung loop
    public static boolean binarySearch(int [] arr ,int value)
    {
       int left = 0;
       int right = arr.length;
        while(left<right) {
            int mid = (left + right)/2;
            if(arr[mid]==value)
            {
                return true;
            }
            else if(arr[mid]>value)
            {
                right = arr[mid] -1;
            }
            else if(arr[mid]<value)
            {
                left = arr[mid] + 1;
            }

        }
        return false;
    }

    //de quy binarySearch
    public static int binarySearchRecursion(int [] arr , int value )
    {
        int n = arr.length;
        return binarySearchRecursion(arr,value,0,n-1);
    }

    public static int binarySearchRecursion(int [] arr , int value, int left , int right )
    {
        if(left > right)
            return -1;
        int mid = (left + right)/2;
        if(value == arr[mid])
            return arr[mid];
        else if(value < arr[mid])
            return binarySearchRecursion(arr, value,left,mid-1);
        else if(value > arr[mid])
            return binarySearchRecursion(arr, value,mid+1 ,right);
        return -1;
    }
    public static void main(String[] args) throws Exception {
        int [] arr = {1,3,4};

         boolean a =  binarySearch(arr,3);
        System.out.println(a);    
    }
}
