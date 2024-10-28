package programming;

import java.util.stream.IntStream;

public class FP05Threads {

	public static void main(String[] args) {
		Runnable runnable2 = () -> {
			IntStream.range(0, 10000).forEach(i ->
				System.out.println(Thread.currentThread().getId() + ":" + i)
					);
			
		};
		
		Thread myThread1 = new Thread(runnable2);
		myThread1.start();
		
		Thread myThread2 = new Thread(runnable2);
		myThread2.start();
		
		Thread myThread3 = new Thread(runnable2);
		myThread3.start();
	}

}
