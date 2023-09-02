package p2215_FindTheDifferenceOfTwoArrays;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    
	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
		
		HashMap<Integer, Integer> commonInt = new HashMap<>();
		
		for (int i : nums1) {
			commonInt.put(i, 1);
		}
		
		for (int i: nums2) {
			if (commonInt.containsKey(i) && commonInt.get(i) == 1) {
				commonInt.put(i, 3);
			}
			else if (!commonInt.containsKey(i)){
				commonInt.put(i, 2);
			}
			else if (commonInt.containsKey(i) && commonInt.get(i) == 2) {
				commonInt.put(i, 2);
			}
		}
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<List<Integer>> answer = new ArrayList<>();
	
		Set<Integer> keyset = commonInt.keySet();
		
		for (int i : keyset) {
			if (commonInt.get(i) == 1) {
				list1.add(i);
			}
			else if (commonInt.get(i) == 2) {
				list2.add(i);
			} 
		}
		
		answer.add(list1);
		answer.add(list2);
		
		
		return answer;
    }

}
