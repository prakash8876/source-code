package app.multithreading;

/**
 * We can create custom thread class mainly two ways
 * 1. by extending Thread class
 * 2. by implementing Runnable interface
 * 
 * and 
 * 
 * by using anonymous way
 *
 */

class TDemo extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("extended thread");
	}
}

class RDemo implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implemented thread");
	}
}

public class CustomThread {

	public static void main(String[] args) {

		TDemo thread_1 = new TDemo();
		
		Thread thread_2 = new Thread(new RDemo());

		//		anonymous way
		Thread thread_3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("anonymous thread");
			}
		});

		//		we can change priority
		thread_2.setPriority(Thread.MIN_PRIORITY);
		thread_3.setPriority(Thread.MAX_PRIORITY);
		thread_1.setPriority(Thread.NORM_PRIORITY);

		thread_1.start();
		thread_2.start();
		thread_3.start();

	}

}
