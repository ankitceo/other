package com;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		for(int i = 0; i <= 100; i++) {
			myList.add(i);
		}
		
		Stream<Integer> seqStream = myList.stream();
		seqStream.filter(p -> p > 3);
		seqStream.forEach(num -> {
			System.out.println(num);
		});
	}

}
