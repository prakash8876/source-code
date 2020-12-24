package app.collection;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Bowling game = new Bowling();
			System.out.println("Enter 3 player name with points");
			for (int i = 0; i < 3; i++) {
				String input = sc.nextLine();
				String[] values = input.split(" ");
				
//				String name = values[0];
//				int points = Integer.parseInt(values[1]);
//				game.addPlayer(name, points);
				
//				or direct assign values
				game.addPlayer(values[0], Integer.parseInt(values[1]));
			}
			
			System.out.println("And winner is ");
			game.getWinner();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
