//https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
public class App {
    public static void duplicateZeros(int[] arr) {
        
        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                // dịch các phần tử xuống 1 đơn vị 
                for(int j = arr.length-2 ; j >= i+1 ;j--)
                {
                    arr[j+1] = arr[j];
                    
                }
                arr[i+1]=0; 
                
                i++;
                
            }
        
        }
    }
    public static void main(String[] args) throws Exception {
        int [] arr = new int [] {1,0,2,3,0,4,5,0};
        duplicateZeros(arr); 
        for(int i = 0 ; i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
