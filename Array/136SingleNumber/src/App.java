import java.util.HashMap;
import java.util.Map;

public class App {
   //https://leetcode.com/problems/single-number/
    public static int singleNumber(int[] nums) {
       int [] arr = new int[nums.length];
       for(int i = 0; i < nums.length; i++)
       {
            arr[nums[i]] +=1;
       } 
       for(int i = 0; i < arr.length; i++)
       {
            if(arr[i]==1)
            {
                return i;
            }
       }  
       return -1;
    }
    
    // hashMap 
    public static int singleNumberHashMap(int [] nums)
    {
        HashMap<Integer,Integer> nums_frequencies = new HashMap();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(!nums_frequencies.containsKey(nums[i]))
            {
                nums_frequencies.put(nums[i],1);
            }
            else
            {
              
                nums_frequencies.put(nums[i],nums_frequencies.get(nums[i]) +1 );
            }
        }

        for(Map.Entry<Integer, Integer> entry : nums_frequencies.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value == 1)
            {
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        int [] arr = {4,1,2,1,2};
        int number = singleNumberHashMap(arr);
    }
}
