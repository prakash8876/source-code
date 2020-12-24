package app.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


/**
 * Program to find player name 
 * who have highest points in Bowling game
 * Using collection api
 */
public class Bowling {
	
	// map
	Map<String , Integer> players;
	
	public Bowling() {
		players = new HashMap<String, Integer>();
	}
	
	public void addPlayer(String name, int points) {
		// adding into hashmap
		players.put(name, points);
	}
	
	public void getWinner() {
//		finding max points
		int max = 0;
		for (int points : players.values()) {
//			using Math class, easy to understand operation
			max = Math.max(max, points);
			
//			or we can use if
//			if (max < points)
//				max = points;
			
//			or ternary operator
//			max = (max <= points) ? points : max;
//				Math.max() internally uses ternary operator
	//			@HotSpotIntrinsicCandidate
	//		    public static int max(int a, int b) {
	//		        return (a >= b) ? a : b;
	//		    }
		}
		
//		getting key of value
		for (Entry<String, Integer> entry : players.entrySet()) {
			if (entry.getValue() == max) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
	
}
