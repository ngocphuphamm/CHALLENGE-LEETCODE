https://leetcode.com/problems/merge-two-sorted-lists/
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */

function ListNode(val, next) {
      this.val = (val===undefined ? 0 : val)
      this.next = (next===undefined ? null : next)
  }
  var mergeTwoLists = function(l1, l2) {
    let newList = new ListNode(0);
     let headOfNewList = newList;
    
    while(l1!= null && l2!=null)
        {
            if(l1.val < l2.val)
                {
                    newList.next = l1;
                    l1 = l1.next;
                }
            else 
                {
                    newList.next = l2;
                    l2= l2.next;
                }
            newList = newList.next ;
        }
      // If l1 has run out of elements
    if (l1 == null) {
        // Append l2 to the new list
        newList.next = l2;
    }
    // If l2 has run out of elements
    else {
        // Append l1 to the new list
        newList.next = l1;
    }
    console.log(headOfNewList.next);
    return headOfNewList.next;
};

let list1val1 = new ListNode(1);
let list1val2 = new ListNode(2);
let list1val3 = new ListNode(4);



 list1val1.next = list1val2
list1val2.next = list1val3;

let headNode = list1val1;

while(headNode != null)
{
    console.log(headNode.val);
    headNode = headNode.next;
}
