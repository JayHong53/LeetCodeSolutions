package p2300_SuccessfulPairOfSpellsAndPotions;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
    	
    	int[] successful = new int[spells.length];

    	Arrays.sort(potions);
    	
    	
    	for (int i = 0; i < spells.length; i++) {
    		
    		for (int j = 0; j < potions.length; j++) {
    			if (spells[i] * potions[j] >= success) {
    				successful[i] = potions.length - j;
    				break;
    			}
    			successful[i] = 0;
    		}
    	}	
    	
    	return successful;
    }

}
