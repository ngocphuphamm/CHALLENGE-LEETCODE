public class App {
    public static int  dominantIndex(int[] nums) {
        int maxNumber = -1 ;
        int maxSecondNumber = -1 ;
        int maxIndex = -1; 
        for(int i=0 ; i < nums.length ; i++) {
            if(nums[i] > maxNumber )
            {
                int sentinel = maxNumber;
                maxNumber = nums[i];
                maxIndex = i;
                if(maxNumber > sentinel)
                {
                    maxSecondNumber = sentinel;
                }
            }
            else
            {
                if(nums[i] > maxSecondNumber)
                {
                    maxSecondNumber = nums[i];
                }
            }
        }    
        System.out.println(maxNumber);
        System.out.println(maxSecondNumber);
        if(maxNumber >= maxSecondNumber *2)
        {
            return maxIndex;
        }
        return 0;   
    }
    public static void main(String[] args) throws Exception {
        int [] arr = {1,4,3,2};
        int number = dominantIndex(arr);
       
    }
}
