package p0118_PascalsTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<List<Integer>> list = new ArrayList<>();
        int[] row1 = {1};
        int[] row2 = {1, 1};
        int[] row3 = {1, 2, 1};
        int[] row4 = {1, 3, 3, 1};
        int[] row5 = {1, 4, 6, 4, 1};
        
        // Correct way to add int[] to List<List<Integer>>
        list.add(Arrays.stream(row1).boxed().collect(Collectors.toList()));
        list.add(Arrays.stream(row2).boxed().collect(Collectors.toList()));
        list.add(Arrays.stream(row3).boxed().collect(Collectors.toList()));
        list.add(Arrays.stream(row4).boxed().collect(Collectors.toList()));
        list.add(Arrays.stream(row5).boxed().collect(Collectors.toList()));
		
		displayPascalsTriangle(list); 
	}
	
    public static List<List<Integer>> generate(int numRows) {
    	List<Integer> prev = new ArrayList<>();
    	prev.add(1);
    	
    	for (int i = 0; i < numRows; i++) {
    		
    	}
    	return null;
    }
    
    public static void displayPascalsTriangle(List<List<Integer>> list) {
    	
    	int indent = list.size() / 2;
    	
    	for (int i = 0; i < list.size(); i++) {
    		String prefix = " ";
    		
    		for (int pre = 0; pre < indent; pre++) {
    			prefix = prefix.concat(prefix);
    		}
    		
    		System.out.print(prefix);
    		for (int e : list.get(i)) {
    			System.out.print(e + " ");
    		}
    		System.out.println();
    	}
    }
}
