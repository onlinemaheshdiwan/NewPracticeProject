package com.mahesh;

import java.util.ArrayList;

public class StreamFilterMethodExample {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(23);
		list.add(9);
		list.add(50);
		list.add(88);
		list.add(48);
		list.add(95);
		list.add(100);
		// for Odd Numbers
		System.out.println("This is Odd Number");
		list.stream().filter((f) -> f % 2 != 0).forEach(x -> System.out.println(x));
		// For Even Numbers
		System.out.println("----------------------------------");
		System.out.println("This is Even Number");
		list.stream().filter((f) -> f % 2 == 0).forEach(x -> System.out.println(x));
	}

}
