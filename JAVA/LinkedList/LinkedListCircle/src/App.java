public class App {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public boolean hasCycle(ListNode head) {
            if (head.next == null && head == null) {
                return false;
            } else {
                ListNode slow = head;
                ListNode fast = head.next;
                // duyệt liên túc đến khi cái slow duyệt tới null
                // thì không phải là 1 dãy cycle
                // đảm bảo slow phải chạy đúng 1 bước

                // cứ mỗi bước nhảy của slow thì  thì ta cho fast chạy 2 bước  = n bước nhảy 
                int step_MAX = 2;
                while (slow != null) {
                    int count = 0;
                    while (fast != null) {
                        // kiểm tra  fast và slow có trỏ  đến cùng 1 thời điểm hay không cần
                        if(fast == slow )
                        {
                            // tạo cycle 
                            return true; 
                        }
                        fast = fast.next;
                        count++;
                        // cho nó chạy tới 2 thì phải break chạy tiếp slow

                        if (count == step_MAX) {
                            break;
                        }
                    }
                    slow = slow.next;

                }
                // nếu slow nó nhảy ra ngoài thì nó ko phải là cycle linkedlist
                return false;
            }

        }

        public static void main(String[] args) throws Exception {
            System.out.println("Hello, World!");
        }
    }
}
