package p1137_NthTribonacciNo;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(tribonacci(5));

	}
	
	public static int tribonacci(int n) {
		if (n == 0) {
			return 0;
		}
		
		if (n == 1 || n == 2) {
			return 1;
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 0);
		map.put(1, 1);
		map.put(2, 1);
		return calcTribonacci(n, map);
	}
	
	public static int calcTribonacci(int n, HashMap<Integer, Integer> map) {
		if (map.containsKey(n)) {
			return map.get(n);
		}
		
		int answer = map.get(n-3) + map.get(n-2) + map.get(n-1);
		map.put(n, answer);
		return calcTribonacci(n-1, map);
	} 

}
