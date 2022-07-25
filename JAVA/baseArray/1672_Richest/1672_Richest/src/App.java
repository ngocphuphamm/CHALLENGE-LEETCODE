public class App {
    public static int maximumWealth(int[][] a) {
        // so dong la so khach hang
        int soDong = a.length;
        // so cot la so tien cua tung khach hang trong tung ngan hang 
        int soCot = a[0].length;   
        int [] arrTongSoTienKhachHang = new int [soDong];
        for(int i = 0; i < soDong; i++)
        {
            int tongTienKH = 0;
            for(int j = 0; j < soCot; j++)
            {
                tongTienKH += a[i][j];
            }
            arrTongSoTienKhachHang[i] = tongTienKH;
        } 
        int sum = 0 ;
        for(int i = 0; i < arrTongSoTienKhachHang.length; i++)
        {
            if(arrTongSoTienKhachHang[i]>sum)
            {
                sum = arrTongSoTienKhachHang[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) throws Exception {
        int [][] a = { {1,4,3},{3,2,1}};
        int n = maximumWealth(a);
        System.out.println(n);
    }
}
