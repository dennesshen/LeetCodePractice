package study.addTwoSum;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class AddTwoNumber2 {
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode result = new ListNode();
       ListNode continueListNode = result;
       int carryMemory = 0; 
       
       while(l1 != null || l2 != null || carryMemory != 0) {
    	   int addition = carryMemory;
    	   if (l1 != null) {
    		   addition += l1.val;
    		   l1 = l1.next;
    	   }
    	   if (l2 != null) {
    		   addition += l2.val;
    		   l2 = l1.next;
    	   }
    	   carryMemory = addition / 10;
    	   continueListNode.next = new ListNode(addition%10); 
    	   continueListNode = continueListNode.next;
       }
 
       return result.next;
    }
}