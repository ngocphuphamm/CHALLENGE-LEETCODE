public class App {
    //https://leetcode.com/problems/implement-strstr/
    // 5 - 4
    // 1
    public int strStr(String haystack, String needle) {
        int currIndex = -1 ;
       if(haystack == null || needle == null)
       {
           return currIndex;
       }   
       if(haystack.equals(needle))
       {
           return 0;
       }
       int needleLength = needle.length();
       for(int i = 0; i < haystack.length() - needleLength + 1; i++)
       {
    // Check if the substring equals to the needle
           if (haystack.substring(i, i + needleLength).equals(needle)) {
               return i;
           }
       }
       return currIndex; 
   }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
