// squares of a Sorted Array
// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
public class App {
 
    public static int[] sortedSquares(int[] nums) {
        
        
        for(int i = 0 ; i< nums.length;i++)
        {
          
            nums[i]=  nums[i] * nums[i];
            
        }
        for(int i = 0 ; i< nums.length;i++)
        {
          
           System.out.println(nums[i]);
            
        }
        
        
       return nums;
     
    }
    public static void main(String[] args) throws Exception {
       int [] arr =  new int [] {1,2,3,4,5};
      int n [] =  sortedSquares(arr);
    
    }
}
