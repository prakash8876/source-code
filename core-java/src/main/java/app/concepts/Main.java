package app.concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends World {

	private int valueMain;

	public Main() {
		valueMain = 123;
	}

	public int getValueMain() {
		return valueMain;
	}

	public void setValueMain(int value) {
		valueMain = value;
	}

	static {
		System.out.println("Main.static block");
	}

	{
		System.out.println("Main.non-static block");
	}

	private void getAverage() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\n\tEnter 4 double values");
			double d1 = sc.nextDouble();
			double d2 = sc.nextDouble();
			double d3 = sc.nextDouble();
			double d4 = sc.nextDouble();

			FindAverage.getAverage(d1, d2, d3, d4);

			System.out.println("\n\tEnter 4 int values");
			int i1 = sc.nextInt();
			int i2 = sc.nextInt();
			int i3 = sc.nextInt();
			int i4 = sc.nextInt();
			
			FindAverage.getAverage(i1, i2, i3, i4);
		} catch (InputMismatchException | ShowException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Main.hello()");
	}

	@Override
	void methodFour() {
		// TODO Auto-generated method stub
		System.out.println("Main.methodFour()");
	}
	
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo("my thread");
		t1.start();
		
		Main obj = new Main();
		System.out.println("value : " + obj.valueMain);
		System.out.println("Change value : ");
		obj.setValueMain(234);
		System.out.println("value now : " + obj.getValueMain());
		
		System.out.println("Value of World " + obj.valueWorld);
		System.out.println("Value of Hello " + valueHello);
		
		obj.methodFour();
		obj.hello();
		obj.methodThree();
		obj.methodTwo();
		Hello.methodOne();
		obj.getAverage();
		
		FinalClass.showMessage();
		
	}

}
