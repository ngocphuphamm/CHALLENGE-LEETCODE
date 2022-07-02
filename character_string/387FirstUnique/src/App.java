public class App {
    public static int firstUniqChar(String s) {
        int [] countArray = new int [125];
        for(var i = 0; i < s.length(); i++) {
            int ascii = (int)s.charAt(i);
            countArray[ascii] += 1 ;
        }   
        for(var i = 0; i < s.length(); i++) {
            int ascii = (int)s.charAt(i);
            if(countArray[ascii] == 1)
            {
                
                return i ;
            }
        }
        return -1;   
    }
    public static void main(String[] args) throws Exception {
        String n = "loveleetcode";
        int number = firstUniqChar(n);
        System.out.println(number);
    }
}
