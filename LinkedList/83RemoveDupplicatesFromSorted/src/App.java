public class App {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }
    public ListNode deleteDuplicates(ListNode head) {
          
            ListNode currNode = head; 
            while( currNode != null && currNode.next != null)
            {
                if(currNode.next.val == currNode.val)
                {
                    // curNode => nodeVal => val
                    // currNode => val
                    currNode.next =  currNode.next.next;
                }
                else
                {
                    // duyet
                    currNode = currNode.next;
                }
            }
            return head;
            
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
