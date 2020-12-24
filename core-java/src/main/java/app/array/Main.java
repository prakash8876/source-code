package app.array;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.DoubleStream;

public class Main {
	public static void main(String[] args) {
		double[] arr = new double[5];
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			arr[i] = random.nextDouble() * 1000.00d;
		}
		
		for (double value : arr) {
			System.out.println(value); 
		}
		
		double total = DoubleStream.of(arr).sum();
		OptionalDouble average = DoubleStream.of(arr).average();
		
		System.out.println("Total : " + total);
		System.out.println("Average : " + average.orElse(0));
	}
}
