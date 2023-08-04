package Abstraction;

public abstract class Ex1Receipe {

	public void execute() {
		ready();
		doTheDish();
		cleanUp();
	}

	abstract public void ready();

	abstract public void doTheDish();

	abstract public void cleanUp();

}
