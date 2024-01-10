package p0649_Dota2Senate;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(predictPartyVictory("RDD"));
	}
	
     public static String predictPartyVictory(String senate) {
         int n = senate.length();
         Queue<Integer> r = new LinkedList<>();
         Queue<Integer> d = new LinkedList<>();
         for(int i = 0; i < n; i++){
             if(senate.charAt(i) == 'R') r.offer(i);
             else d.offer(i);
         }
         while(!r.isEmpty() && !d.isEmpty()){
             if(r.peek() < d.peek()){
                 d.poll();
                 r.offer(r.peek() + n);
                 r.poll();
             }else{
                 r.poll();
                 d.offer(d.peek() + n);
                 d.poll();
             }
         }
         if(r.isEmpty()) return "Dire";
         else return "Radiant";
     }
}
