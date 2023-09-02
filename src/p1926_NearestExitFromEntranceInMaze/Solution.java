package p1926_NearestExitFromEntranceInMaze;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] maze = {{'.'}};
		
		System.out.println(isWay(maze, 0, 0));

	}
	
    public static int nearestExit(char[][] maze, int[] entrance) {
    	int steps = 0;
    	
    	
    	return steps;
    }
    
    public static boolean isWay(char[][] maze, int x, int y) {    	    	
    	return (maze[x][y] == '.');
    }  
}
