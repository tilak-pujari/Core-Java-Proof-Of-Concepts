package staticInitializers;

public class ClassName {
	static int a;// E1
	static {// E2
		System.out.println("Static Method -1");
		a = 11;
		System.out.println("Global Variable\t\t" + a);
	}
	static {// E3
		System.out.println("Static Method -2");
		System.out.println("Global Variable\t\t" + a);
	}

	public static void main(String[] args) {// E6
		System.out.println("Main Method -1");
		System.out.println("Global Variable\t\t" + a);

	}

	static {// E4
		System.out.println("Static Method -3");
		a = 22;
		System.out.println("Global Variable\t\t" + a);
		int a = 1; // LV
		System.out.println("\tLocal Variable\t" + a);
	}
	static {// E5
		System.out.println("Static Method -4");
		int a = 2; // LV
		System.out.println("\tLocal Variable\t" + a);
		a = 33;// X not Executed/updated
		System.out.println("Global Variable" + a);// X not Executed/updated
	}

}
