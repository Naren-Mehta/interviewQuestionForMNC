package zebra;

import java.util.stream.IntStream;

public class SumOfNaturalNumber {

	public static void main(String[] args) {

		// Sum of 1000 number via java 8
		long l=IntStream.rangeClosed(1, 5).sum();
		System.out.println(l);
	}

}
