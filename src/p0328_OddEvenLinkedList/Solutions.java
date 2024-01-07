package p0328_OddEvenLinkedList;

public class Solutions {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		
		ListNode head = ListNode.buildLinkedList(arr);
		
		ListNode.printList(head);
		
		head = oddEvenList(head);
			
		ListNode.printList(head);
		
		
	}
	
    public static ListNode oddEvenList(ListNode head) {
    	// if the length is less than 3, no changes needed 
    	if (head == null || head.next == null || head.next.next == null) {
    		return head;
    	}
    	
    	ListNode evenhead= head.next;
    	
    	ListNode oddwalk = head;
    	ListNode evenwalk = head.next;
    	
    	while (evenwalk != null && evenwalk.next != null) { 
    		oddwalk.next = oddwalk.next.next;
    		evenwalk.next = evenwalk.next.next;
    		
    		oddwalk = oddwalk.next;
    		evenwalk = evenwalk.next;
    	}
    	
    	oddwalk.next = evenhead;
    	
    	return head;
    }
}
