package s0001_LinkedListStudy;

public class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) {
		this.val = val;
	}
	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
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
