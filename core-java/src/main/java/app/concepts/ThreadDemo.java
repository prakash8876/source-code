package app.concepts;

public class ThreadDemo extends Thread {
	
	public ThreadDemo(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("ThreadDemo.run() : " + this.getName());
	}
}
