import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static int majorityElement(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int [] arr = new int [max + 1 ];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] += 1 ;
        }
        int maxNumber = -1 ;
        int maxIndex = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]> maxNumber)
            {
                maxNumber = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int majorityElement2(int[] nums) {
        int counter = 1 ; 
        int candidate = nums[0];
        for(int i = 1 ; i < nums.length ; i ++)
        {
            if(counter == 0 )
            {
                candidate = nums[i]; 
            }
            if(candidate == nums[i])
            {
                counter++;
            }
            else
            {
                counter--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) throws Exception {
         int [] arr = {1,2,2,1,2};
         int number = majorityElement2(arr);
        System.out.println(number);
    }
}
