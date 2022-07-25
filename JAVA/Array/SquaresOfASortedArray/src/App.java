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
        for(int k = 0 ; k< nums.length;k++)
        {
            for(int j = k+1 ;  j < nums.length; j++)
            {
                int swap = 0; 
                if(nums[k]>nums[j])
                {
                    swap = nums[k];
                    nums[k] =  nums[j];
                    nums[j] = swap;
                }
            }
        }
    
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
