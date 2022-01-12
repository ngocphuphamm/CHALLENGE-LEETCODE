//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
public class App {
    public int removeElement(int[] nums, int val) {
        int i = 0 ; 
        int curIndex = 0 ; 
        while(i < nums.length)
        {
            if(nums[i]!=val)
            {
                nums[curIndex] = nums[i];
                curIndex ++ ; 
            }
            i++;
        }
        return curIndex; 
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
