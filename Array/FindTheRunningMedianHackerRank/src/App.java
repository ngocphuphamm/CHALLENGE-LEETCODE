import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/* https://www.hackerrank.com/challenges/find-the-running-median/problem */
public class App {
    public static List<Double> runningMedian(List<Integer> a) {
        List<Double> result = new ArrayList<>();
        Queue<Integer> heapMax = new PriorityQueue<>();
        Queue<Integer> heapMin = new PriorityQueue<>(Comparator.reverseOrder());
        result.add(a.get(0) * 1.0);
        heapMax.add(a.get(0));
        for(int i = 1; i < a.size(); i++) 
        {
            if(heapMax.size() > heapMin.size())
            {
                heapMax.add(a.get(i)); 
            }   
            else
            {
                heapMin.add(a.get(i)); 
            }
            // validate
            while(heapMax.peek() > heapMin.peek())
            {
                int big = heapMax.poll();
                int small = heapMin.poll();
                
                heapMax.add(small);
                heapMin.add(big);
            }

            if(heapMax.size() > heapMin.size())
            {
                result.add(heapMax.peek() * 1.0);
            }   
            else
            {
                result.add((heapMax.peek() + heapMin.peek())/2.0);

            }
        }
        return result ;
     }
     
     public static void swap(int a , int b )
     {
            int swap = b;
            b  = a;
            a = b;
        
     }
    

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
