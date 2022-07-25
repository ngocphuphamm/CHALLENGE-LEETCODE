import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i  < nums.length-2; i++) {
            System.out.println(nums[i]);
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        return result;
    }
    public static int removeDuplicates(int[] nums) {
        int curIndex = 0;
        int j = 0 ;
        while(j < nums.length)
        {
            if(j == 0)
            {
                nums[curIndex] = nums[j];
                
            }
            if(nums[curIndex]!= nums[j])
            {
                curIndex++;
                nums[curIndex] = nums[j];
                
            }
            j++;
        }
        return  curIndex + 1;
    }

    public static boolean isPalindrome(int x) {
        // chia het cho 10 lay so cuoi 
        // chia du lay cac so con lai tru so cuoi 
       if(x == 0)
       {
        return true;
       }
       
       if(x < 0 || x % 10 == 0)
       {
            return false;
       }
       int reversed_int = 0;
       while(x > reversed_int)
       {
            // chia het(%) cho 10 lay so cuoi 
            int pop = x % 10;
            x /= 10;

            reversed_int = (reversed_int * 10) + pop;
       }
       // neu la 2 so thi se ra bang nhau 
       if(x == reversed_int || x == reversed_int/10)
       {
        return true;
       }

       return false;
    }
    public static void main(String[] args) throws Exception {
         int a = 1221;
         boolean b = isPalindrome(a);

    }
}
