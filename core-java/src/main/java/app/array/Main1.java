package app.array;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("How many values to add (1 to 20)");
			int size = sc.nextInt();
			if (size >= 1 && size <= 20) {
				System.out.println("Enter values " + size + " times");
				int[] arr= new int[size];
				for (int i = 0; i < size; i++) {
					arr[i] = sc.nextInt();
				}
				
				for (int value : arr) 
					System.out.println(value);
			} else {
				System.out.println("Size must be between 1 to 20");
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	
}
