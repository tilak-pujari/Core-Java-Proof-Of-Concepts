package objectsConstructor;

public class ObjectNonStaticInitializers {
	int a=10;
	{
		System.out.println("Initializer 1");
		System.out.println(a);
		a=20;
	}
	
	{
		System.out.println("Initializer 2");
		System.out.println(a);
	}
	
	{
		System.out.println("Initializer 3");
		int a=30;
		System.out.println(a);
		a=25;//does not load
	}
	
	{
		System.out.println("Initializer 4");
		System.out.println(a);
	}

	public static void main(String[] args) {
		ObjectNonStaticInitializers o=new ObjectNonStaticInitializers();
		System.out.println("Main Method");
	}
	{
		System.out.println("Initializer 5 Outside main method");
	}

}
