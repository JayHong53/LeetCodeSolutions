package p0206_ReverseLinkedList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		ListNode head = ListNode.buildLinkedList(arr);
		ListNode.printList(head);
		head = reverseList(head);
		ListNode.printList(head);
	}
	
	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode newHead = null;
		while (head != null) {
			ListNode temp = head;
			head = head.next;
			
			temp.next = newHead;
			newHead = temp;
		}
		
		return newHead;
	}
}
