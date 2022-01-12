public class App {
    public boolean validMountainArray(int[] arr) {
        // dãy đi lên 
        boolean isIncrease = true ; 
        // dãy số phải có ít nhất 3 phần tử 
        if(arr.length < 3 )
        {
            return false ; 
        }
        for (int i = 0 ; i < arr.length  ; i++)
        {
            int j = i +1 ; 
            // dãy đang giảm 
            if(arr[i]>arr[j])
            {
                if(isIncrease == false)
                {
                    // do nothing
                }   
                else //isIncrease == true 
                  // lúc này dãy đang tăng ta chỉ chấp nhận lần đầu tiền nó false mà thôi 
                {
                    // gặp trường hợp ngay ban đầu dãy đang giảm luôn thì không cần xét trường hợp này nữa 
                    // nếu mà 2 phần tử đầu tiên đã giảm r thì ta không cần xet nữa 
                    if(i==0)
                    {
                        return false ; 
                    }
                     isIncrease = false; 
                }
            }
            else if(arr[i] < arr[j]) // dãy tăng 
            {
                if(isIncrease == true )
                {
                    // do nothing 
                }
                else // dãy đang xet là dãy giảm mà tăng lên 
                {
                    return false ; 
                }
            }
            // dãy chỉ tăng và dãy chỉ giảm 
            else
            {
                return false ;
            }
        }
        // kiểm tra dãy đang xét cuôi cùng là một dãy giảm 
        if(isIncrease == false)
        {
            return true; 
        }
        return false ; 
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
