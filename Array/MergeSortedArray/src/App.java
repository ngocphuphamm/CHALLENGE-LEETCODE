import javax.lang.model.util.ElementScanner14;
//https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
public class App {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         // khai báo độ dài của 2 mảng  tham số 
         int  i =  nums1.length;  
         int j = nums2.length; 
         // tổng hợp của 2 mảng 
         int k = nums1.length + nums2.length -1 ;
         
         // duyệt mảng từ phải sang trái  
         // nếu mà i > -1  j >  -1 mới được quyền duyệt mảng 
        while(i >= 0||j >=0 )
        {
            //TH1 : CẢ  I VÀ  J CẢ 2 ĐẾU HỢP LỆ 
            if(i >= 0 && j >=0 )
            {
                // phần tử thằng nào lón hơn add thằng đó vào mảng 
                // ưu tiên lấy phần tử ở i 
                if(nums1[i]>=nums2[j] )
                {
                    nums1[k]=nums1[i];    
                    // sau  khi hoán đổi xong  giảm vị trí xuống đơn vị 
                    i--;
                    k--;   
                }
                else
                // tương tự 
                {
                    nums1[k]= nums2[j];
                    j--; k--; 
                }
               
                
            }
            // chỉ có i hợp lệ 
            else if(i >=0 )
            {
                nums1[k]=nums1[i];    
                // sau  khi hoán đổi xong  giảm vị trí xuống đơn vị 
                i--;
                k--;   
            }
            else 
            {
                nums1[k]= nums2[j];
                j--; k--; 
            }
        }
        
    }

 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a [] = {1, 2,3 ,4 ,5 };
        System.out.println(a.length);
    }
}
