package p0039_CombinationSum;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int[] candidates = {2, 3, 5, 8};
		int target = 8;
		
		
		var solution = combinationSum(candidates, target);
		displaySolution(solution);

	}
	
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    
    	
    	return null;
    }
    
    public static void displaySolution(List<List<Integer>> solutions) {
    	
    	if (solutions == null) {
    		System.out.println("--null--");
    	}
    	
    	else {
    		for(List<Integer> solution : solutions) {
    			System.out.print("Solution: [ ");
    			for(int i : solution) {
    				System.out.print(i + " ");
    			}
    			System.out.print(" ]");
    			System.out.println();
    		}    		
    	}
    }


}
