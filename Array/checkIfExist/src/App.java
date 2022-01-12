public class App {
    public boolean checkIfExist(int[] arr) {
   
        for(int i = 0 ; i < arr.length ;  i ++)
        {
            for(int j = i+1 ; j < arr.length ;  j ++)
            {
                if((arr[j]*2)==arr[i] || (arr[i]*2)==arr[j])
                {
                    return true; 
                }
               
            }
           
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
