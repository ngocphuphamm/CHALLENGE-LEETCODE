// https://leetcode.com/problems/remove-element/
public class App {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for(int i = 0; i < n;) {
            if(nums[i] == val)
            {
                // xoa phan tu 
                for(int j = i ; j <= (n-2);j++)
                {
                    nums[j] = nums[j + 1];
                }           
                // thu gon size cua mang 
                n--;
            }
            else
            {

                // i++ tranh truong hop 
                // khi thu gon tranh bo lophan tu van giong voi phan tu xoa 
                i++;
            }
        }
        return n;   
    }
    // ky thuat su dung 2 con tro 
    public static int removeElement2(int[] nums, int val){
        int k = 0 ;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[k] = nums[i];
                k++;
            }
      
        }
        return k ;
    }
    public static void main(String[] args) throws Exception {
        int [] nums = new int []{1,2,3,4,2 };
        int  n = removeElement(nums,3);
        
            System.out.println(n);
        
    }
}
