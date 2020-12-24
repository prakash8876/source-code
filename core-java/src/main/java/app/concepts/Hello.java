package app.concepts;

public interface Hello {
	public static final double valueHello = 98234.234;
	
	public void hello();
	
	public static void methodOne() {
		System.out.println("Hello.methodOne() static ");
	}
	
	public default void methodTwo() {
		System.out.println("Hello.methodTwo() default");
	}
}
