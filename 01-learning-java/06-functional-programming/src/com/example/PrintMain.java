package com.example;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class PrintMain {

	public static void main(String[] args) {
		//Java OOPS programming way
		Greeting greeting = new HelloGreeting();
		
		greeting.sayHello();
		
		Greeting greeting2 = new Greeting() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello, World V2!!!");
			}
		};
		
		greeting2.sayHello();
		
		Greeting greeting3 = () -> System.out.println("Hello, World V3");
		
		greeting3.sayHello();
		
		IntBinaryOperator logicCalculate = (int x, int y) -> {
			Random rand = new Random();
			int randInt = rand.nextInt(50);
			
			return (x * y) + randInt;
		};
		
		System.out.println(logicCalculate.applyAsInt(1, 2));
	}
}
