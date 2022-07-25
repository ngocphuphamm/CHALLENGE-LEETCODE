public class App {
    //https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
    public int removeDuplicates(int[] nums) {
        int i = 0 ; 
        int curIndex = 0 ; 
        while(i < nums.length)
        {
            if(nums[i]!=nums[curIndex])
            {
                curIndex ++ ; 
                nums[curIndex] = nums[i];
               
            }
            i++;
        }

        return curIndex+1; 
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
