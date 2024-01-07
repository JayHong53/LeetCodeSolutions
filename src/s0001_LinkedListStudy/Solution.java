package s0001_LinkedListStudy;

public class Solution {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ListNode head = buildLinkedList(arr);
		
		printList(head);
        
	}
	
	// Add & Remove First and Last 
	public static ListNode addLastNode(ListNode head, int val) {
		if (head == null) {
			head = new ListNode(val);
		}
		
		else {
			ListNode walk = head;
			while (walk.next != null) {
				walk = walk.next;
			}
			
			walk.next = new ListNode(val);
		}
		
		return head;
	}
	
	public static ListNode addFirstNode(ListNode head, int val) {
		if (head == null) {
			return new ListNode(val);
		}
		
		ListNode newHead = new ListNode(val);
		newHead.next = head;	
		return newHead;
	}
	
	public static ListNode removeLastNode(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		
		ListNode walk = head;
		while (walk.next.next != null) {
			walk = walk.next;
		}
		walk.next = null;
		return head;
	}
	
	public static ListNode removeFirstNode(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		return head.next;
	}
	
	
	
	
	// helper functions 
	public static ListNode buildLinkedList(int[] arr) {
		if (arr.length == 0) {
			return null;
		} 
		else if (arr.length == 1) {
			return new ListNode(arr[0]);
		}
		else {
			ListNode prehead = new ListNode(-1);
			ListNode walk = prehead;
			
			for (int i : arr) {
				ListNode newNode = new ListNode(i);
				walk.next = newNode;
				walk = newNode;
			}
			return prehead.next;
		}	
	}
	
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


}
