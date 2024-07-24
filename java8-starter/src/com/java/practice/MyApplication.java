package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyApplication {

	public MyApplication() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//my imperative style of programming
		long startTime = System.currentTimeMillis();
		int sumI = 0;
		
		for(int index=0; index <= 100; index++) {
			sumI += index;
		}
		
		System.out.println("Total time taken for Sum is "+(System.currentTimeMillis() - startTime));		
		System.out.println("Sum from the Imperative Style of Programming: "+sumI);
		
		//declarative style of programming
		int sumD = 0;
		
		startTime = System.currentTimeMillis();
		sumD = IntStream.rangeClosed(0, 100).parallel().sum();
		
		System.out.println("Total time taken for Sum is "+(System.currentTimeMillis() - startTime));
		System.out.println("Sum from Declarative Style of Programming: "+sumD);
		
		
		/*
		 * Imperative Style
		 * */
		List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 8, 8));
		
		List<Integer> uniqueList = new ArrayList<Integer>();
		for(Integer number: integerList) {
			if(!uniqueList.contains(number)) {
				uniqueList.add(number);
			}
		}
		
		System.out.println("Unique List of Numbers using Imperative Approach: " + uniqueList);
		/*
		 * Declarative Style
		 * */
		List<Integer> uniqueList2 = integerList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Unique List of Numbers using Declarative Approach: " + uniqueList2);
		
	}

}
