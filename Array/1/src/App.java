
//Max Consecutive Ones
/*https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3238/*/

public class App {
    public int findMaxConsecutiveOnes(int[] nums )
    {
       
        int ketqua =  1  ;
        int j = 0 ; 
        for ( int i  = 1 ;  i < nums.length ; i ++)
        {
            if(nums[i]!=nums[j])
            {
                ketqua = 0 ;
                j++;
                
            if(nums[i] == nums[j])
            {
               ketqua ++; 
            }
            }
            
            
        }
        return ketqua; 
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    }
}
