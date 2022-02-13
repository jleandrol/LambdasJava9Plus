package com;

import java.util.List;

public class FP01LAO {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

/*		int t = numbers.stream().reduce(0, FP01LAO::soma );
		System.out.println("total =" + t);*/

		int u = numbers.stream().reduce(0, (x,y) -> x+y );
		System.out.println("total =" + u);

	}

	private static int soma(Integer a,Integer b ) {
		return a+b;
	}

	private static void print(Integer number) {
		System.out.println(number);
	}
}
