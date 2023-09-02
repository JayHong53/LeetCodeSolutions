package p1535_FindWinnerOfArrayGame;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		int[] arr = {5, 1, 2, 3, 7};
		
		System.out.println(getWinner(arr, 2));

	}
	
    public static int getWinner(int[] arr, int k) {
    	
    	
    	if (arr.length == 2) {
    		return Math.max(arr[0], arr[1]);
    	}
    	
    	else if (arr.length < k) {
    		int retval = 0;
    		for (int i = 0; i < arr.length; i++) {
    			
    		}
    	}
    	
    	int max = Math.max(k, arr.length);
    	int winCount = 0;
    	
    	while (winCount < k) {
    		if (isWinnerAtFront(arr)) {
    			winCount++;
    			sortArray(arr, true);
    		}
    		else {
    			winCount = 1;
    			sortArray(arr, false);
    		}
    	}
    	
    	return arr[0];
    	
    }
    
    public static boolean isWinnerAtFront(int[] arr) {
    	return arr[0] > arr[1];
    }
    
    public static void sortArray(int[] arr, boolean winnerAtFront) {
    	int winner;
    	int loser;
    	
    	if (winnerAtFront) {
    		winner = arr[0];
    		loser = arr[1];
     	}
    	else {
    		winner = arr[1];
    		loser = arr[0];
    	}
    	
    	for (int i = 1; i < arr.length - 1; i++) {
    		arr[i] = arr[i+1];
    	}
    	
    	arr[0] = winner;
    	arr[arr.length - 1] = loser;
    }
    

}
