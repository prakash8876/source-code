package app.concepts;

public abstract class World implements Hello {
	public double valueWorld = 234.45;
	
	public World() {
		super();
		System.out.println("World constructor");
	}
	
	public void methodThree() {
		System.out.println("World.methodThree()");
	}
	
	abstract void methodFour();
	
}
