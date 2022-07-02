public class App {
    public static void main(String[] args) throws Exception {
        int[] number = new int[]{1,22,3}; 
        FunctionExcute function = new FunctionExcute(number);
        int count = function.excuteCountEvenNumber();
        System.out.println(count);
 
    }
}
