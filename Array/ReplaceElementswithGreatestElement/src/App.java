public class App {
    // https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
    public static int[] replaceElements(int[] arr) {
        int n = arr.length - 1 ;
        for(int i = n; i >= 0 ; i-- )
        {
            if(i == n)
            {

            }
            else
            {
                arr[i] = Math.max(arr[i],arr[i+1]);
                
            }    
          }
        // rut lai 
        for(int i = 1 ; i < n ; i++ )
        {
            arr[i-1] = arr[i];
        }
        return arr ; 

    }
    public static void main(String[] args) throws Exception {
       int [] arr = new int [] {17,18,5,4,6,1};
       int [] a = replaceElements(arr);
       for(int i = 0 ; i < a.length ; i ++)
       {
           System.out.println(a[i]);
       }
    }
}
