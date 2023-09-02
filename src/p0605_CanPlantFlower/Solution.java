package p0605_CanPlantFlower;

public class Solution {

	public static void main(String[] args) {
		int[] fbed = {1, 0, 0, 0, 0, 1};
		
		System.out.println(canPlaceFlowers(fbed, 2));
		
	}
	
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    	
    	int[] fb = flowerbed;
    	int flowers = n;
    	
    	return plantFlower(fb, flowers);
    }
    
    public static boolean plantFlower(int[] fbed, int flowers) {
    	if (flowers == 0) {
    		return true;
    	}
    	
    	int space = 1; 
    	int length = fbed.length;
    	
    	for (int i = 0; i < length; i++) {
    		if (fbed[i] == 0) {
    			space++;
    		}
    		else {
    			space = 0;
    		}
    		if (space == 3) {
    			fbed[i-1] = 1;
    			return plantFlower(fbed, flowers-1);
    		}
    	}
    	if (space == 2) {
    		fbed[length-1] = 1;
			return plantFlower(fbed, flowers-1);
    	}
    	return false;
    }
    	
    	
    	
//    	for (int i = 0; i < flowerbed.length; i++) {
//    		if (flowerbed[i] == 0) {
//    			space++;
//    		}
//    		else {
//    			space = 0;
//    		}
//    		if (space ==  + 2) {
//    			return true;
//    		}
//    	}
//    	
//    	if (space == + 1) {
//    		return true;
//    	}
//    	else {
//    		return false;
//    	}
    
}
