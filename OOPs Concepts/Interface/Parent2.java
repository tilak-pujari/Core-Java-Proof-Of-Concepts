package Interface;

public interface Parent2 extends Parent1 {

	@Override
	default void m2() {
		System.out.println("Default from Second Parent");
	}

	public static void m3() {
		System.out.println("Parent 2 M-3 Method");
	}
}