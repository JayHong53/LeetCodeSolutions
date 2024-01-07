package p2130_MaximumTwinSumOfALinkedList;

import java.util.*;

public class Solution {
	public static void main(String[] args) {				
		int[] arr = {1, 5, 2, 3, 10, 2};
		ListNode head = ListNode.buildLinkedList(arr);
		ListNode.printList(head);
		
		System.out.println(pairSum(head));
	}
	
    public static int pairSum(ListNode head) {
    	if (head.next.next == null) {
    		return head.val + head.next.val;
    	} 
    	
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
    	int index = 0;
    	int max = Integer.MIN_VALUE;
    
    	while (head != null) {
    		map.put(index, head.val);
    		head = head.next;
    		
    		if (head != null) {
    			index++;    			
    		}
    	}
    	
    	for (int i = 0; i <= index / 2; i++) {
    		int sum = map.get(i) + map.get(index - i);
    		max = Math.max(sum, max);
    	}
    	
    	return max;
    }

}
