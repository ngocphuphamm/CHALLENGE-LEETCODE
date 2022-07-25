import java.util.Arrays;

public class App {
   
    public static int [] quickSort(int [] arr,int left , int right)
    {
        // bai toan co so khi dung de quy
        if(left >=right )
            return arr;
        // b1: chon khoa
        // tim key dau tien
        int elementPivot = arr[(left + right) / 2];

        // B2 : phan bo lai mang theo khoa 
        int k = patrition(arr,left,right,elementPivot);
        System.out.println("Left = " + left + " R= "+ right + "K = "+elementPivot+" k = " + k);
        
        // B3 : Chia doi mang => lap lai 
        quickSort(arr,left,k-1);
        quickSort(arr,right,k);
        return arr;
    }
    public static int patrition(int [] arr ,int left, int right,int key)
    {
        // doi cho 2 phan tu 
        while(left <= right)
        {
            // voi left , di tim phan tu >= key de doi cho
            while(arr[left] < key) left ++;
            // voi right di tim phan <= key de doi cho 
            while(arr[right] > key) right --;
            if(left < right)
            {
                int swap = arr[left];
                arr[left] = arr[right];
                arr[right] = swap;
                left ++ ; right --;
            }
        }
        return left;
    }
    public static void main(String[] args) throws Exception {
       int [] a = {6,7,8,2};
       quickSort(a,0,a.length-1);
       System.out.println(Arrays.toString(a));
    }
}
