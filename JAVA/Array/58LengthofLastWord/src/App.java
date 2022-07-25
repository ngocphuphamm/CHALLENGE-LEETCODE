public class App {
    // https://leetcode.com/problems/length-of-last-word/
    public static int lengthOfLastWord(String s) {
        s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        return s.length();
    }

    public static int strStr(String haystack, String needle) {
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
        for(int i = 0; i < needleLength + 1; i++)
        {
            if(haystack.substring(i,i + needleLength).equals(needle))
            {
                return currIndex = i;
            }
        
        }
        return currIndex;
    }
    public static void main(String[] args) throws Exception {
        String s = "hello";
        String needle = "ll";
        int a = strStr(s, needle);
        System.out.println(a);
    }
}
