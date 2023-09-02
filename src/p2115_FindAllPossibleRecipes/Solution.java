package p2115_FindAllPossibleRecipes;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Not Solved");

	}
	
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
    	List<String> answer = new ArrayList<>();
    	
    	Map<String, Boolean> supplyMap = new HashMap<>();
    	for (String supply : supplies) {
    		supplyMap.put(supply, true);
    	}
    	
    	for (int i = 0; i < recipes.length; i++) {
    		
    		boolean isAvailable = true;
    		for (String ingredient : ingredients.get(i)) {
    			if (!supplyMap.containsKey(ingredient)) {
    				isAvailable = false;
    				break;
    			}
    		}
    		if (isAvailable) {
    			supplyMap.put(recipes[i], true);
    		}
    	}
    	
    	for (int i = 0; i < recipes.length; i++) {
    		
    		boolean isAvailable = true;
    		for (String ingredient : ingredients.get(i)) {
    			if (!supplyMap.containsKey(ingredient)) {
    				isAvailable = false;
    				break;
    			}
    		}
    		if (isAvailable) {
    			answer.add(recipes[i]);
    		}
    	}
    	
    	Set<String> keyset = supplyMap.keySet();
    	
    	return answer;
    }
}
