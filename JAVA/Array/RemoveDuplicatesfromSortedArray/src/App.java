public class App {
    // https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3258/
    public static int removeDuplicates(int[] nums) {
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
       int [] arr = new int [] {1,1,2};
       int a = removeDuplicates(arr);
       System.out.println(a);
        System.out.println("Hello, World!");
    }
}
