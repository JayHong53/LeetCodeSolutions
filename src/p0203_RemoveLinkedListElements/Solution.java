package p0203_RemoveLinkedListElements;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
    public static ListNode removeElements(ListNode head, int val) {    
        if (head == null) {
        	return null;        	
        }
        
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    	
    }

}
