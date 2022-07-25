public class App {
    public static void main(String[] args) throws Exception {
        HashSet hashSet = new HashSet();
        hashSet.addValue(1);
        hashSet.addValue(2);
        hashSet.removeValue(1);
        System.out.println("contain " + hashSet.contains(1));
        
    }
}
