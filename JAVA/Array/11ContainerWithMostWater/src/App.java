public class App {
    ///https://leetcode.com/problems/container-with-most-water/submissions/
    public static int maxArea(int[] height) {
        int a_pointer = 0 ;
        int b_pointer = height.length -1 ;
        int maxArea = 0;
        while(a_pointer < b_pointer)
        {
            if(height[a_pointer] > height[b_pointer])
            {
                maxArea = Math.max(maxArea, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer --;
            }
            else
            {
                maxArea = Math.max(maxArea, height[a_pointer] * (b_pointer - a_pointer));
                
                a_pointer ++;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) throws Exception {
        int [] arr = {1,1};
        int a = maxArea(arr);
        System.out.println(a);
    }
}
