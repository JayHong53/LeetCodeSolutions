package p1657_DetermineIfTwoStringsAreClose;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word1 = "cabbba", word2 = "abbccc";
		System.out.println(closeStrings(word1, word2));

	}
	
	
    public static boolean closeStrings(String word1, String word2) {    	
    	if (word1.length() != word2.length()) {
    		return false;
    	}
    	
    	HashMap<Character, Integer> map1 = new HashMap<>();
    	HashMap<Character, Integer> map2 = new HashMap<>();
    	
    	for (int i = 0; i < word1.length(); i++) {
    		map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
    		map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
    	}
    	
    	Set<Character> keyset1 = map1.keySet();
    	Set<Character> keyset2 = map2.keySet();
    	
    	if (keyset1.size() != keyset2.size()) {
    		return false;
    	}
    	
    	HashMap<Integer, Integer> countMap = new HashMap<>();
    	
    	for (char c : keyset1) {
    		countMap.put(map1.get(c), countMap.getOrDefault(map1.get(c), 0) + 1); 
    	}
    	
    	for (char c: keyset2) {
    		if (countMap.get(map2.get(c)) > 0) {
    			countMap.put(map2.get(c), countMap.get(map2.get(c)) - 1);
    		}
    		else {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    public static boolean closeStrings2(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i = 0 ; i < word1.length() ; i++){
            map.put(word1.charAt(i), map.getOrDefault(word1.charAt(i), 0)+1);
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0)+1);
        }        
        for(int j= 0 ; j < word2.length() ;j++ ){
            if(!map.containsKey(word2.charAt(j))){
                return false;
            }
            if(!map2.containsKey(word1.charAt(j))){
                return false;
            }
        }
        ArrayList<Integer> list1 = new  ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            list1.add(entry.getValue());
        }
        for(Map.Entry<Character,Integer> entry : map2.entrySet()){
            list2.add(entry.getValue());
        }
                                                                 
        Collections.sort(list1);
        Collections.sort(list2);
                                                                 
        return list1.equals(list2); 
    }
}
