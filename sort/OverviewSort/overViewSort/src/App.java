public class App {
    public  static int [] insertionSort(int [] nums)
    {
        for(int i = 1 ;  i < nums.length ; i++)
        {
            int ai = nums[i];
            int j = i - 1 ;
            while( j >= 0 && nums[j] > ai)
            {
                nums[j+1] = nums[j];
                j--;
            } 
            nums[j+1] = ai;
        }
        return nums;
    }

    public static int [] bubleSort (int [] nums)
    {
       for(int i = 0 ; i < nums.length ; i++)
       {
        boolean isSorted = true ;
        for(int j= 0; j < nums.length-i-1 ; j++)
        {
            if(nums[j] > nums[j+1])
            {
                isSorted = false;
                int swap = nums[j+1];
                 nums[j+1] = nums[j];
                nums[j] = swap;
            }
        }
        if(isSorted== true){
            break;
        }
       }
       return nums;
    }
    
    public static void printArray(int [] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        int [] b = {1,2,4,6,2};
        printArray(bubleSort(b));
        
    }
}
