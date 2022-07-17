public class App {
    public boolean isPalindrome(int x) {
        if(x == 0)
     {
      return true;
     }
     
     if(x < 0 || x % 10 == 0)
     {
          return false;
     }
     int reversed_int = 0;
     while(x > reversed_int)
     {
          // chia het(%) cho 10 lay so cuoi 
          int pop = x % 10;
          x /= 10;

          reversed_int = (reversed_int * 10) + pop;
     }
     // neu la 2 so thi se ra bang nhau 
     if(x == reversed_int || x == reversed_int/10)
     {
      return true;
     }

     return false;
  }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
