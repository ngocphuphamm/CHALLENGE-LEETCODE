
//Max Consecutive Ones
/*https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3238/*/

public class App {
    public int findMaxConsecutiveOnes(int[] nums )
    {
       
       int ketqua = 0 ; 
       int max = 0 ; 
       for(int i = 0 ; i < nums.length ; i++)
       {
           if(nums[i] == 0 )
           {
               ketqua = 0 ; 
           }
           else
           {
                ketqua ++ ; 
                max = Math.max(max,ketqua);
           }
       }
       return max ;
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    }
}
