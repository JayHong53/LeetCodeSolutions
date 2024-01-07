package p2095_DeleteTheMiddleNodeOfALinkedList;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 2, 3, 4};
//		int[] arr2 = {1, 2, 3, 4, 5};
//		int[] arr3 = {1, 3, 7, 5, 2, 4, 5};
		ListNode head = buildLinkedList(arr1);

        printList(head);
        head = deleteMiddle(head);
        printList(head);
	}
	
	public static ListNode deleteMiddle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		
		ListNode fast = head;
		ListNode slow = head;
		ListNode prev = null;
		
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow; 
			slow = slow.next;
		}
		
		prev.next = slow.next;
		
		return head;
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
