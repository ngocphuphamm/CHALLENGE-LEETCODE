public class App {
    public static void main(String[] args) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.putValue(1,1);
        hashMap.putValue(1,2);
        System.out.println(hashMap.getKey(1));
        hashMap.removeValue(1);
    }
}
