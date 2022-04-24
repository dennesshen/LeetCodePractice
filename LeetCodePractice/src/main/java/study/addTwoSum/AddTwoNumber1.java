package study.addTwoSum;

 
public class AddTwoNumber1 {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	       ListNode result = new ListNode();
	       int carryMemory = 0; 
	       
	       do {
	    	   int x = (l1 == null)? 0 : l1.val;
	           int y = (l2 == null)? 0 : l2.val;
	           ListNode shellListNode = findListNodeLastPoint(result);
	    	   shellListNode.val = (x + y + carryMemory) % 10 ;
	           carryMemory = (x + y + carryMemory) / 10;
	    	   l1 = (l1 == null)? l1 : l1.next;
	    	   l2 = (l2 == null)? l2 : l2.next;
	           
	           if(l1 != null || l2 != null || carryMemory != 0) {
	           shellListNode.next = new ListNode();
	           }
	       }while(l1 != null || l2 != null || carryMemory != 0);
	       
	           
	       return result;
	    }
	    
	    public ListNode findListNodeLastPoint(ListNode ls) {
	    	ListNode listNode = ls;
	    	while (listNode.next != null) {
				listNode = listNode.next;
			}
	    	return listNode;
	    }
}