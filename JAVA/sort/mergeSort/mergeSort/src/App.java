import java.util.Arrays;

public class App {
//https://leetcode.com/problems/sort-an-array/
    public static int [] functionMergeSort( int [] arr1 , int [] arr2)
    {
        // arr 1 va arr2 la cac mang duoc sap xep
        int n = arr1.length + arr2.length;
        int [] arr =  new int [n];
        int i  = 0 ,  iArr1 = 0 ,  jArr2 = 0;
        while (i < n) {
            if(iArr1 < arr1.length && jArr2 < arr2.length) { // a1 && a2 khac rong 
                if(arr2[jArr2] >= arr1[iArr1]) // a1 nho hon
                {
                    arr[i] = arr1[iArr1];
                    i++;
                    iArr1++;
                }
                else if(arr1[iArr1] > arr2[jArr2]) // a2 nho hon 
                {
                    arr[i] = arr2[jArr2];
                    i++;
                    jArr2++;
                }
            }
            else // a1 or a2 khac rong
            {
                if(iArr1 < arr1.length) // a1 khac rong
                {
                    arr[i] = arr1[iArr1];
                    i++;
                    iArr1++;  
                }
                else
                { // a2 khac rong 

                    arr[i] = arr2[jArr2];
                    i++;
                    jArr2++;
                }
            }
        }
        return arr;
    }
    public static int []  mergeSort(int arr [] ,int  left ,int right )
    {
        // bai toan co so
        // truong hop dac biet
        if(left > right)
            return new int [0];
        if(arr[left] == arr[right])
        {
            int  [] singleArray = {arr[left]};
            return singleArray;
        }

        // chia ra
        System.out.println("Chia : " + left + "-" + right);
        int mid = (left + right)/2;
        int [] a1 = mergeSort(arr,left,mid);
        int [] a2 = mergeSort(arr,mid+1,right);

        // tron vao
        int [] result = functionMergeSort(a1,a2);
        System.out.println("Ket qua merge" + Arrays.toString(result));
        return result;
    }
    public static int [] resultMergeSort(int arr[])
    {
        return mergeSort(arr,0,arr.length-1);
    }
    public static void main(String[] args) throws Exception {
        int [] c = {1,5,3,2,8,7,6,4};
        System.out.println(Arrays.toString(resultMergeSort(c)));
    }
}
