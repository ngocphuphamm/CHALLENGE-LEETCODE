public class App {
    // https://leetcode.com/problems/search-insert-position/
    public static int searchInsert(int[] nums, int target) {
        int currIndex =0 ;
        
        while(currIndex < nums.length)
        {
            if(nums[currIndex] == target) 
            {
              
                break;
            }
            if(nums[currIndex] > target)
            {
                break;
            }          
            currIndex++ ;
            
        }

        return currIndex;
    }
    public static void main(String[] args) throws Exception {
        int arr [] = {1,3,4,6};
        int index = searchInsert(arr,5);
        System.out.println(index); 

    }
}
