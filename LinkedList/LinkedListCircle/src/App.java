public class App {
     class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
     public boolean hasCycle(ListNode head) {
            if(head.next  == null && head == null)
            {
                return false; 
            }
            else
            {
                ListNode slow  = head ; 
                ListNode fast  = head.next;
                // duyệt liên túc đến khi cái slow duyệt tới null 
                //  thì không phải là 1 dãy cycle 
                // đảm bảo slow phải chạy đúng 1 bước 
                int step_MAX = 2 ; 
                while (slow != null) 
                {
                    int count = 0 ;
                    while(fast != null){
                        fast = fast.next; 
                        count ++ ;
                        // cho nó chạy tới 2  thì phải break chạy tiếp slow 
                        
                        if(count == step_MAX)
                        {
                            break; 
                        }
                    } 
                    slow = slow.next; 

                }
                // nếu slow nó nhảy ra ngoài thì nó ko phải là cycle linkedlist
                return false ;
            }
        
     }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
