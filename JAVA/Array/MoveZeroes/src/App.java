public class App {
    //https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/
    public static void xuatmang(int [] arr )
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void moveZeroes(int[] nums) {
        int i = 0 ; 
        int curIndex = 0 ; 
        while(i < nums.length)
        {
            if(nums[i] != 0)
            {
                nums[curIndex]  = nums[i];
                curIndex++;
            }
            i++;
        
        }
        // phần curindex đã thay đổi tại vị trí đó ta cho không 
        for(;curIndex < nums.length;curIndex++)
        {
            nums[curIndex] = 0 ; 
        }

      
        xuatmang(nums);
      
    
    }
    public static void main(String[] args) throws Exception {
        int [] arr = new int [] {0,1,0,3,12};
         moveZeroes(arr);
   
        System.out.println("Hello, World!");
    }
}
