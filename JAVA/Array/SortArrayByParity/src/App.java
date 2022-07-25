public class App {
    //https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
    public int[] sortArrayByParity(int[] nums) {
        int left =  0; 
        int right  =  nums.length-1 ; 
        int pivot = (left + right) / 2 ; 
        while(left <= right)
        {
            while(nums[left]<pivot)
            {
                left++; 
            }
            while(nums[right]>pivot)
            {
                right++; 
            }
        }

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
