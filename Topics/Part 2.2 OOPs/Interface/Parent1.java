package Interface;

public interface Parent1 {
	public abstract void m1();

	default void m2() {
		System.out.println("Default 1 Method");
	}

}
