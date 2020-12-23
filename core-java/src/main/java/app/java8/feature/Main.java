package app.java8.feature;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.DoubleStream;

/**
 * Program to use Java 8 features
 * Optional, OptionalDouble 
 * stream api
 * varargs
 * try with resource
 */
class Main {
	
//	varargs
	private static double getAverage(double ...args) {
//		OptionalDouble Class
//		DoubleStream
		OptionalDouble result = DoubleStream.of(args).average();
		return result.orElse(0);
	}
	
//	varargs
	private static double getTotal(double ...args) {
//		Optional Class
		Optional<Double> total = Optional.of(DoubleStream.of(args).sum());
		return total.get();
	}
	
	public static void main(String[] args) {
		
//		try-with-resource
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter 4 digit values");
			
			double score1 = sc.nextDouble();
			double score2 = sc.nextDouble();
			double score3 = sc.nextDouble();
			double score4 = sc.nextDouble();
			
//			calling varargs
			double total = getTotal(score1, score2, score3, score4);
			double average = getAverage(score1, score2, score3, score4);
			
			System.out.println("Total : " + total);
			System.out.println("Average : " + average);
			
		} catch (InputMismatchException ex) {
			System.out.println("Enter proper digits only.");
		}
	}

}
