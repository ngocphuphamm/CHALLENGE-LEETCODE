//https://leetcode.com/problems/third-maximum-number/
public class App {
    public  static void insert(int [] arr, int value)
    {
        int k = 0 ;
        while(k < arr.length)
        {
            if(arr[k] == value)
            {
                return ;
            }
            else if(arr[k] < value)
            {
                break;
            }
            else
            {
                k++;
            }
        }
        if(k<arr.length)
        {
            for(int i = arr.length-2 ; i >= k; i--)
            {
                arr[i+1] = arr[i];
            }
            arr[k] = value;
        }

    }
    public static int [] thirdMax(int[] nums) {
        int [] arrMast3Number = new int [3];
        for(int i = 0; i < nums.length; i++)
        {
            insert(arrMast3Number,nums[i]);
        }
        return arrMast3Number;

    }
    public static void printArray(int [] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        int [] b = {1,5,4,6,2};
        printArray(thirdMax(b));
    }  
}
