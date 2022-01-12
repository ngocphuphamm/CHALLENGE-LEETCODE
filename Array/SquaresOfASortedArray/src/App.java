// squares of a Sorted Array
// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
public class App {
    public static void sort(int [] nums )
    {

    }
    public static int[] sortedSquares(int[] nums) {
        
      
        for(int i = 0 ; i< nums.length;i++)
        {
          
            nums[i]=  nums[i] * nums[i];
            
        }
       sort(nums);
        
        
       return nums;
     
    }
    public static void main(String[] args) throws Exception {
       int [] arr =  new int [] {1,2,3,4,5};
      int n [] =  sortedSquares(arr);
        sort(n);
        for(int i = 0 ; i < n.length ; i ++ )
        {
            System.out.println(n[i]);
        }
    }
}
