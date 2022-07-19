public class App {
    //https://leetcode.com/problems/length-of-last-word/
    public static int lengthOfLastWord(String s) {
        int currIndex = -1 ;
        String x = s.trim();
        System.out.println(x);
        for(int i = 0; i < x.length(); i++)
        {
            if (x.charAt(i) == ' ')
             currIndex = 0;
            else
            currIndex++;
        }
        return currIndex;
    }
    public static void main(String[] args) throws Exception {
        String s = "Hello World";
        int a = lengthOfLastWord(s);
        System.out.println(a);
    }
}
