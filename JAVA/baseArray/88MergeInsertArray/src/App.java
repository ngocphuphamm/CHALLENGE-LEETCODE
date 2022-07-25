// https://leetcode.com/problems/merge-sorted-array/
public class App {

    public static void main(String[] args) throws Exception {
        int [] n1 = new int [] {1,2,3,0,0,0};
        int [] n2 = new int [] {2,5,6};

        MergeSortedArray merge = new MergeSortedArray(n1,3,n2,3);
        merge.methodExcute();
    }
}
