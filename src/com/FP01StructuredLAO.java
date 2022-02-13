package com;

import java.util.List;

public class FP01StructuredLAO {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		//commomFor(numbers);

		//numbers.stream().forEach(x ->System.out.println(x));

		//numbers.stream().forEach(FP01StructuredLAO::print);

		//numbers.stream().forEach(System.out::println);

		numbers.stream()
				.map(x -> x*2)
				.forEach(System.out::println);

	    System.out.println("----------");

		numbers.stream().forEach(System.out::println);

	}

	private static void commomFor(List<Integer> numbers) {
		for(int number : numbers){
			print(number);
		}
	}

	private static void print(Integer number) {
		System.out.println(number);
	}
}
