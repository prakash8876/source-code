package app.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bowling {
	
	Map<String , Integer> players;
	
	public Bowling() {
		players = new HashMap<String, Integer>();
	}
	
	public void addPlayer(String name, int points) {
		players.put(name, points);
	}
	
	public void getWinner() {
		int max = 0;
		for (int points : players.values()) {
			max = Math.max(max, points);
		}
		
//		System.out.println(players.get(max).toString());
		for (Entry<String, Integer> entry : players.entrySet()) {
			if (entry.getValue() == max)
				System.out.println(entry.getKey());
		}
	}
	
}
