package app.concepts;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class FindAverage {

	public static final void getAverage(double... ds) throws ShowException {
		for (double value : ds)
			if (value < 0)
				throw new ShowException("\n\tvalues must be greater than zero".toUpperCase());
		double total = DoubleStream.of(ds).sum();
		OptionalDouble average = DoubleStream.of(ds).average();

		System.out.println("\tTotal : " + total);
		System.out.println("\tAverage : " + average.orElse(0));
	}

	public static final void getAverage(int... is) throws ShowException {
		for (double value : is)
			if (value < 0)
				throw new ShowException("\n\tvalues must be greater than zero".toUpperCase());
		int total = IntStream.of(is).sum();
		OptionalDouble average = IntStream.of(is).average();

		System.out.println("\tTotal : " + total);
		System.out.println("\tAverage : " + average.orElse(0));
	}

}
